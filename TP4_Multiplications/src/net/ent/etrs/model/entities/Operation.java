package net.ent.etrs.model.entities;

import java.util.Objects;

import static net.ent.etrs.model.entities.references.Constante.*;


public class Operation {

    // Attributs
    private static int operande1;
    private static int operande2;
    private final int typOperation;

    // Contructeur(s)

    public Operation(int typOperation) {
        this.typOperation = typOperation;
    }

    public Operation(int typOperation, int operande1, int operande2) {
        this.typOperation = typOperation;
        this.setOperande1(operande1);
        this.setOperande2(operande2);
    }
    // Acesseurs

    public static int getOperande1() {
        return operande1;
    }

    public void setOperande1(int operande1) {
        Operation.operande1 = operande1;
    }

    public static int getOperande2() {
        return operande2;
    }

    public void setOperande2(int operande2) {
        Operation.operande2 = operande2;
    }

    public int getTypOperation() {
        return typOperation;
    }


    // Equals/HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Operation)) return false;
        Operation operation = (Operation) o;
        return getOperande1() == getOperande1() && getOperande2() == getOperande2();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOperande1(), getOperande2());
    }

    // ToString

    @Override
    public String toString() {
        return "Operation{" +
                "operande1=" + operande1 +
                ", operande2=" + operande2 +
                ", typOperation=" + typOperation +
                '}';
    }


    // Autres methodes


    public int operer() {
        int resultat = 0;
        if (this.typOperation == ADDITION) {
            resultat = getOperande1() + getOperande2();
        } else {
            resultat = getOperande1() * getOperande2();
        }
        return resultat;
    }

    public int getRepresentationOperateur() {
        char resultat = ' ';
        if (this.typOperation == ADDITION) {
            resultat = '+';
        } else {
            resultat = 'x';
        }
        return resultat;
    }

}

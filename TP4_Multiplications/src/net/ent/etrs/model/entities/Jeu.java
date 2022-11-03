package net.ent.etrs.model.entities;

import java.io.FileReader;
import java.util.Arrays;
import java.util.ArrayList;

import static net.ent.etrs.model.entities.references.Constante.*;

public class Jeu {

    // Atributs

    // stock la liste des operandes deja proposées pour ne pas proposer plusieurs fois la meme opération
    public static ArrayList<Integer> operandesDejaTires = new ArrayList<>();


    // etat d'avancement du jeu (--x..)
    private static char[] etatAvancement = {'.', '.', '.', '.', '.'};
    // Pour faire la note sur 5 a la fin
    private static int reponse;
    // Compte le nombre d'opérations deja proposées
    private int nbOperation;

    // Constructeur(s)

    public Jeu(int nbOperation) {
        this.nbOperation = nbOperation;
    }


    // Accesseurs

    /**
     * Methode qui retourne un entier aléatoire entre 0 et la constante ENTIER_MAX.
     *
     * @return int
     */
    public static int tirerOperande() {
        return (int) (Math.random() * (ENTIER_MAX + 1));
    }

    // Equals/HashCode


    // ToString

    // Autres methodes

    /**
     * Retourne un entier qui n'a pas deja été proposé.
     *
     * @return int
     */
    public static int tirerOperandeNonTiree() {
        int nombreAleatoire = (int) (Math.random() * (ENTIER_MAX + 1));
        boolean quit = false;
        do {
            if (operandesDejaTires.contains(nombreAleatoire)) {
                nombreAleatoire = (int) (Math.random() * (ENTIER_MAX + 1));
            } else {
                operandesDejaTires.add(nombreAleatoire);
                quit = true;

            }
        } while (!quit);

        return nombreAleatoire;
    }

    public static String formaterEtatAvancement(boolean reponse, int i) {
        if (reponse) {
            etatAvancement[i] = '-';
        } else {
            etatAvancement[i] = 'x';
        }
        return new String(etatAvancement);
    }

    public static String formaterResultat(boolean resultat) {
        if (resultat) {
            reponse += 1;
        }
        return (String.valueOf(reponse));
    }

    public static void reset() {
        reponse = 0;
        etatAvancement = new char[]{'.', '.', '.', '.', '.'};
    }

    public int getOperation() {
        return NB_OPERATION;
    }
}

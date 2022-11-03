package net.ent.etrs.model.start;

import net.ent.etrs.model.commons.utils.AffichageConsole;
import net.ent.etrs.model.commons.utils.LectureConsole;
import net.ent.etrs.model.entities.Jeu;
import net.ent.etrs.model.entities.Operation;

import java.util.ArrayList;
import java.util.Arrays;

import static net.ent.etrs.model.entities.references.Constante.*;

public class main {
    public static void main(String[] args) {

        // Afficher le menu de choix
        AffichageConsole.afficherMenuEntoureAvecOptionSortie(new ArrayList<>(Arrays.asList(MENU)), "Votre choix :");

        // tant qu'on n'a pas quitté (l'option '0'), demander le choix entre Addition, Multiplication et quitter
        boolean quitter = false;
        do {
            System.out.println(MESSAGE_CHOIX);

            switch (LectureConsole.lectureChoixInt(0, 2)) {

                // Si le choix est '0' alors on quitte
                case 0:
                    System.out.println("Vous quittez le programe");
                    quitter = true;
                    break;

                // Si le choix est '1' alors on fait 5 une addition
                case 1:
                    // tirer un nombre aléatoire
                    int operandeAddition = Jeu.tirerOperande();
                    // Affiche la table utilisée
                    System.out.printf("5 additions sur la table de %s%n", operandeAddition);

                    for (int i = 0; i < NB_OPERATION; i++) {
                        int addition = (new Operation(ADDITION, operandeAddition, Jeu.tirerOperandeNonTiree())).operer();
                        System.out.printf("%s + %s = ", Operation.getOperande1(), Operation.getOperande2());
                        if (LectureConsole.lectureEntier() == addition) {
                            System.out.println("Bonne Réponse");
                            System.out.println(Jeu.formaterEtatAvancement(true, i));
                            Jeu.formaterResultat(true);
                        } else {
                            System.out.println("Mauvaise Réponse");
                            System.out.println(Jeu.formaterEtatAvancement(false, i));
                        }
                    }
                    System.out.printf("Score : %s/%s%n", Jeu.formaterResultat(false), NB_OPERATION);
                    Jeu.reset();
                    break;

                // Si le choix est '2' alors on fait une multiplication
                case 2:
                    // tirer un nombre aléatoire
                    int operandeMultiplication = Jeu.tirerOperande();
                    System.out.printf("5 multiplications sur la table de %s%n", operandeMultiplication);
                    for (int i = 0; i < NB_OPERATION; i++) {
                        int multiplication = (new Operation(MULTIPLICATION, operandeMultiplication, Jeu.tirerOperandeNonTiree())).operer();
                        System.out.printf("%s x %s = ", Operation.getOperande1(), Operation.getOperande2());
                        if (LectureConsole.lectureEntier() == multiplication) {
                            System.out.println("Bonne Réponse");
                            System.out.println(Jeu.formaterEtatAvancement(true, i));
                            Jeu.formaterResultat(true);
                        } else {
                            System.out.println("Mauvaise Réponse");
                            System.out.println(Jeu.formaterEtatAvancement(false, i));
                        }
                    }
                    System.out.printf("Score : %s/%s%n", Jeu.formaterResultat(false), NB_OPERATION);
                    Jeu.reset();
                    break;
            }
            Jeu.operandesDejaTires.clear();
        } while (!quitter);


    }
}

package net.ent.etrs.model.entities.references;

/**
 * Contient l'ensemble des constantes utiles à l'application.
 *
 * @author PDI
 */
public class Constante {

    /**
     * Constante représentant une addition.
     */
    public static final int ADDITION = 0;
    /**
     * Constante représentant une addition.
     */
    public static final int MULTIPLICATION = 1;
    /**
     * Représentation graphique d'une addition.
     */
    public static final char REPRESENTATION_GRAPHIQUE_ADDITION = '+';
    /**
     * Représentation graphique d'une multiplication.
     */
    public static final char REPRESENTATION_GRAPHIQUE_MULTIPLICATION = 'X';
    /**
     * Valeur maximale pour les opérations.
     */
    public static final int ENTIER_MAX = 10;
    /**
     * Nombre d'opérations proposées par le jeu.
     */
    public static final int NB_OPERATION = 5;
    /**
     * Représentation graphique pour l'état d'avancement si la réponse est correcte.
     */
    public static final char REPRESENTATION_REPONSE_OK = '-';
    /**
     * Représentation graphique pour l'état d'avancement si la réponse est incorrecte.
     */
    public static final char REPRESENTATION_REPONSE_KO = 'x';
    /**
     * Représentation graphique pour l'état d'avancement s'il n'y a pas de réponse.
     */
    public static final char REPRESENTATION_REPONSE_PAS_DE_REPONSE = '.';
    public static final String[] MENU = {
            "Addition",
            "Multiplication"
    };
    public static final String MESSAGE_CHOIX = "Entrez votre choix :";
    /**
     * Construteur privé interdisant l'instanciation.
     */
    private Constante() {
    }
}

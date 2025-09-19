package org.centrale.projet.objet;

/**
 * Classe de test pour la classe {@link Point2D}.
 * <p>
 * Elle permet de vérifier le bon fonctionnement des constructeurs,
 * accesseurs, mutateurs et méthodes utilitaires de {@code Point2D}.
 * Les résultats sont affichés sur la sortie standard.
 * </p>
 *
 * @author Anas
 * @author Ilyas
 */
public class TestPoint2D {

    /**
     * Point d'entrée du programme de test.
     *
     * @param args arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {

        // --- Constructeurs ---
        Point2D O = new Point2D();        // (0,0)
        Point2D P1 = new Point2D(10, 0);  // (10,0)
        Point2D P3 = new Point2D(0, 6);   // (0,6)
        Point2D P2 = new Point2D(P1);     // copie de P1 -> (10,0)
        P2.setY(6);                       // -> (10,6)

        System.out.println("O=" + O + " P1=" + P1 + " P2=" + P2 + " P3=" + P3);

        // --- Méthodes utilitaires ---
        Point2D Q = new Point2D(1, 1);
        Q.translate(2, -1);               // -> (3,0)
        System.out.println("Q après translate : " + Q);
        Q.setPosition(-2, 4);             // -> (-2,4)
        System.out.println("Q repositionné    : " + Q);

        // --- Vérification géométrique ---
        // Rectangle O(0,0), P1(10,0), P2(10,6), P3(0,6) -> centre (5,3)
        Point2D C = new Point2D(10 / 2, 6 / 2); // division entière -> (5,3)

        float OC = C.distance(O);
        float CP2 = C.distance(P2);
        float P1C = C.distance(P1);
        float CP3 = C.distance(P3);

        if (OC == CP2 && P1C == CP3) {
            System.out.println("OP1P2P3 est un parallélogramme");
        } else {
            System.out.println("OP1P2P3 n'est PAS un parallélogramme");
        }
    }
}

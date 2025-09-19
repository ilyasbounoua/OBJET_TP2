package org.centrale.projet.objet;

/**
 * La classe {@code Point2D} représente un point en deux dimensions
 * avec des coordonnées entières (x, y).
 * <p>
 * Elle fournit des constructeurs pour créer un point à l'origine,
 * avec des coordonnées données ou par copie d'un autre point.
 * Des accesseurs et mutateurs permettent de manipuler les coordonnées,
 * et plusieurs méthodes utilitaires offrent des opérations géométriques
 * simples comme la translation et le calcul de distance.
 * </p>
 *
 * @author Anas
 * @author Ilyas
 */
public class Point2D {

    /** Abscisse du point. */
    private int x;

    /** Ordonnée du point. */
    private int y;

    /**
     * Construit un point à l'origine (0,0).
     */
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Construit un point aux coordonnées spécifiées.
     *
     * @param x l'abscisse
     * @param y l'ordonnée
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Construit un nouveau point par copie d'un autre point.
     *
     * @param p le point à copier
     */
    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * Retourne l'abscisse du point.
     *
     * @return l'abscisse (x)
     */
    public int getX() {
        return x;
    }

    /**
     * Modifie l'abscisse du point.
     *
     * @param x la nouvelle abscisse
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Retourne l'ordonnée du point.
     *
     * @return l'ordonnée (y)
     */
    public int getY() {
        return y;
    }

    /**
     * Modifie l'ordonnée du point.
     *
     * @param y la nouvelle ordonnée
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Met à jour simultanément l'abscisse et l'ordonnée du point.
     *
     * @param x la nouvelle abscisse
     * @param y la nouvelle ordonnée
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Déplace le point en ajoutant un décalage à ses coordonnées.
     *
     * @param dx déplacement sur l'axe des abscisses
     * @param dy déplacement sur l'axe des ordonnées
     */
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Renvoie une représentation textuelle du point.
     * <p>
     * Exemple : {@code [3 ; 5]}
     * </p>
     *
     * @return une chaîne de la forme "[x ; y]"
     */
    @Override
    public String toString() {
        return "[" + x + " ; " + y + "]";
    }

    /**
     * Calcule la distance euclidienne entre ce point et un autre.
     *
     * @param p le point de destination
     * @return la distance entre les deux points
     */
    public float distance(Point2D p) {
        int dx = p.x - this.x;
        int dy = p.y - this.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Affiche les coordonnées du point sur la sortie standard.
     */
    public void affiche() {
        System.out.println(this.toString());
    }
}

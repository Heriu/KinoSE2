package de.uni_hamburg.informatik.swt.se2.kino.beobachterService;

/**
 * Interface für Beobachter, die sich für Änderungen einer Beobachtbaren Klasse
 * interessieren.
 * @author Gucci Gang
 * @version final
 *
 */
public interface Beobachter
{
    /**
     * Diese Operation wird aufgerufen, sobald sich an an dem beobachteten
     * Werkzeug etwas relevantes geändert hat.
     * 
     * Implementierende Klassen müssen in dieser Operation auf die Aenderung
     * reagieren.
     */
    void beachteAenderung();
}

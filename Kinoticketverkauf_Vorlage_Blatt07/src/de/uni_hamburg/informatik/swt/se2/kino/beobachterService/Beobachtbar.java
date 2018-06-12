package de.uni_hamburg.informatik.swt.se2.kino.beobachterService;

import java.util.HashSet;
import java.util.Set;

/**
 * Die abstrakte Klasse die von allen Beobachtbaren Klassen erweitert wird um einen Beobachter 
 * über stattgefundende Änderungen zu informieren.
 * 
 * @author Gucci Gang
 * @Version final
 */
public abstract class Beobachtbar
{
    //Das Set der aktuellen Beobachter
    private Set<Beobachter> _beobachter;

    public Beobachtbar()
    {
        _beobachter = new HashSet<Beobachter>();
    }

    /**
     * Fügt eienen neuen Beobachter hinzu, der als Parameter übergeben wird.
     * @param b der hinzuzufügende Beobachter
     */
    public void setzeBeobachter(Beobachter b)
    {
        assert b != null : "Vorbedingung verletzt: beobachter != null";
        if (!_beobachter.contains(b))
        {
            _beobachter.add(b);
        }
    }

    /**
     * Entfernt einen Beocbachter aus der Liste der aktuellen Beobachter.
     * @param b der zu entfernende Beobachter
     */
    public void entferneBeobachter(Beobachter b)
    {
        assert b != null : "Vorbedingung verletzt: beobachter != null";
        _beobachter.remove(b);
    }

    /**
     * Meldet an alle Beobachter, dass eine Änderung stattgefunden hat.
     * Da für jeden Aufruf im Kassenwerkzeug eine neue anonyme Klasse Beobachter erstellt wird,
     * wird der Beobachter nach jeder Änderung wieder entfernt.
     */
    protected void meldeAenderung()
    {
        for (Beobachter b : _beobachter)
        {
            b.beachteAenderung();
        }
    }
}

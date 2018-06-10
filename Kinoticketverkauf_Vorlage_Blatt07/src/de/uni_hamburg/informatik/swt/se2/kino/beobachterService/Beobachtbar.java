package de.uni_hamburg.informatik.swt.se2.kino.beobachterService;

import java.util.HashSet;
import java.util.Set;

public abstract class Beobachtbar
{
    private Set<Beobachter> _beobachter;

    public Beobachtbar()
    {
        _beobachter = new HashSet<Beobachter>();
    }

    public void setzeBeobachter(Beobachter b)
    {
        assert b != null : "Vorbedingung verletzt: beobachter != null";
        if (!_beobachter.contains(b))
        {
            _beobachter.add(b);
        }
    }

    public void entferneBeobachter(Beobachter b)
    {
        _beobachter.remove(b);
    }

    protected void meldeAenderung()
    {
        for (Beobachter b : _beobachter)
        {
            b.beachteAenderung();
            entferneBeobachter(b);
        }
    }
}

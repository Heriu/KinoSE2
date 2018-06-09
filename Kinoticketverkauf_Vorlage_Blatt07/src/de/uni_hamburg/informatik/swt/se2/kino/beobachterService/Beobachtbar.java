package de.uni_hamburg.informatik.swt.se2.kino.beobachterService;

import java.util.ArrayList;

public abstract class Beobachtbar
{
    private ArrayList<Beobachter> _beobachter;

    public Beobachtbar()
    {
        _beobachter = new ArrayList<Beobachter>();
    }

    public void setzeBeobachter(Beobachter b)
    {
        assert b != null : "Vorbedingung verletzt: beobachter != null";
        if (!_beobachter.contains(b))
        {
            _beobachter.add(b);
        }
    }

    protected void meldeAenderung()
    {
        for (Beobachter b : _beobachter)
        {
            b.beachteAenderung();
        }
    }
}

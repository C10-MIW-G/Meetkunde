package model;

import java.util.ArrayList;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Plek waar ik mijn figuren kwijt kan.
 */
public class Oppervlak {
    private double lengte;
    private double breedte;
    private ArrayList<Figuur> mijnFiguren;

    public Oppervlak(double lengte, double breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
        mijnFiguren = new ArrayList<>();
    }

    public void voegFiguurToe(Figuur figuur) {
        if (figuurPastAlsVormInOppervlak(figuur)) {
            mijnFiguren.add(figuur);
            System.out.println("Dit figuur is toegevoegd");
        } else {
            System.out.println("Dit figuur is te groot");
        }

    }

    public ArrayList<Figuur> geefFigurenMetGrotereOppervlakte(double grenswaarde) {
        ArrayList<Figuur> gevraagdeFiguren = new ArrayList<>();

        for (Figuur figuur : mijnFiguren) {
            if (figuur.geefOppervlakte() > grenswaarde) {
                gevraagdeFiguren.add(figuur);
            }
        }

        return gevraagdeFiguren;
    }

    private boolean figuurPastAlsVormInOppervlak(Figuur figuur) {
        boolean eenReturn = false;

        if (figuur instanceof Rechthoek) {
            if (((Rechthoek) figuur).getLengte() <= this.lengte &&
                    ((Rechthoek) figuur).getBreedte() <= this.breedte) {
                eenReturn = true;
            }
        } else if (figuur instanceof Cirkel) {
            if (((Cirkel) figuur).getStraal() <= this.breedte / 2 &&
                    ((Cirkel) figuur).getStraal() <= this.lengte / 2) {
                eenReturn = true;
            }
        }

        return eenReturn;
    }

    @Override
    public String toString() {
        String eenReturn = "";

        for (Figuur figuur : mijnFiguren) {
            eenReturn += figuur.toString() + "\n\n";
        }

        return eenReturn;
    }
}

package controller;

import model.Cirkel;
import model.Punt;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Spelen in het meetkundedomein.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        new Cirkel(-2, new Punt(2.5, 4.1), "fuchsia");
        new Cirkel();
        new Cirkel(5);

        Cirkel[] mijnCirkelArray = new Cirkel[3];
        mijnCirkelArray[0] = new Cirkel(3, new Punt(1, 4), "groen");
        mijnCirkelArray[1] = new Cirkel();
        mijnCirkelArray[2] = new Cirkel(6);
        for (int arrayTeller = 0; arrayTeller < mijnCirkelArray.length;
             arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller].geefOmtrek());
            System.out.println(mijnCirkelArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getxCoordinaat());
            System.out.printf("(%.0f, %.0f)\n",
                    mijnCirkelArray[arrayTeller].getMiddelpunt().getxCoordinaat(),
                    mijnCirkelArray[arrayTeller].getMiddelpunt().getyCoordinaat());
            System.out.println();
        }

    }

}

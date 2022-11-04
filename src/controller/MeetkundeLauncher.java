package controller;

import model.Cirkel;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Spelen in het meetkundedomein.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {

        Cirkel mijnEersteCirkel = new Cirkel(1, 3, -2, "rood");
        System.out.println(Cirkel.aantalCirkels);
        Cirkel mijnTweedeCirkel = new Cirkel(1);
        Cirkel mijnDerdeCirkel = new Cirkel();
        System.out.println(Cirkel.aantalCirkels);

        System.out.println("Omtrek: " + mijnEersteCirkel.geefOmtrek());
        System.out.println("Oppervlak: " + mijnEersteCirkel.geefOppervlakte());
        System.out.println(mijnEersteCirkel);

        System.out.println(Cirkel.geefDefinitie());
        System.out.println(mijnEersteCirkel.straal);

    }

}

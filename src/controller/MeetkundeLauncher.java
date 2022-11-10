package controller;

import model.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Spelen in het meetkundedomein.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        boolean onjuistInvoer = true;
        while (onjuistInvoer) {
            System.out.print("Geef een straal: ");
            try {
                double straal = keyboard.nextDouble();
                Cirkel ingevoerdeCirkel = new Cirkel(straal);
                onjuistInvoer = false;
                System.out.println(ingevoerdeCirkel);
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Daar kon ik geen double van maken");
                keyboard.nextLine();
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getMessage());
            } finally {
                System.out.println("Deze poging is afgehandeld");
            }
        }
    }

    public static void toonInformatie(Figuur figuur) {
        System.out.println(figuur);
        System.out.println();
    }

    public static void toonInformatieAlleFiguren(ArrayList<Figuur> figuren) {
        for (Figuur figuur : figuren) {
            toonInformatie(figuur);
        }
    }

}

package controller;

import model.*;

import javax.swing.plaf.basic.BasicEditorPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Spelen in het meetkundedomein.
 */
public class MeetkundeLauncher {

    public static void main(String[] args) {
        File rechthoekenBestand = new File("resources/Rechthoek.csv");
        ArrayList<Rechthoek> rechthoeken = new ArrayList<>();
        try (Scanner invoerBestand = new Scanner(rechthoekenBestand)) {

            while (invoerBestand.hasNextLine()) {
                String[] gesplitsteRegel = invoerBestand.nextLine().split(",");

                double lengte = Double.parseDouble(gesplitsteRegel[0]);
                double breedte = Double.parseDouble(gesplitsteRegel[1]);

                double xCoordinaat = Double.parseDouble(gesplitsteRegel[2]);
                double yCoordinaat = Double.parseDouble(gesplitsteRegel[3]);
                Punt hoekpunt = new Punt(xCoordinaat, yCoordinaat);

                String kleur = gesplitsteRegel[4];

                rechthoeken.add(new Rechthoek(lengte, breedte, hoekpunt, kleur));
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Het lukte niet om het bestand te openen");
        }

        File uitvoerBestand = new File("resources/Rechthoeken.txt");

        try (PrintWriter printWriter = new PrintWriter(uitvoerBestand)) {
            printWriter.println("Dit zijn mijn rechthoeken:\n");
            for (Rechthoek rechthoek : rechthoeken) {
                printWriter.println(rechthoek);
                printWriter.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Het is niet gelukt het bestand aan te maken");
            System.out.println(e.getMessage());
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

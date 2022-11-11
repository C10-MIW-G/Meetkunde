package controller;

import database.DBaccess;
import model.*;

import javax.swing.plaf.basic.BasicEditorPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
        DBaccess dBaccess = new DBaccess("figuren", "userFiguren", "userFigurenPW");
        dBaccess.openConnection();

        if (dBaccess.getConnection() != null) {
            String sql = "SELECT * FROM Punt";

            try {
                PreparedStatement preparedStatement = dBaccess.getConnection().prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    double xCoordinaat = resultSet.getDouble("xcoordinaat");
                    double yCoordinaat = resultSet.getDouble("ycoordinaat");
                    Punt punt = new Punt(xCoordinaat, yCoordinaat);
                    System.out.println(punt);
                }
            } catch (SQLException sqlException) {
                System.out.println("SQL foutmelding: " + sqlException.getMessage());
            } finally {
                dBaccess.closeConnection();
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

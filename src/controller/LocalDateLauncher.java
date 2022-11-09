package controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Laat zien hoe de LocalDate klasse werkt
 */
public class LocalDateLauncher {

    public static void main(String[] args) {

        LocalDateTime nu = LocalDateTime.now();
        System.out.printf("%s-%s-%s\n\n", nu.getYear(), nu.getMonthValue(), nu.getDayOfMonth());
        System.out.println(nu);

        LocalDate vandaag = LocalDate.now();
        System.out.println(vandaag);

        LocalDate beginVan2022 = LocalDate.parse("2022-01-01");
        System.out.println(beginVan2022);

        LocalDate koningsDag = LocalDate.parse("2023-04-27");
        System.out.println(koningsDag);

        if (koningsDag.isAfter(LocalDate.now())) {
            System.out.println("Het moet nog koningsdag worden.");
        } else if (koningsDag.equals(vandaag)) {
            System.out.println("Het is vandaag koningsdag");
        } else {
            System.out.println("Het is al koningsdag geweest dit jaar.");
        }

    }
}

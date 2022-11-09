package model;

/**
 * @author Vincent Velthuizen <v.r.velthuizen@pl.hanze.nl>
 * <p>
 * Je moet aankunnen geven of je in een bepaald oppervlak past
 */
public interface ToelaatbaarInOppervlak {
    boolean pastInOppervlak(double lengte, double breedte);
}

package pl.sda.poznan.builder;

import java.time.LocalDate;

import pl.sda.poznan.builder.Reservation.ReservationBuilder;

public class ReservationParser {

    // Sample format:
    // Date, 2018-02-12, Headcount, 250, City, Poznan, Price, 100

    public static Reservation parse(String s) {

        String[] split = s.split(", ");
        ReservationBuilder rb = Reservation.builder();

        for (int i = 0; i < split.length; i += 2) {
            String key = split[i];
            String value = split[i + 1];
            if (key.toLowerCase().equals("date")) {
                rb.date(LocalDate.parse(value));
            } else if (key.toLowerCase().equals("headcoubt")) {
                rb.headCount(Integer.parseInt(value));
            } else if (key.toLowerCase().equals("city")) {
                rb.city(value);
            } else if (key.toLowerCase().equals("price")) {
                rb.price(Double.parseDouble(value));
            }
        }
        return rb.build();

    }
}

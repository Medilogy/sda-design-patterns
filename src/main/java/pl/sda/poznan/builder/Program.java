package pl.sda.poznan.builder;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
//        Reservation reservation = new Reservation();
//        reservation.setCity("Poznań");
//        reservation.setHeadcount(199);

        Reservation.ReservationBuilder rb = Reservation.builder()
                .city("Poznań")
                .headCount(100)
                .price(99d);

        // odczyt z pilku
        rb.date(LocalDate.parse("2018-03-03"));

        // zakoncz proces budowania - zwro gotowy obiekt

        Reservation build = rb.build();
        System.out.println(build);

        // inny scenariusz - znam wszystkie wartosci od razu

        Reservation wroclaw = Reservation.builder()
                .date(LocalDate.parse("2018-03-03"))
                .headCount(100)
                .price(20)
                .city("Wrocław")
                .build();

    }
}

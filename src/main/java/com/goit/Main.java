package com.goit;

import com.goit.sample.DateSorter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();


        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2004, 7, 1));
        unsortedDates.add(LocalDate.of(2005, 1, 2));
        unsortedDates.add(LocalDate.of(2007, 1, 1));
        unsortedDates.add(LocalDate.of(2032, 5, 3));


        List<LocalDate> sortedDates = (List<LocalDate>) dateSorter.sortDates(unsortedDates);

        for (LocalDate date : sortedDates) {
            System.out.println(date);
        }
    }
}

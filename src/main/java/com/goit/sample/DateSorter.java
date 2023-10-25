package com.goit.sample;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DateSorter {

    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> sortedDates = unsortedDates.stream()
                .sorted((date1, date2) -> {
                    int result;
                    if (hasRInMonth(date1) && hasRInMonth(date2)) {
                        result = date1.compareTo(date2);
                    } else if (hasRInMonth(date1)) {
                        result = -1;
                    } else if (hasRInMonth(date2)) {
                        result = 1;
                    } else {
                        result = date2.compareTo(date1);
                    }
                    return result;
                })
                .collect(Collectors.toList());

        return sortedDates;
    }
    private boolean hasRInMonth(LocalDate date) {
        String month = date.getMonth().name().toLowerCase();
        return month.contains("r");
    }
}
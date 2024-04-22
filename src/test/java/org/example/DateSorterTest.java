package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DateSorterTest {
    @Test
    public void sortDatesTest() {
        LocalDate date1 = LocalDate.of(2004, 7, 1);
        LocalDate date2 = LocalDate.of(2005, 1, 2);
        LocalDate date3 = LocalDate.of(2007, 1, 1);
        LocalDate date4 = LocalDate.of(2032, 5, 3);

        List<LocalDate> requiredSorting = List.of(date2, date3, date4, date1);
        List<LocalDate> unsortedDates = List.of(date1, date2, date3, date4);

        Collection<LocalDate> sortedDates = new DateSorter().sortDates(unsortedDates);

        Assertions.assertEquals(requiredSorting, sortedDates);
    }
}
package com.smartbrain.configs;

import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class TestingDataForUnitTests {

    private static final String DATE_FORMAT = "dd/MM/yyyy";

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);

    public String eighteen() {
        return LocalDate.now().minusYears(18).format(formatter);
    }

    public String eighteenAbove() {
        return LocalDate.now().minusYears(28).format(formatter);
    }

    public String lessThanEighteen() {
        return LocalDate.now().minusYears(8).format(formatter);
    }

    public String eighteenPlusOneDay() {
        return LocalDate.now().minusYears(18).minusDays(1).format(formatter);
    }

    public String eighteenMinusOneDay() {
        return LocalDate.now().minusYears(18).plusDays(1).format(formatter);
    }

    public String hundred() {
        return LocalDate.now().minusYears(100).format(formatter);
    }

    public String hundredMinusOneDay() {
        return LocalDate.now().minusYears(100).plusDays(1).format(formatter);
    }

    public String zero() {
        return LocalDate.now().format(formatter);
    }
}

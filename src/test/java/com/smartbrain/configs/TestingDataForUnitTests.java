package com.smartbrain.configs;

import lombok.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class TestingDataForUnitTests {

    private static final String DATE_FORMAT = "dd/MM/yyyy";

    public String eighteen() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.now().minusYears(18).format(formatter);
    }

    public String eighteenAbove() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.now().minusYears(28).format(formatter);
    }

    public String lessThanEighteen() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.now().minusYears(8).format(formatter);
    }

    public String eighteenPlusOneDay() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.now().minusYears(18).minusDays(1).format(formatter);
    }

    public String eighteenMinusOneDay() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.now().minusYears(18).plusDays(1).format(formatter);
    }

    public String hundred() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.now().minusYears(100).format(formatter);
    }

    public String hundredMinusOneDay() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.now().minusYears(100).plusDays(1).format(formatter);
    }

    public String zero() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return LocalDate.now().format(formatter);
    }
}

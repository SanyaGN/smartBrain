package com.smartbrain.model;

import com.smartbrain.exceptions.InvalidDateOfBirthException;
import com.smartbrain.exceptions.WrongDateOfBirthFormatException;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Data
public class CheckAge {

    public static final String DATE_FORMAT = "dd/MM/yyyy";

    private LocalDate currentDate;
    private LocalDate dob;
    private Integer userAge;

    public Boolean isUserAgeHigherThanEighteen(String dateOfBirth) {

        userAge(dateOfBirth);
        dobValidation(dateOfBirth);

        return userAge >= 18;
    }

    private void userAge(String dateOfBirth) {
        currentDate = LocalDate.now();
        dob = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern(DATE_FORMAT));
        userAge = Period.between(dob, currentDate).getYears();

    }

    private void dobValidation(String dateOfBirth) {
        if (dateOfBirth.charAt(2) != '/' && dateOfBirth.charAt(5) != '/') {
            throw new WrongDateOfBirthFormatException("DOB format should be dd/MM/yyyy");
        }
        else if ((dob.getYear() > currentDate.getYear()) ||
                (dob.getMonthValue() > currentDate.getMonthValue() && dob.getYear() == currentDate.getYear()) ||
                (dob.getDayOfMonth() > currentDate.getDayOfMonth() && dob.getMonthValue() == currentDate.getMonthValue() && dob.getYear() == currentDate.getYear())) {
            throw new InvalidDateOfBirthException("Invalid date of birth");
        }
        else if (userAge == 100 && dob.getDayOfMonth() < currentDate.getDayOfMonth() ||
                (userAge == 100 && dob.getMonthValue() < currentDate.getMonthValue()) ||
                (userAge > 100)) {
            throw new InvalidDateOfBirthException("Invalid date of birth");
        }
    }
}

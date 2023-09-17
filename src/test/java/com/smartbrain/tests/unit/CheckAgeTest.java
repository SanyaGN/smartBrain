package com.smartbrain.tests.unit;

import com.smartbrain.configs.TestingDataForUnitTests;
import com.smartbrain.model.CheckAge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckAgeTest {

    private CheckAge userAge;
    private TestingDataForUnitTests testData;

    @BeforeEach
    public void createClassObject() {
        userAge = new CheckAge();
        testData = new TestingDataForUnitTests();
    }

    @Test
    public void userAgeIsAboveEighteen() {
        assertEquals(true, userAge.isUserAgeHigherThanEighteen(testData.eighteenAbove()));
    }

    @Test
    public void userAgeIsEighteen() {
        assertEquals(true, userAge.isUserAgeHigherThanEighteen(testData.eighteen()));
    }

    @Test
    public void userAgeIsEighteenPlusOneDay() {
        assertEquals(true, userAge.isUserAgeHigherThanEighteen(testData.eighteenPlusOneDay()));
    }

    @Test
    public void userAgeIsEighteenMinusOneDay() {
        assertEquals(false, userAge.isUserAgeHigherThanEighteen(testData.eighteenMinusOneDay()));
    }

    @Test
    public void userAgeIsUnderEighteen() {
        assertEquals(false, userAge.isUserAgeHigherThanEighteen(testData.lessThanEighteen()));
    }

    @Test
    public void userIsHundredYearsOld() {
        assertEquals(true, userAge.isUserAgeHigherThanEighteen(testData.hundred()));
    }

    @Test
    public void userIsHundredYearsOldMinusADay() {
        assertEquals(true, userAge.isUserAgeHigherThanEighteen(testData.hundredMinusOneDay()));
    }

    @Test
    public void userIsZeroYearsOld() {
        assertEquals(false, userAge.isUserAgeHigherThanEighteen(testData.zero()));
    }
}
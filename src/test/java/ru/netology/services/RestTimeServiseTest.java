package ru.netology.services;

import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestTimeServiseTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/resttime.csv")

    public void testRestTime(int expected, int income, int expenses, int threshold) {
        RestTimeService service = new RestTimeService();

      //  int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }

   // @Test

   // public void testThresholdOneHundredFiftyThousand() {
     //   RestTimeService service = new RestTimeService();
       // int expected = 2;
    //    int actual = service.calculate(100000, 60000, 150000);
      //  Assertions.assertEquals(expected, actual);
    }



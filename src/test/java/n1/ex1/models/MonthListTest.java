package n1.ex1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MonthListTest {

    @Test
    void checkHasTwelveMonths(){
       MonthsList months = new MonthsList();
       Assertions.assertEquals(12, months.getMonths().size());
       }
    @Test
    void checkListIsNotNull(){
       MonthsList months = new MonthsList();
       Assertions.assertNotNull(months.getMonths());
   }

    @Test
    void checkIfMonthEightIsAugust(){
        MonthsList months = new MonthsList();
        Assertions.assertEquals("August",months.getMonths().get(7));
    }

   }



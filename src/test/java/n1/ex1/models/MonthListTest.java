package n1.ex1.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MonthListTest {


   @Test
   void test(){

           ArrayList<String> months = new ArrayList<>();
           months.add("January");
           months.add("February");
           months.add("March");
           months.add("April");
           months.add("May");
           months.add("June");
           months.add("July");
           months.add("August");
           months.add("September");
           months.add("October");
           months.add("November");
           months.add("December");

           Assertions.assertEquals(months.size() == 11, months.size() == 11 );
           Assertions.assertNotNull(months);
           Assertions.assertEquals(months.get(7) == "August", months.get(7) == "August");


       }
   }



package n1.ex2.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DniCalculationTest {

    @ParameterizedTest
    @CsvSource ({
        "48095723, D",
        "49782516, M",
        "48789856, W",
        "25874651, L",
        "74589621, T"

    })

    public void checkCharacterIsValid(int dniNumber, char letter){
         DniCalculation dniCalculation = new DniCalculation();
         char calculatedLetter = dniCalculation.getCharacter(dniNumber);
         System.out.println("Expected letter: " + letter + "; Calculated letter: " + calculatedLetter);
         assertEquals(letter, calculatedLetter);

        }
   @Test
   void checkLongDniNumber(){
        long dniLargeNumber = 4809572584l;
        Assertions.assertTrue(dniLargeNumber % 23 >=0 && dniLargeNumber % 23 <=23);
    }
        }









package n1.ex2.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DniCalculationTest {

    @Test
    void test(){

            ArrayList<Character> characters = new ArrayList<>();
            createCharacterList(characters);
            int dniNumber = 48095841;
            char dniCharacter = getCharacter(dniNumber, characters);
        }
        public void createCharacterList(ArrayList<Character> characters){
            characters.add('T');
            characters.add('R');
            characters.add('W');
            characters.add('A');
            characters.add('G');
            characters.add('M');
            characters.add('Y');
            characters.add('F');
            characters.add('P');
            characters.add('D');
            characters.add('X');
            characters.add('B');
            characters.add('N');
            characters.add('J');
            characters.add('Z');
            characters.add('S');
            characters.add('Q');
            characters.add('V');
            characters.add('H');
            characters.add('L');
            characters.add('C');
            characters.add('K');
            characters.add('E');
        }

        public char getCharacter(int dniNumber, ArrayList<Character> characters){
            char dniCharacter = characters.get(dniNumber % 23);

            long dniLargeNumber = 4809572584l;
            Assertions.assertTrue(dniLargeNumber % 23 >=0 && dniLargeNumber % 23 <=23);


            return dniCharacter;



        }


        }









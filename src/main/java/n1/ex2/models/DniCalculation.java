package n1.ex2.models;

import java.util.ArrayList;

public class DniCalculation {

    public static void calculateDni(){
        ArrayList<Character> characters = new ArrayList<>();
        createCharacterList(characters);

        int dniNumber = 48095841;
        //long dniNumber = 4809584172l;

        char dniCharacter = getCharacter(dniNumber, characters);
        System.out.println("Dni: "+dniNumber+dniCharacter);
    }
    public static void createCharacterList(ArrayList<Character> characters){
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

    public static char getCharacter(int dniNumber, ArrayList<Character> characters){

        char dniCharacter = characters.get(dniNumber % 23);
        return dniCharacter;
    }
}

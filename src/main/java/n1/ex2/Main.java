package n1.ex2;


import n1.ex2.models.DniCalculation;

import static n1.ex2.models.DniCalculation.getCharacter;

public class Main {
    public static void main(String[] args){
        int dniNumber = 47985624;
        System.out.println(getCharacter(dniNumber));

    }
}

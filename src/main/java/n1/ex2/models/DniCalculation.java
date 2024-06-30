package n1.ex2.models;


public class DniCalculation {
    public static char[] characters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static char getCharacter(int dniNumber) {
        char dniCharacter = characters[dniNumber % 23];
        return dniCharacter;
    }
}

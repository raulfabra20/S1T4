package n1.ex3.models;

import java.util.ArrayList;

public class ArrayException {

    public static void generateException(){
        ArrayList<Float> marks = new ArrayList<>();

        marks.add(7.5f);
        marks.add(8.4f);
        marks.add(5.8f);

        marks.get(8);


    }
}

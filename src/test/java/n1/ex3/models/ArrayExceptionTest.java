package n1.ex3.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExceptionTest {
    @Test
     void test(){
        ArrayList<Float> marks = new ArrayList<>();

        marks.add(7.5f);
        marks.add(8.4f);
        marks.add(5.8f);

        try {
            marks.get(3);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception");
        }


    }

}
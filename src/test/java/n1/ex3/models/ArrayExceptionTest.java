package n1.ex3.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExceptionTest {
    @Test
     void tryIndexOutOfBoundsExceptionTest(){
        assertThrows(IndexOutOfBoundsException.class, ArrayException::generateException);

    }

}
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

package com.Mutations;



public class MutationsTest {

    @Test
    public void testFindPrints3() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (PrintStream ps = new PrintStream(baos)) {
            System.setOut(ps);
            Mutations.find();
        } finally {
            System.setOut(originalOut);
        }
        String output = baos.toString();
        assertEquals("3" + System.lineSeparator(), output);
    }
}
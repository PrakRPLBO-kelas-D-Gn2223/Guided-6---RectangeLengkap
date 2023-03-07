package com.rplbo.kotak;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigourous Test :-)
     */
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    public void testTitik(){
        Titik a = new Titik(5,11);
        assertEquals(5,a.getX());
        assertEquals(11,a.getY());
        Titik b = new Titik(35,11);
        assertEquals(35,b.getX());
        assertEquals(11,b.getY());
        assertEquals(30.0,a.distance(b));
        System.out.println(a.distance(35,11));
        assertEquals(30.0,a.distance(35,11));
    }
}

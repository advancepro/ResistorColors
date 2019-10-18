package main;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResistorColorTest {
    private ResistorColor ResistorColor;

    @Before
    public void setup() {
        ResistorColor = new ResistorColor();
    }

    @Test
    public void testBlackColorCode() {
        String input = "black";
        int expected = 0;

        assertEquals(expected, ResistorColor.colorCode(input));
    }

    //  @Ignore("Remove to run test")
    @Test
    public void testBrownColorCode() {
        String input = "brown";
        int expected = 1;

        assertEquals(expected, ResistorColor.colorCod(input));
    }

    //  @Ignore("Remove to run test")
    @Test
    public void testRedColorCode() {
        String input = "red";
        int expected = 2;

        assertEquals(expected, ResistorColor.colorCo(input));
    }
    @Test
    public void testOrangeColorCode() {
        String input = "orange";
        int expected = 3;

        assertEquals(expected, ResistorColor.colorC(input));
    }
    @Test
    public void testYellowColorCode() {
        String input = "yellow";
        int expected = 4;

        assertEquals(expected, ResistorColor.color(input));
    }
    @Test
    public void testGreenColorCode() {
        String input = "green";
        int expected = 5;

        assertEquals(expected, ResistorColor.colo(input));
    }
    @Test
    public void testBlueColorCode() {
        String input = "blue";
        int expected = 6;

        assertEquals(expected, ResistorColor.col(input));
    }
    @Test
    public void testVioletColorCode() {
        String input = "violet";
        int expected = 7;

        assertEquals(expected, ResistorColor.co(input));
    }
    @Test
    public void testGreyColorCode() {
        String input = "grey";
        int expected = 8;

        assertEquals(expected, ResistorColor.c(input));
    }
    @Test
    public void testWhiteColorCode() {
        String input = "white";
        int expected = 9;

        assertEquals(expected, ResistorColor.cc(input));
    }

    // @Ignore("Remove to run test")
    @Test
    public void testColors() {
        String[] expected = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        assertEquals(expected, ResistorColor.testColors());
    }

}
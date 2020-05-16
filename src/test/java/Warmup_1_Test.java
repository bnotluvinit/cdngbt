import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class Warmup_1_Test {
    @Test
    public void sleepInTrue1() {
        boolean expected = Warmup_1.sleepIn(false, false);
        Assert.assertTrue(expected);
    }

    @Test
    public void sleepInTrue2() {
        boolean expected = Warmup_1.sleepIn(true, false);
        Assert.assertFalse(expected);
    }

    @Test
    public void sleepInTrue3() {
        boolean expected = Warmup_1.sleepIn(false, true);
        Assert.assertTrue(expected);
    }


    @Test
    public void monkeyTrouble1() {
        boolean expected = Warmup_1.monkeyTrouble(true, true);
        Assert.assertTrue(expected);
    }

    @Test
    public void monkeyTrouble2() {
        boolean expected = Warmup_1.monkeyTrouble(false, false);
        Assert.assertTrue(expected);
    }

    @Test
    public void monkeyTrouble3() {
        boolean expected = Warmup_1.monkeyTrouble(true, false);
        Assert.assertFalse(expected);
    }

    @Test
    public void sumDouble1() {
        int expected = 3;
        int actual = Warmup_1.sumDouble(1, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumDouble2() {
        int expected = 5;
        int actual = Warmup_1.sumDouble(3, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumDouble3() {
        int expected = 8;
        int actual = Warmup_1.sumDouble(2, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diff21_1() {
        int expected = 2;
        int actual = Warmup_1.diff21(19);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diff21_2() {
        int expected = 2;
        int actual = Warmup_1.diff21(19);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diff21_3() {
        int expected = 2;
        int actual = Warmup_1.diff21(19);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makes10_1() {
        boolean actual = Warmup_1.makes10(9, 10);
        Assert.assertTrue(actual);
    }

    @Test
    public void makes10_2() {
        boolean actual = Warmup_1.makes10(9, 9);
        Assert.assertFalse(actual);
    }

    @Test
    public void makes10_3() {
        boolean actual = Warmup_1.makes10(1, 9);
        Assert.assertTrue(actual);
    }

    @Test
    public void nearHundred1() {
        boolean actual = Warmup_1.nearHundred(93);
        Assert.assertTrue(actual);
    }

    @Test
    public void nearHundred2() {
        boolean actual = Warmup_1.nearHundred(90);
        Assert.assertTrue(actual);
    }

    @Test
    public void nearHundred3() {
        boolean actual = Warmup_1.nearHundred(89);
        Assert.assertFalse(actual);
    }

    @Test
    public void posNeg1() {
        boolean actual = Warmup_1.posNeg(1, -1, false);
        Assert.assertTrue(actual);
    }

    @Test
    public void posNeg2() {
        boolean actual = Warmup_1.posNeg(-1, 1, false);
        Assert.assertTrue(actual);
    }

    @Test
    public void posNeg3() {
        boolean actual = Warmup_1.posNeg(-4, -5, true);
        Assert.assertTrue(actual);
    }

    @Test
    public void notString1() {
        String expected = "not candy";
        String actual = Warmup_1.notString("candy");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void notString2() {
        String expected = "not x";
        String actual = Warmup_1.notString("x");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void notString3() {
        String expected = "not bad";
        String actual = Warmup_1.notString("not bad");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void missingChar1() {
        String expected = "ktten";
        String actual = Warmup_1.missingChar("kitten", 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void missingChar2() {
        String expected = "itten";
        String actual = Warmup_1.missingChar("kitten", 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void missingChar3() {
        String expected = "kittn";
        String actual = Warmup_1.missingChar("kitten", 4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void frontBack1() {
        String expected = "eodc";
        String actual = Warmup_1.frontBack("code");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void frontBack2() {
        String expected = "a";
        String actual = Warmup_1.frontBack("a");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void frontBack3() {
        String expected = "ba";
        String actual = Warmup_1.frontBack("ab");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void front3_1() {
        String expected = "JavJavJav";
        String actual = Warmup_1.front3("Java");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void front3_2() {
        String expected = "ChoChoCho";
        String actual = Warmup_1.front3("Chocolate");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void front3_3() {
        String expected = "abcabcabc";
        String actual = Warmup_1.front3("abc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void backAround1() {
        String expected = "tcatt";
        String actual = Warmup_1.backAround("cat");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void backAround2() {
        String expected = "oHelloo";
        String actual = Warmup_1.backAround("Hello");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void backAround3() {
        String expected = "aaa";
        String actual = Warmup_1.backAround("a");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void or35_1() {
        boolean actual = Warmup_1.or35(3);
        Assert.assertTrue(actual);
    }

    @Test
    public void or35_2() {
        boolean actual = Warmup_1.or35(10);
        Assert.assertTrue(actual);
    }

    @Test
    public void or35_3() {
        boolean actual = Warmup_1.or35(8);
        Assert.assertFalse(actual);
    }

    @Test
    public void front22_1() {
        String expected = "kikittenki";
        String actual = Warmup_1.front22("kitten");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void front22_2() {
        String expected = "HaHaHa";
        String actual = Warmup_1.front22("Ha");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void front22_3() {
        String expected = "ababcab";
        String actual = Warmup_1.front22("abc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void startHi1() {
        boolean actual = Warmup_1.startHi("hi there");
        Assert.assertTrue(actual);
    }

    @Test
    public void startHi2() {
        boolean actual = Warmup_1.startHi("hi");
        Assert.assertTrue(actual);
    }

    @Test
    public void startHi3() {
        boolean actual = Warmup_1.startHi("hello hi");
        Assert.assertFalse(actual);
    }

    @Test
    public void icyhot1() {
        boolean actual = Warmup_1.icyHot(120, -1);
        Assert.assertTrue(actual);
    }

    @Test
    public void icyhot2() {
        boolean actual = Warmup_1.icyHot(-1, 120);
        Assert.assertTrue(actual);
    }

    @Test
    public void icyhot3() {
        boolean actual = Warmup_1.icyHot(2, 120);
        Assert.assertFalse(actual);
    }

    @Test
    public void in1020_1() {
        boolean actual = Warmup_1.in1020(12, 99);
        Assert.assertTrue(actual);
    }

    @Test
    public void in1020_2() {
        boolean actual = Warmup_1.in1020(21, 12);
        Assert.assertTrue(actual);
    }

    @Test
    public void in1020_3() {
        boolean actual = Warmup_1.in1020(8, 99);
        Assert.assertFalse(actual);
    }

    @Test
    public void hasTeen1() {
        boolean actual = Warmup_1.hasTeen(13, 20, 10);
        Assert.assertTrue(actual);
    }

    @Test
    public void hasTeen2() {
        boolean actual = Warmup_1.hasTeen(20, 19, 10);
        Assert.assertTrue(actual);
    }

    @Test
    public void hasTeen3() {
        boolean actual = Warmup_1.hasTeen(20, 10, 13);
        Assert.assertTrue(actual);
    }

    @Test
    public void loneTeen1() {
        boolean actual = Warmup_1.loneTeen(13, 99);
        Assert.assertTrue(actual);
    }

    @Test
    public void loneTeen2() {
        boolean actual = Warmup_1.loneTeen(21, 19);
        Assert.assertTrue(actual);
    }

    @Test
    public void loneTeen3() {
        boolean actual = Warmup_1.loneTeen(13, 13);
        Assert.assertFalse(actual);
    }

    @Test
    public void delDel1() {
        String expected = "abc";
        String actual = Warmup_1.delDel("adelbc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void delDel2() {
        String expected = "abc";
        String actual = Warmup_1.delDel("adelbc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void delDel3() {
        String expected = "abc";
        String actual = Warmup_1.delDel("adelbc");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mixStart_1() {
        boolean actual = Warmup_1.mixStart("mix snacks");
        Assert.assertTrue(actual);
    }

    @Test
    public void mixStart_2() {
        boolean actual = Warmup_1.mixStart("pix snacks");
        Assert.assertTrue(actual);
    }

    @Test
    public void mixStart_3() {
        boolean actual = Warmup_1.mixStart("piz snacks");
        Assert.assertFalse(actual);
    }

    @Test
    public void startOz_1() {
        String expected = "oz";
        String actual = Warmup_1.startOz("ozymandias");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void startOz_2() {
        String expected = "z";
        String actual = Warmup_1.startOz("bzoo");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void startOz_3() {
        String expected = "o";
        String actual = Warmup_1.startOz("oxx");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intMax1() {
        int expected = 3;
        int actual = Warmup_1.intMax(1, 2, 3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intMax2() {
        int expected = 3;
        int actual = Warmup_1.intMax(1, 3, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void intMax3() {
        int expected = 3;
        int actual = Warmup_1.intMax(3, 2, 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void close10_1() {
        int expected = 8;
        int actual = Warmup_1.close10(8, 13);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void close10_2() {
        int expected = 8;
        int actual = Warmup_1.close10(13, 8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void close10_3() {
        int expected = 0;
        int actual = Warmup_1.close10(13, 7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void max1020_1() {
        int expected = 19;
        int actual = Warmup_1.max1020(11, 19);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void max1020_2() {
        int expected = 19;
        int actual = Warmup_1.max1020(19, 11);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void max1020_3() {
        int expected = 11;
        int actual = Warmup_1.max1020(11, 9);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringE1() {
        boolean actual = Warmup_1.stringE("Hello");
        Assert.assertTrue(actual);
    }

    @Test
    public void stringE2() {
        boolean actual = Warmup_1.stringE("Heelle");
        Assert.assertTrue(actual);
    }

    @Test
    public void stringE3() {
        boolean actual = Warmup_1.stringE("Heelele");
        Assert.assertFalse(actual);
    }

    @Test
    public void lastDigit1() {
        boolean actual = Warmup_1.lastDigit(7, 17);
        Assert.assertTrue(actual);
    }

    @Test
    public void lastDigit2() {
        boolean actual = Warmup_1.lastDigit(6, 17);
        Assert.assertFalse(actual);
    }

    @Test
    public void lastDigit3() {
        boolean actual = Warmup_1.lastDigit(3, 113);
        Assert.assertTrue(actual);
    }

    @Test
    public void endUp1() {
        String expected = "HeLLO";
        String actual = Warmup_1.endUp("Hello");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void endUp2() {
        String expected = "hi thERE";
        String actual = Warmup_1.endUp("hi there");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void endUp3() {
        String expected = "HI";
        String actual = Warmup_1.endUp("hi");
        Assert.assertEquals(expected, actual);
    }
}

package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumber() {
        Radio count = new Radio();
        count.setAcceptableNumber(7);
        int expected = 7;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setAcceptableVolume(60);
        int expected = 60;
        int actual = volume.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumber() {
        Radio count = new Radio();
        count.setToMaxNumber();
        int expected = 9;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinNumber() {
        Radio count = new Radio();
        count.setToMinNumber();
        int expected = 0;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio volume = new Radio();
        volume.setToMaxVolume();
        int expected = 100;
        int actual = volume.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio volume = new Radio();
        volume.setToMinVolume();
        int expected = 0;
        int actual = volume.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio count = new Radio();
        count.setAcceptableNumber(10);
        int expected = 0;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetNumberBelowMin() {
        Radio count = new Radio();
        count.setAcceptableNumber(-1);
        int expected = 0;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    //  @Test
    //   public void shouldSetAcceptableNumber() {
    //      Radio count = new Radio();
    //      count.setAcceptableNumber(5);
    //      int expected = 5;
    //      int actual = count.getNowNumber();
    //     Assertions.assertEquals(expected, actual);
    // }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setAcceptableVolume(101);
        int expected = 0;
        int actual = volume.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setAcceptableVolume(-1);
        int expected = 0;
        int actual = volume.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    //  @Test
    //  public void shouldSetAcceptableVolume() {
    //     Radio volume = new Radio();
    //     volume.setAcceptableVolume(45);
    //    int expected = 45;
    //    int actual = volume.getNowVolume();
    //    Assertions.assertEquals(expected, actual);
    // }

    @Test
    public void checkAcceptableNumber1() {
        Radio count = new Radio();
        count.setAcceptableNumber(8);
        int expected = 8;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void checkAcceptableNumber2() {
        Radio count = new Radio();
        count.setAcceptableNumber(9);
        int expected = 9;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevNumberInBorder() {
        Radio count = new Radio();
        count.prevNumber(0);
        int expected = 9;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevNumber() {
        Radio count = new Radio();
        count.prevNumber(4);
        int expected = 3;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextNumberInBorder() {
        Radio count = new Radio();
        count.nextNumber(9);
        int expected = 0;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextNumber() {
        Radio count = new Radio();
        count.nextNumber(6);
        int expected = 7;
        int actual = count.getNowNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkAcceptableVolume1() {
        Radio count = new Radio();
        count.setAcceptableVolume(77);
        int expected = 77;
        int actual = count.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkAcceptableVolume2() {
        Radio count = new Radio();
        count.setAcceptableVolume(100);
        int expected = 100;
        int actual = count.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevVolumeInBorder() {
        Radio count = new Radio();
        count.prevVolume(0);
        int expected = 100;
        int actual = count.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchPrevVolume() {
        Radio count = new Radio();
        count.prevVolume(36);
        int expected = 35;
        int actual = count.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextVolumeInBorder() {
        Radio count = new Radio();
        count.nextVolume(100);
        int expected = 0;
        int actual = count.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchNextVolume() {
        Radio count = new Radio();
        count.nextVolume(59);
        int expected = 60;
        int actual = count.getNowVolume();
        Assertions.assertEquals(expected, actual);
    }

}


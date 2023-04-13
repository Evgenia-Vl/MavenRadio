package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNowNumberBetweenMinAndMax() {
        Radio count = new Radio();
        count.setNowNumber(7);
        Assertions.assertEquals(7, count.getNowNumber());
    }

    @Test
    public void shouldSetNowNumberBeforeMin() {
        Radio count = new Radio();
        count.setNowNumber(-3);
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void shouldSetNowNumberAboveMax() {
        Radio count = new Radio();
        count.setNowNumber(14);
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void shouldSetNowNumberBeforeMinBorder() {
        Radio count = new Radio();
        count.setNowNumber(-1);
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void shouldSetNowNumberLikeMin() {
        Radio count = new Radio();
        count.setNowNumber(4);
        count.setNowNumber(0);
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void shouldSetNowNumberAboveMinBorder() {
        Radio count = new Radio();
        count.setNowNumber(1);
        Assertions.assertEquals(1, count.getNowNumber());
    }

    @Test
    public void shouldSetNowNumberBeforeMaxBorder() {
        Radio count = new Radio();
        count.setNowNumber(8);
        Assertions.assertEquals(8, count.getNowNumber());
    }

    @Test
    public void shouldSetNowNumberLikeMax() {
        Radio count = new Radio();
        count.setNowNumber(9);
        Assertions.assertEquals(9, count.getNowNumber());
    }

    @Test
    public void shouldSetNowNumberAboveMaxBorder() {
        Radio count = new Radio();
        count.setNowNumber(10);
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void shouldSetNowVolumeBetweenMinAndMax() {
        Radio count = new Radio();
        count.setNowVolume(45);
        Assertions.assertEquals(45, count.getNowVolume());
    }

    @Test
    public void shouldSetNowVolumeBeforeMin() {
        Radio count = new Radio();
        count.setNowVolume(-20);
        Assertions.assertEquals(0, count.getNowVolume());
    }

    @Test
    public void shouldSetNowVolumeAboveMax() {
        Radio count = new Radio();
        count.setNowVolume(125);
        Assertions.assertEquals(0, count.getNowVolume());
    }

    @Test
    public void shouldSetNowVolumeBeforeMinBorder() {
        Radio count = new Radio();
        count.setNowVolume(-1);
        Assertions.assertEquals(0, count.getNowVolume());
    }

    @Test
    public void shouldSetNowVolumeLikeMin() {
        Radio count = new Radio();
        count.setNowVolume(56);
        count.setNowVolume(0);
        Assertions.assertEquals(0, count.getNowVolume());
    }

    @Test
    public void shouldSetNowVolumeAboveMinBorder() {
        Radio count = new Radio();
        count.setNowVolume(1);
        Assertions.assertEquals(1, count.getNowVolume());
    }

    @Test
    public void shouldSetNowVolumeBeforeMaxBorder() {
        Radio count = new Radio();
        count.setNowVolume(99);
        Assertions.assertEquals(99, count.getNowVolume());
    }

    @Test
    public void shouldSetNowVolumeLikeMax() {
        Radio count = new Radio();
        count.setNowVolume(100);
        Assertions.assertEquals(100, count.getNowVolume());
    }

    @Test
    public void shouldSetNowVolumeAboveMaxBorder() {
        Radio count = new Radio();
        count.setNowVolume(101);
        Assertions.assertEquals(0, count.getNowVolume());
    }

    @Test
    public void switchPrevNumberInMinBorder() {
        Radio count = new Radio();
        count.setNowNumber(0);
        count.prevNumber();
        Assertions.assertEquals(9, count.getNowNumber());
    }

    @Test
    public void switchPrevNumberAboveMinBorder() {
        Radio count = new Radio();
        count.setNowNumber(1);
        count.prevNumber();
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void switchPrevNumberBetweenMinAndMax() {
        Radio count = new Radio();
        count.setNowNumber(5);
        count.prevNumber();
        Assertions.assertEquals(4, count.getNowNumber());
    }

    @Test
    public void switchPrevNumberInMaxBorder() {
        Radio count = new Radio();
        count.setNowNumber(9);
        count.prevNumber();
        Assertions.assertEquals(8, count.getNowNumber());
    }

    @Test
    public void switchPrevNumberBeforeMaxBorder() {
        Radio count = new Radio();
        count.setNowNumber(8);
        count.prevNumber();
        Assertions.assertEquals(7, count.getNowNumber());
    }

    @Test
    public void switchNextNumberInMinBorder() {
        Radio count = new Radio();
        count.setNowNumber(0);
        count.nextNumber();
        Assertions.assertEquals(1, count.getNowNumber());
    }

    @Test
    public void switchNextNumberAboveMinBorder() {
        Radio count = new Radio();
        count.setNowNumber(1);
        count.nextNumber();
        Assertions.assertEquals(2, count.getNowNumber());
    }

    @Test
    public void switchNextNumberBetweenMinAndMax() {
        Radio count = new Radio();
        count.setNowNumber(3);
        count.nextNumber();
        Assertions.assertEquals(4, count.getNowNumber());
    }

    @Test
    public void switchNextNumberInMaxBorder() {
        Radio count = new Radio();
        count.setNowNumber(9);
        count.nextNumber();
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void switchNextNumberBeforeMaxBorder() {
        Radio count = new Radio();
        count.setNowNumber(8);
        count.nextNumber();
        Assertions.assertEquals(9, count.getNowNumber());
    }

    @Test
    public void switchPrevVolumeInMinBorder() {
        Radio count = new Radio();
        count.setNowVolume(0);
        count.prevVolume();
        Assertions.assertEquals(0, count.getNowVolume());
    }

    @Test
    public void switchPrevVolumeAboveMinBorder() {
        Radio count = new Radio();
        count.setNowVolume(1);
        count.prevVolume();
        Assertions.assertEquals(0, count.getNowVolume());
    }

    @Test
    public void switchPrevVolumeBetweenMinAndMax() {
        Radio count = new Radio();
        count.setNowVolume(67);
        count.prevVolume();
        Assertions.assertEquals(66, count.getNowVolume());
    }

    @Test
    public void switchPrevVolumeInMaxBorder() {
        Radio count = new Radio();
        count.setNowVolume(100);
        count.prevVolume();
        Assertions.assertEquals(99, count.getNowVolume());
    }

    @Test
    public void switchPrevVolumeBeforeMaxBorder() {
        Radio count = new Radio();
        count.setNowVolume(99);
        count.prevVolume();
        Assertions.assertEquals(98, count.getNowVolume());
    }

    @Test
    public void switchNextVolumeInMinBorder() {
        Radio count = new Radio();
        count.setNowVolume(0);
        count.nextVolume();
        Assertions.assertEquals(1, count.getNowVolume());
    }

    @Test
    public void switchNextVolumeAboveMinBorder() {
        Radio count = new Radio();
        count.setNowVolume(1);
        count.nextVolume();
        Assertions.assertEquals(2, count.getNowVolume());
    }

    @Test
    public void switchNextVolumeBetweenMinAndMax() {
        Radio count = new Radio();
        count.setNowVolume(33);
        count.nextVolume();
        Assertions.assertEquals(34, count.getNowVolume());
    }

    @Test
    public void switchNextVolumeInMaxBorder() {
        Radio count = new Radio();
        count.setNowVolume(100);
        count.nextVolume();
        Assertions.assertEquals(100, count.getNowVolume());
    }

    @Test
    public void switchNextVolumeBeforeMaxBorder() {
        Radio count = new Radio();
        count.setNowVolume(99);
        count.nextVolume();
        Assertions.assertEquals(100, count.getNowVolume());
    }

    @Test
    public void setNowStationByUsers() {
        Radio count = new Radio(20);
        count.setNowNumber(15);
        Assertions.assertEquals(15, count.getNowNumber());
    }

}
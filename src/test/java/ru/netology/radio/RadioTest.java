package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void quantityRadiostationsIndicateByUsers() {
        Radio count = new Radio(15);
        Assertions.assertEquals(15, count.getQuantity());
    }

    @Test
    public void quantityRadiostationsIndicateByDefault() {
        Radio count = new Radio();
        Assertions.assertEquals(10, count.getQuantity());
    }

    @Test
    public void setNowStationByUser() {
        Radio count = new Radio(20);
        count.setNowNumber(15);
        Assertions.assertEquals(15, count.getNowNumber());
    }

    @Test
    public void shouldSetNumber() {
        Radio count = new Radio();
        count.setAcceptableNumber(7);
        Assertions.assertEquals(7, count.getNowNumber());
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setAcceptableVolume(60);
        Assertions.assertEquals(60, volume.getNowVolume());
    }

    @Test
    public void shouldSetToMaxNumber() {
        Radio count = new Radio();
        count.setToMaxNumber();
        Assertions.assertEquals(9, count.getNowNumber());
    }

    @Test
    public void shouldSetToMinNumber() {
        Radio count = new Radio();
        count.setToMinNumber();
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio volume = new Radio();
        volume.setToMaxVolume();
        Assertions.assertEquals(100, volume.getNowVolume());
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio volume = new Radio();
        volume.setToMinVolume();
        Assertions.assertEquals(0, volume.getNowVolume());
    }

    @Test
    public void shouldNotSetNumberAboveMax() {
        Radio count = new Radio();
        count.setAcceptableNumber(10);
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void shouldNotSetNumberBelowMin() {
        Radio count = new Radio();
        count.setAcceptableNumber(-1);
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setAcceptableVolume(101);
        Assertions.assertEquals(0, volume.getNowVolume());
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setAcceptableVolume(-1);
        Assertions.assertEquals(0, volume.getNowVolume());
    }

    @Test
    public void checkAcceptableNumber1() {
        Radio count = new Radio();
        count.setAcceptableNumber(8);
        Assertions.assertEquals(8, count.getNowNumber());
    }

    @Test
    public void checkAcceptableNumber2() {
        Radio count = new Radio();
        count.setAcceptableNumber(9);
        Assertions.assertEquals(9, count.getNowNumber());
    }

    @Test
    public void switchPrevNumberInBorder() {
        Radio count = new Radio();
        count.setToMinNumber();
        count.prevNumber();
        Assertions.assertEquals(9, count.getNowNumber());
    }

    @Test
    public void switchPrevNumber() {
        Radio count = new Radio();
        count.setNowNumber(4);
        count.prevNumber();
        Assertions.assertEquals(3, count.getNowNumber());
    }

    @Test
    public void switchNextNumberInBorder() {
        Radio count = new Radio();
        count.setNowNumber(9);
        count.nextNumber();
        Assertions.assertEquals(0, count.getNowNumber());
    }

    @Test
    public void switchNextNumber() {
        Radio count = new Radio();
        count.setNowNumber(6);
        count.nextNumber();
        Assertions.assertEquals(7, count.getNowNumber());
    }

    @Test
    public void checkAcceptableVolume1() {
        Radio count = new Radio();
        count.setAcceptableVolume(77);
        Assertions.assertEquals(77, count.getNowVolume());
    }

    @Test
    public void checkAcceptableVolume2() {
        Radio count = new Radio();
        count.setAcceptableVolume(100);
        Assertions.assertEquals(100, count.getNowVolume());
    }

    @Test
    public void switchPrevVolumeInBorder() {
        Radio count = new Radio();
        count.setNowVolume(0);
        count.minVolume();
        Assertions.assertEquals(0, count.getNowVolume());
    }

    @Test
    public void switchPrevVolume() {
        Radio count = new Radio();
        count.setNowVolume(36);
        count.minVolume();
        Assertions.assertEquals(35, count.getNowVolume());
    }

    @Test
    public void switchNextVolumeInBorder() {
        Radio count = new Radio();
        count.setNowVolume(100);
        count.maxVolume();
        Assertions.assertEquals(100, count.getNowVolume());
    }

    @Test
    public void switchNextVolume() {
        Radio count = new Radio();
        count.setNowVolume(49);
        count.maxVolume();
        Assertions.assertEquals(50, count.getNowVolume());
    }

}


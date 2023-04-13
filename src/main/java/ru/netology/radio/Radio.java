package ru.netology.radio;

public class Radio {
    private int nowNumber;
    private int nowVolume;
    private int maxNumber;
    private int minNumber;
    private int maxVolume = 100;
    private int minVolume;

    public Radio() {
        this.maxNumber = 9;
    }

    public Radio(int quantity) {
        this.maxNumber = quantity - 1;
    }

    public int getNowNumber() {
        return nowNumber;
    }

    public int getNowVolume() {
        return nowVolume;
    }

    public void setNowNumber(int nowNumber) {
        if (nowNumber < minNumber) {
            return;
        }
        if (nowNumber > maxNumber) {
            return;
        }
        this.nowNumber = nowNumber;
    }

    public void setNowVolume(int nowVolume) {
        if (nowVolume < minVolume) {
            return;
        }
        if (nowVolume > maxVolume) {
            return;
        }
        this.nowVolume = nowVolume;
    }

    public void prevNumber() {
        if (nowNumber != minNumber) {
            nowNumber--;
        } else {
            nowNumber = maxNumber;
        }
    }

    public void nextNumber() {
        if (nowNumber != maxNumber) {
            nowNumber++;
        } else {
            nowNumber = minNumber;
        }
    }

    public void prevVolume() {
        if (nowVolume != minVolume) {
            nowVolume--;
        } else {
            nowVolume = minVolume;
        }
    }

    public void nextVolume() {
        if (nowVolume != maxVolume) {
            nowVolume++;
        } else {
            nowVolume = maxVolume;
        }
    }
}




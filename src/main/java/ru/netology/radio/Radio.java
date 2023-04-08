package ru.netology.radio;

public class Radio {
    private int nowNumber;
    private int nowVolume;

    public int getNowNumber() {
        return nowNumber;
    }

    public int getNowVolume() {
        return nowVolume;
    }

    public void setToMaxNumber() {
        nowNumber = 9;
    }

    public void setToMaxVolume() {
        nowVolume = 100;
    }

    public void setToMinNumber() {
        nowNumber = 0;
    }

    public void setToMinVolume() {
        nowNumber = 0;
    }

    public void setAcceptableNumber(int newNowNumber) {
        if (newNowNumber < 0) {
            return;
        }
        if (newNowNumber > 9) {
            return;
        }
        nowNumber = newNowNumber;

        if (newNowNumber == 9) {
            nowNumber = newNowNumber;
        }
        if (newNowNumber < 9) {
            nowNumber = newNowNumber;
        }
    }

    public void setAcceptableVolume(int newNowVolume) {
        if (newNowVolume < 0) {
            return;
        }
        if (newNowVolume > 100) {
            return;
        }
        nowVolume = newNowVolume;

        if (newNowVolume == 100) {
            nowVolume = newNowVolume;
        }
        if (newNowVolume < 100) {
            nowVolume = newNowVolume;
        }
    }

    public void prevNumber(int newNumber) {
        if (newNumber == 0) {
            nowNumber = 9;
        } else {
            nowNumber = newNumber - 1;
        }
    }

    public void nextNumber(int newNumber) {
        if (newNumber == 9) {
            nowNumber = 0;
        } else {
            nowNumber = newNumber + 1;
        }
    }

    public void prevVolume(int newVolume) {
        if (newVolume == 0) {
            nowVolume = 100;
        } else {
            nowVolume = newVolume - 1;
        }
    }

    public void nextVolume(int newVolume) {
        if (newVolume == 100) {
            nowVolume = 0;
        } else {
            nowVolume = newVolume + 1;
        }
    }
}




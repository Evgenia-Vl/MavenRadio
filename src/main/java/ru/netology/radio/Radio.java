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

    public void setNowNumber(int newNowNumber) {
        nowNumber = newNowNumber;
    }

    public void setNowVolume(int newNowVolume) {
        nowVolume = newNowVolume;
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
        nowVolume = 0;
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

    public void prevNumber() {
        if (nowNumber == 0) {
            nowNumber = 9;
        } else {
            nowNumber = nowNumber - 1;
        }
    }

    public void nextNumber() {
        if (nowNumber == 9) {
            nowNumber = 0;
        } else {
            nowNumber = nowNumber + 1;
        }
    }

    public void prevVolume() {
        if (nowVolume == 0) {
            nowVolume = 0;
        } else {
            nowVolume = nowVolume - 1;
        }
    }

    public void nextVolume() {
        if (nowVolume == 100) {
            nowVolume = 100;
        } else {
            nowVolume = nowVolume + 1;
        }
    }
}




package ru.netology.radio;

public class Radio {
    private int quantity = 10;
    private int minNumber = 0;
    private int maxNumber = quantity - 1;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int nowNumber = minNumber;
    private int nowVolume = minVolume;

    public int getQuantity() {
        return quantity;
    }

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
        nowNumber = maxNumber;
    }

    public void setToMaxVolume() {
        nowVolume = maxVolume;
    }

    public void setToMinNumber() {
        nowNumber = minNumber;
    }

    public void setToMinVolume() {
        nowVolume = minVolume;
    }

    public Radio(int quantity) {
        this.quantity = quantity;
    }

    public Radio() {
        this.quantity = quantity;
    }


    public void setAcceptableNumber(int newNowNumber) {
        if (newNowNumber < minNumber) {
            return;
        }
        if (newNowNumber > maxNumber) {
            return;
        }
        nowNumber = newNowNumber;

        if (newNowNumber == maxNumber) {
            nowNumber = newNowNumber;
        }
        if (newNowNumber < maxNumber) {
            nowNumber = newNowNumber;
        }
    }

    public void setAcceptableVolume(int newNowVolume) {
        if (newNowVolume < minVolume) {
            return;
        }
        if (newNowVolume > maxVolume) {
            return;
        }
        nowVolume = newNowVolume;

        if (newNowVolume == maxVolume) {
            nowVolume = newNowVolume;
        }
        if (newNowVolume < maxVolume) {
            nowVolume = newNowVolume;
        }
    }

    public void prevNumber() {
        if (nowNumber == minNumber) {
            nowNumber = maxNumber;
        } else {
            nowNumber = nowNumber - 1;
        }
    }

    public void nextNumber() {
        if (nowNumber == maxNumber) {
            nowNumber = minNumber;
        } else {
            nowNumber = nowNumber + 1;
        }
    }

    public void minVolume() {
        if (nowVolume == minVolume) {
            nowVolume = minVolume;
        } else {
            nowVolume = nowVolume - 1;
        }
    }

    public void maxVolume() {
        if (nowVolume == maxVolume) {
            nowVolume = maxVolume;
        } else {
            nowVolume = nowVolume + 1;
        }
    }
}




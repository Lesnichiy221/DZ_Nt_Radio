package org.example.Dz_Nt_Radio;

public class Radio {

    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0){
            return;
        }
        if (newCurrentRadioStation > 10){
            return;
        }
        currentRadioStation = newCurrentRadioStation;

    }

    public int pushButtonNext(boolean buttonNext){
        if (buttonNext){
            if (currentRadioStation < 9){
                currentRadioStation = currentRadioStation + 1;
            }
            if (currentRadioStation == 9) {
                currentRadioStation = 0;
            }
        }
        return currentRadioStation;
    }

    public int pushButtonPrev(boolean buttonPrev){
        if (buttonPrev){
            if (currentRadioStation > 0){
                currentRadioStation = currentRadioStation - 1;
            }
            if (currentRadioStation == 0) {
                currentRadioStation = 9;
            }
        }
        return currentRadioStation;
    }
}


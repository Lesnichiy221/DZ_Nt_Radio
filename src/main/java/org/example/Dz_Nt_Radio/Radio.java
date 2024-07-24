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
        if (newCurrentRadioStation >= 10){
            return;
        }
        currentRadioStation = newCurrentRadioStation;

    }

    public int pushButtonNext(){
        if (currentRadioStation < 9){
            currentRadioStation = currentRadioStation + 1;
        }else if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
        return currentRadioStation;
    }

    public int pushButtonPrev(){
        if (currentRadioStation > 0){
            currentRadioStation = currentRadioStation - 1;
        }else if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }
}


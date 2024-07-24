package org.example.Dz_Nt_Radio;

public class RadioVolume {

    private int currentVolumeLvl;

    public int getCurrentVolumeLvl() {
        return currentVolumeLvl;
    }

    public void setCurrentVolumeLvl(int newCurrentVolumeLvl) {
        if (newCurrentVolumeLvl < 0){
            return;
        }
        if (newCurrentVolumeLvl >= 101){
            return;
        }

        currentVolumeLvl = newCurrentVolumeLvl;
    }

    public void increaseVolumeLvl(){
        if (currentVolumeLvl < 100){
            currentVolumeLvl = currentVolumeLvl + 1;
        }
        if (currentVolumeLvl == 100){
            return;
        }

    }

    public void dicreaseVolumeLvl(){
        if (currentVolumeLvl > 0){
            currentVolumeLvl = currentVolumeLvl - 1;
        }
        if (currentVolumeLvl == 0){
            return;
        }

    }

}

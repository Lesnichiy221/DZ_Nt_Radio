import org.example.Dz_Nt_Radio.Radio;
import org.example.Dz_Nt_Radio.RadioVolume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shoudMakeRadioBigger(){

        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int acctual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, acctual);
    }

    @Test
    public void shouldMake0After9(){

        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.pushButtonNext(true);

        int expected = 0;
        int acctual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, acctual);


    }

    @Test
    public void shouldMake9prev0(){

        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.pushButtonPrev(true);

        int expected = 9;
        int acctual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, acctual);
    }

    @Test
    public void shouldIncreaseVolueam(){

        RadioVolume radioVol = new RadioVolume();

        radioVol.setCurrentVolumeLvl(99);
        radioVol.increaseVolumeLvl();

        int expected = 100;
        int actual = radioVol.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDicreaseVolueam(){

        RadioVolume radioVol = new RadioVolume();

        radioVol.setCurrentVolumeLvl(100);
        radioVol.dicreaseVolumeLvl();

        int expected = 99;
        int actual = radioVol.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }
}

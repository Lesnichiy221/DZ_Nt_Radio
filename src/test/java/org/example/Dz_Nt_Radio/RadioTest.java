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

        radio.setCurrentRadioStation(10);
        radio.pushButtonNext();

        int expected = 0;
        int acctual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, acctual);


    }

    @Test
    public void shouldMake9prev0(){

        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.pushButtonPrev();

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

    @Test
    public void shouldNotIncreaseVolumeLlv(){

        RadioVolume radioVol = new RadioVolume();

        radioVol.setCurrentVolumeLvl(100);
        radioVol.increaseVolumeLvl();

        int expected = 100;
        int actual = radioVol.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDicreaseVolumeLlv(){

        RadioVolume radioVol = new RadioVolume();

        radioVol.setCurrentVolumeLvl(0);
        radioVol.dicreaseVolumeLvl();

        int expected = 0;
        int actual = radioVol.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetMoreThen100(){

        RadioVolume radioVol = new RadioVolume();


        radioVol.setCurrentVolumeLvl(101);

        int expected = 0;
        int actual = radioVol.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetlessThen0(){

        RadioVolume radioVol = new RadioVolume();


        radioVol.setCurrentVolumeLvl(-1);

        int expected = 0;
        int actual = radioVol.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeLlVTo1(){

        RadioVolume radioVol = new RadioVolume();

        radioVol.setCurrentVolumeLvl(0);
        radioVol.increaseVolumeLvl();

        int expected = 1;
        int actual = radioVol.getCurrentVolumeLvl();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadio(){

        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.pushButtonNext();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDicreaseRadio(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.pushButtonPrev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioMoreThan9(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioLessThan0(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadio9(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadio0(){
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMakeRadioFrom8to9(){

        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.pushButtonNext();

        int expected = 9;
        int acctual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, acctual);


    }

    @Test
    public void getCurrentCountRadio(){
        Radio radio = new Radio(-1);

        Assertions.assertEquals(0, radio.getCountRadio());
    }


}

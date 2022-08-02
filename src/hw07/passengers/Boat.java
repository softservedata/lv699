package hw07.passengers;

import javax.sound.midi.Soundbank;

public class Boat extends WaterVehicle {
    private int volume;

    @Override
    public void isSailing() {
        setVolume(8);
        setPassengers(5);
        System.out.printf("\nThe volume of the boat is %s, it accommodates %s passengers\n",
                getVolume(), getPassengers());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

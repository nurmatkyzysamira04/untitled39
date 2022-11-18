import java.util.Arrays;

public class Hotel extends Home implements Rent {
    public Hotel(Person[] family) {
        super(family);
    }

    @Override
    public int getPeoplength() {
        return getFamily().length;
    }

    @Override
    public void rent() {
        System.out.println("Hotelte jashagandar arenda toloit");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "family=" + Arrays.toString(family) +
                '}';
    }
}

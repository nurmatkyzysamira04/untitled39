public class Hostel extends Home implements Rent {
    public Hostel(Person[] family) {
        super(family);
    }

    @Override
    public int getPeoplength() {
        return getFamily().length;
    }

    @Override
    public void rent() {
        System.out.println("Hostelte jashagandar arenda toloit");
    }
}

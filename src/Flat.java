public class Flat extends Home implements ComService{

    public Flat(Person[] family) {
        super(family);
    }

    @Override
    public void comService() {
        System.out.println("flatte jashagandar com usluga toloit");
    }

    @Override
    public int getPeoplength() {
        return getFamily().length;
    }

}

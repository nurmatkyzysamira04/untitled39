public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(new Person[]{
                new Person("Samira", 18),
                new Person("Saikal", 19),
                new Person("Kyzmonchok", 18)});
        System.out.println(flat);
        flat.comService();
        System.out.println(flat.getPeoplength());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");

        Hostel hostel = new Hostel(new Person[]{
                new Person("Syimyk", 17),
                new Person("Yryrskeldi", 20),
                new Person("Bayaman", 17),});
        System.out.println(hostel);
        hostel.rent();
        System.out.println(hostel.getPeoplength());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Hotel hotel = new Hotel(new Person[]{new Person("Daniyar", 19),
                new Person("Nurik", 19),
                new Person("Sanjar", 20),
                new Person(" Ilim", 19)});
        System.out.println(hotel);
        hotel.rent();
        System.out.println(hotel.getPeoplength());


    }


}
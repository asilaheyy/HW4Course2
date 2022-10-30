public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Mercedes", "AA", 10.0f);
        Bus bus2 = new Bus("Opel", "BB", 12.0f);
        Bus bus3 = new Bus("Renault", "CC", 12.4f);
        Bus bus4 = new Bus("Toyota", "DD", 11.2f);

        PassengerCar car1 = new PassengerCar("BMW", "7", 3.0f);
        PassengerCar car2 = new PassengerCar("Audi", "A8", 3.0f);
        PassengerCar car3 = new PassengerCar("Mercedes", "CLA", 3.0f);
        PassengerCar car4 = new PassengerCar("Lexus", "RX", 3.0f);

        FreightCar fcar1 = new FreightCar("Mercedes", "MM", 12.0f);
        FreightCar fcar2 = new FreightCar("Opel", "OO", 11.5f);
        FreightCar fcar3 = new FreightCar("Opel", "PP", 11.0f);
        FreightCar fcar4 = new FreightCar("Toyota", "TT", 10.5f);

        BusDriver<Bus> a = new BusDriver<>("AA", "A", 5);
        System.out.println(a);
        a.drive(bus1);

        PssgCarDriver<PassengerCar> b = new PssgCarDriver<>("BB", "B", 7);
        System.out.println(b);
        b.drive(car2);

        FrCarDriver<FreightCar> c = new FrCarDriver<>("DD", "C", 9);
        System.out.println(c);
        c.drive(fcar4);
    }
}
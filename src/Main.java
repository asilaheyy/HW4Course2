import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PassengerCar> allCars = new ArrayList<>();
        List<FreightCar> allFCars = new ArrayList<>();
        List<Bus> allBuses = new ArrayList<>();


        Bus bus1 = new Bus("Mercedes", "AA", 10.0f, Bus.Volume.AVERAGE);
        System.out.println(bus1);
        Bus bus2 = new Bus("Opel", "BB", 12.0f, Bus.Volume.SMALL);
        System.out.println(bus2);
        Bus bus3 = new Bus("Renault", "CC", 12.4f, Bus.Volume.BIG);
        System.out.println(bus3);
        Bus bus4 = new Bus("Toyota", "DD", 11.2f, Bus.Volume.VERY_SMALL);
        System.out.println(bus4);

        PassengerCar car1 = new PassengerCar("BMW", "7", 3.0f, true, PassengerCar.BodyType.SEDAN);
        System.out.println(car1);
        PassengerCar car2 = new PassengerCar("Audi", "A8", 3.0f, true, PassengerCar.BodyType.SEDAN);
        System.out.println(car2);
        PassengerCar car3 = new PassengerCar("Mercedes", "GLE", 3.0f, true, PassengerCar.BodyType.COUPE);
        System.out.println(car3);
        PassengerCar car4 = new PassengerCar("Lexus", "RX", 3.0f, true, PassengerCar.BodyType.CROSSOVER);
        System.out.println(car4);

        FreightCar fcar1 = new FreightCar("Mercedes", "MM", 12.0f, true, FreightCar.LiftingCapacity.N3);
        System.out.println(fcar1);
        FreightCar fcar2 = new FreightCar("Opel", "OO", 11.5f, true, FreightCar.LiftingCapacity.N2);
        System.out.println(fcar2);
        FreightCar fcar3 = new FreightCar("Opel", "PP", 11.0f, true, FreightCar.LiftingCapacity.N3);
        System.out.println(fcar3);
        FreightCar fcar4 = new FreightCar("Toyota", "TT", 10.5f, true, FreightCar.LiftingCapacity.N1);
        System.out.println(fcar4);


        BusDriver<Bus> a = new BusDriver<>("AA", "D", 5);
        System.out.println(a);
        a.drive(bus1);

        PssgCarDriver<PassengerCar> b = new PssgCarDriver<>("BB", "B", 7);
        System.out.println(b);
        b.drive(car2);

        FrCarDriver<FreightCar> c = new FrCarDriver<>("DD", "C", 9);
        System.out.println(c);
        c.drive(fcar4);

        car2.getCarDriver().add(b);
        System.out.println(car2.getCarDriver());


        car1.printType();
        fcar3.printType();
        bus1.printType();
        car1.runDiagnostics();

        allCars.add(car1);
        allCars.add(car2);
        allCars.add(car3);
        allCars.add(car4);

        System.out.println(allCars);

        allFCars.add(fcar1);
        allFCars.add(fcar2);
        allFCars.add(fcar3);
        allFCars.add(fcar4);
        System.out.println(allFCars);

        allBuses.add(bus1);
        allBuses.add(bus2);
        allBuses.add(bus3);
        allBuses.add(bus4);
        System.out.println(allBuses);


        Sponsors sponsor1 = new Sponsors("K.L", 3000);
        Sponsors sponsor2 = new Sponsors("O.L", 5000);
        Sponsors sponsor3 = new Sponsors("A.N", 1000);

        bus1.getSponsor().add(sponsor1);
        bus1.getSponsor().add(sponsor2);
        System.out.println(bus1.getSponsor().size());
        System.out.println(bus1.getSponsor());

        Mechanics mechanic1 = new Mechanics("Василий А","АОА", "Легковые автомобили, Автобусы");
        Mechanics mechanic2 = new Mechanics("Алексей К", "ППР", "Грузовые автомобили");

        mechanic1.doDiagnostics(bus2);
        car2.getMechanics().add(mechanic1);
        System.out.println(car2.getMechanics());
        fcar4.getMechanics().add(mechanic2);
        System.out.println(fcar4.getMechanics());

        MechanicStation<Car> station = new MechanicStation<Car>();
        station.addCar(car3);
        station.addCar(fcar4);
        station.addCar(bus2);
        station.runMechanics();


    }

}
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FreightCar extends Car implements Compeatable {

    public enum LiftingCapacity {
        N1("Грузоподъемность до 3,5 тонн"), N2("Грузоподъемность свыше 3,5 до 12 тонн"), N3("Грузоподъемность свыше 12 тонн");
        private String liftingCapacity;

        LiftingCapacity(String liftingCapacity) {
            this.liftingCapacity = liftingCapacity;
        }

        public String getLiftingCapacity() {
            return liftingCapacity;
        }


        public String toString() {
            return liftingCapacity;
        }
    }

    public LiftingCapacity liftingCapacity;
    public boolean diagnostics;
    private Set<Car> allCars;
    private Set<Mechanics> mechanics;
    private Set<Sponsors> sponsor;
    private Set<FrCarDriver> carDriver;


    public FreightCar(String brand, String model, float engineVolume, boolean diagnostics, LiftingCapacity liftingCapacity) {
        super(brand, model, engineVolume);
        setLiftingCapacity(liftingCapacity);
        isDiagnostics(diagnostics);
        allCars = new HashSet<>();
        mechanics = new HashSet<>();
        sponsor = new HashSet<>();
        carDriver = new HashSet<>();
    }

    public LiftingCapacity setLiftingCapacity(LiftingCapacity liftingCapacity) {
        if (liftingCapacity == null) {
            this.liftingCapacity = LiftingCapacity.N1;
        }
        return this.liftingCapacity = liftingCapacity;
    }

    public Set<Car> getAllCars() {
        return allCars;
    }

    public Set<Mechanics> getMechanics() {
        return mechanics;
    }

    public Set<Sponsors> getSponsor() {
        return sponsor;
    }

    public Set<FrCarDriver> getCarDriver() {
        return carDriver;
    }

    @Override
    public void toSponse() {
        System.out.println("Грузовой автомобиль " + getBrand() + getModel() + " спонсируется " + getSponsor());
    }

    @Override
    public void start() {
        System.out.println("Грузовой автомобиль начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Грузовой автомобиль закончил движение.");
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Грузовой автомобиль проходит диагностику.");
    }

    @Override
    public void printType() {
        if (liftingCapacity == null) {
            System.out.println("Недостаточно данных.");
        } else {
            System.out.println(liftingCapacity);
        }

    }

    private String pitStop = getBrand() + " " + getModel() + " На питстопе";

    @Override
    public String pitStop() {
        return pitStop;
    }

    @Override
    public void bestTime(Float bestTime) {
        System.out.println("Лучшее время " + getBrand() + " " + getModel() + " - " + bestTime + " мин.");
    }

    @Override
    public void maxSeed(Float maxSpeed) {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " " + maxSpeed + " км/ч.");
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль " + getBrand() + " " + getModel() + ". Объем двигателя " + getEngineVolume() + " л. " + liftingCapacity;
    }

    public boolean isDiagnostics(boolean value) throws DiagnosticsException {
        if (value == false) {
            throw new DiagnosticsException("Требуется диагностика." + getBrand() + getModel());
        }
        return true;
    }
}

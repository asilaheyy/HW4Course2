import java.util.ArrayList;
import java.util.List;

public class PassengerCar extends Car implements Compeatable {

    public enum BodyType {
        SEDAN("Седан"), HATCHBACK("Хетчбэк"), COUPE("Купе"), UNIVERSAL("Универсал"), ROVER("Внедорожник"), CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн");

        private String bodyType;


        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return bodyType + " ";
        }
    }


    private List<PassengerCar> allCars;
    private List<Mechanics> mechanics;
    private List<Sponsors> sponsor;
    private List<PssgCarDriver> carDriver;

    public BodyType bodyType;
    public boolean diagnostics;

    public PassengerCar(String brand, String model, float engineVolume, boolean diagnostics, BodyType bodyType) {
        super(brand, model, engineVolume);
        setBodyType(bodyType);
        isDiagnostics(diagnostics);
        allCars = new ArrayList<>();
        mechanics = new ArrayList<>();
        sponsor = new ArrayList<>();
        carDriver = new ArrayList<>();

    }

    public List<PassengerCar> getAllCars() {
        return allCars;
    }

    public List<Sponsors> getSponsor() {
        return sponsor;
    }

    public List<PssgCarDriver> getCarDriver() {
        return carDriver;
    }

    public BodyType setBodyType(BodyType bodyType) {
        if (bodyType == null) {
            this.bodyType = BodyType.SEDAN;
        }
        return this.bodyType = bodyType;
    }

    private String pitStop = getBrand() + " " + getModel() + " На питстопе";

    @Override
    public void start() {
        System.out.println("Легковой автомобиль начал движение.");

    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Недостаточно данных.");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public void toSponse() {
        System.out.println("Автомобиль " + getBrand() + getModel() + " спонсируется " + getSponsor());
    }

    @Override
    public void runDiagnostics() {
        System.out.println("Автомобиль проходит диагностику.");
    }

    @Override
    public void stop() {
        System.out.println("Легковой автомобиль закончил движение.");
    }

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
        return "Автомобиль " + getBrand() + " " + getModel() + " " + bodyType + ". Объем двигателя " + getEngineVolume() + " л.";
    }

    public boolean isDiagnostics(boolean value) throws DiagnosticsException {
        if (value == false) {
            throw new DiagnosticsException("Требуется диагностика." + getBrand() + getModel());
        }
        return true;
    }

    public List<Mechanics> getMechanics() {
        return mechanics;
    }

}


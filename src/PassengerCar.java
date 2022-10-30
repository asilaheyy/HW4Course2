public class PassengerCar extends Car implements Compeatable {
    public PassengerCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    private String pitStop = getBrand() + " " + getModel() + " На питстопе";

    @Override
    public void start() {
        System.out.println("Легковой автомобиль начал движение.");

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
}


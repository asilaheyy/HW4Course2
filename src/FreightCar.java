public class FreightCar extends Car implements Compeatable {
    public FreightCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Грузовой автомобиль начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Грузовой автомобиль закончил движение.");
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

}

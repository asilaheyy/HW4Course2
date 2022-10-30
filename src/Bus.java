public class Bus extends Car implements Compeatable {
    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Автобус закончил движение.");
    }

    private String pitStop = getBrand() + " " + getModel() + " На питстопе";

    @Override
    public String pitStop() {
        getBrand();
        getModel();
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

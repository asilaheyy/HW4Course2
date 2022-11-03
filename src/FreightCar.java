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


    public FreightCar(String brand, String model, float engineVolume, LiftingCapacity liftingCapacity) {
        super(brand, model, engineVolume);
        setLiftingCapacity(liftingCapacity);
    }

    public LiftingCapacity setLiftingCapacity(LiftingCapacity liftingCapacity) {
        if (liftingCapacity == null) {
            this.liftingCapacity = LiftingCapacity.N1;
        }
        return this.liftingCapacity = liftingCapacity;
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
}

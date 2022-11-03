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


    public BodyType bodyType;

    public PassengerCar(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        setBodyType(bodyType);
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
}


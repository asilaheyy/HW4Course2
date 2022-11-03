public class Bus extends Car implements Compeatable {

    public enum Volume {
        VERY_SMALL("Вместимость до 10 мест"), SMALL("Вместимость до 25 мест"), AVERAGE("Вместимость до 40-50 мест"), BIG("Вместимость до 60-80 мест"), VERY_BIG("Вместимость до 100-120 мест");

        private String volume;

        Volume(String volume) {
            this.volume = volume;
        }

        public String getVolume() {
            return volume;
        }


        @Override
        public String toString() {
            return volume + " ";
        }
    }

    public Volume volume;

    public Bus(String brand, String model, float engineVolume, Volume volume) {
        super(brand, model, engineVolume);
        setVolume(volume);
    }

    public Volume setVolume(Volume volume) {
        if (volume == null) {
            this.volume = Volume.AVERAGE;
        }
        return this.volume = volume;
    }

    @Override
    public void start() {
        System.out.println("Автобус начал движение.");
    }

    @Override
    public void stop() {
        System.out.println("Автобус закончил движение.");
    }

    @Override
    public void printType() {
        if (volume == null) {
            System.out.println("Недостаточно данных.");
        } else {
            System.out.println(volume);
            ;
        }

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
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel() + " " + maxSpeed + " км/ч. ");
    }

    @Override
    public String toString() {
        return "Автобус " + getBrand() + " " + getModel() + ". Объем двигателя " + getEngineVolume() + " л. " + volume;
    }
}

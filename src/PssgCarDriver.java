public class PssgCarDriver<B extends PassengerCar> {

    private String name;
    private String drivingLisence;
    private int experience;

    private static final String INVALID_LISENCE = "Неправильный тип лицензии.";


    public PssgCarDriver(String name, String drivingLisence, int experience) {
        setName(name);
        setDrivingLisence(drivingLisence);
        this.experience = experience;
    }

    public void drive(B PassengerCar) {
        System.out.println("Водитель " + getName() + " за рулем автомобиля " + PassengerCar.getBrand());
    }

    public void startDrive(B passengerCar) {
        System.out.println("Начал движение на автомобиле" + " - водитель " + getName());
    }

    public void stopDrive(B passengerCar) {
        System.out.println("Остановил автомобиль" + " - водитель " + getName());
    }

    public void refillCar(B passengerCar) {
        System.out.println("Заправляю автомобиль" + " - водитель " + getName());
    }

    public String getName() {
        return name;
    }

    public String getDrivingLisence() {
        return drivingLisence;
    }

    public int getExperience() {
        return experience;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "default";
        } else {
            this.name = name;
        }
    }

    public void setDrivingLisence(String drivingLisence) throws DriverLicenseException {
        if (drivingLisence != "B" || drivingLisence == null || drivingLisence.isBlank()) {
            throw new DriverLicenseException(INVALID_LISENCE);
        } else {
            this.drivingLisence = drivingLisence;
        }
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель легкового автомобиля : " + name +
                ", лицензия : " + drivingLisence +
                ", опыт вождения: " + experience +
                " лет.";
    }
}

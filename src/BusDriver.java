public class BusDriver<A extends Bus> {

    private String name;
    private String drivingLisence;
    private int experience;

    private static final String INVALID_LISENCE ="Неправильный тип лицензии.";

    public BusDriver(String name, String drivingLisence, int experience) {
        setName(name);
        setBusDrivingLisence(drivingLisence);
        this.experience = experience;
    }

    public void drive(A bus) {
        System.out.println("Водитель " + getName() + " за рулем автобуса " + bus.getBrand());
    }

    public void startDrive(A bus) {
        System.out.println("Начал движение на автобусе" + " - водитель " + getName());
    }

    public void stopDrive(A bus) {
        System.out.println("Остановил автобус" + " - водитель " + getName());
    }

    public void refillCar(A bus) {
        System.out.println("Заправляю автобус" + " - водитель " + getName());
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

    public void setBusDrivingLisence(String drivingLisence) throws DriverLicenseException {
        if (drivingLisence != "D" || drivingLisence == null || drivingLisence.isBlank()) {
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
        return "Водитель автобуса : " + name +
                ", лицензия : " + drivingLisence +
                ", опыт вождения: " + experience +
                " лет.";
    }
}

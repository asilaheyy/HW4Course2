public class FrCarDriver<F extends FreightCar> {

    private String name;
    private String drivingLisence;
    private int experience;

    public FrCarDriver(String name, String drivingLisence, int experience) {
        setName(name);
        setDrivingLisence(drivingLisence);
        this.experience = experience;
    }

    public void drive(F freightCar) {
        System.out.println("Водитель " + getName() + " за рулем грузовика " + freightCar.getBrand());
    }

    public void startDrive(F freightCar) {
        System.out.println("Начал движение на грузовике" + " - водитель " + getName());
    }

    public void stop() {
        System.out.println("Остановил грузовик" + " - водитель " + getName());

    }

    public void refillCar() {
        System.out.println("Заправляю грузовик" + " - водитель " + getName());

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

    public void setDrivingLisence(String drivingLisence) {
        if (drivingLisence != "C" || drivingLisence == null || drivingLisence.isBlank()) {
            this.drivingLisence = "Неправильный тип лицензии";
        } else {
            this.drivingLisence = drivingLisence;
        }
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель грузовика : " + name +
                ", лицензия : " + drivingLisence +
                ", опыт вождения: " + experience +
                " лет.";
    }
}

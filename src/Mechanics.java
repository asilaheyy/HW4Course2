public class Mechanics {
    private String name;
    private String company;
    private String qualification;

    public Mechanics(String name, String company, String qualification) {
        this.name = name;
        this.company = company;
        this.qualification = qualification;

    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getQualification() {
        return qualification;
    }

    public void doDiagnostics(Car car) {
        System.out.println(getName() + " проводит тех.обслуживание." + car.getBrand() + car.getModel());
    }

    public void fixCar() {
        System.out.println("Чиню.");
    }

    @Override
    public String toString() {
        return "Механик " + getName() + ". Компания " + getCompany() + ". Квалификация " + getQualification();
    }
}

public class Sponsors {

    private String name;
    private int sum;

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public Sponsors(String name, int sum) {
        this.name = name;
        this.sum = sum;

    }

    @Override
    public String toString() {
        return "Спонсор "+getName()+".Сумма спонсирования "+getSum();
    }
}

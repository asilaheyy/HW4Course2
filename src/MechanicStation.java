import java.util.*;

public class MechanicStation<T extends Car> {

    private Set<Car> queue = new HashSet<>();

    public void addCar(T car){
        queue.add(car);
    }

    public void runMechanics( T car) {
        queue.add(car);
        if (car == null || (car instanceof Bus) ) {
            System.out.println("Очередь пуста.");
        }else {
            System.out.println(car + " на станции техобслуживания.");
            runMechanics(car);
        }
    }

    public int queueSize(){
        return queue.size();
    }

}

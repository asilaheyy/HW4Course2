import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MechanicStation<T extends Car> {

    private Queue<T> queue = new ArrayDeque<>();

    public void addCar(T car){
        queue.offer(car);
    }

    public void runMechanics() {
        T car = queue.poll();
        if (car == null || (car instanceof Bus) ) {
            System.out.println("Очередь пуста.");
        }else {
            System.out.println(car + " на станции техобслуживания.");
            runMechanics();
        }
    }

    public int queueSize(){
        return queue.size();
    }

}

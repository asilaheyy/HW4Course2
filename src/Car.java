import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    private String brand;
    private String model;
    private float engineVolume;

    public abstract void runDiagnostics();

    public abstract void start();

    public abstract void stop();

    public abstract void printType();

    public abstract void toSponse();

    public Car(String brand, String model, float engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);

    }

    public final void setBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public final void setModel(String model) {
        if (model == null || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public final void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 0f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

}



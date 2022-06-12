public class Car {
    public String name;
    public int maxSpeed;
    public boolean accelerator;
    public String gearBox;
    public double price;

    public Car(String name, String gearBox, double price) {
        this.name = name;
        this.gearBox = gearBox;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isAccelerator() {
        return accelerator;
    }

    public void setAccelerator(boolean accelerator) {
        this.accelerator = accelerator;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

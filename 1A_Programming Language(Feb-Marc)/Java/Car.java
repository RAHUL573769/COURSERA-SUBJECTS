public class Car {

    private String make = "India"; // changed to private
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public Car() {
    }

    public void describeCar() {
        System.out.println(doors + " Doors");
        System.out.println(make + " Make");
    }

    public void setMake(String make) {
        if (make == null) {
            this.make = "Unknown";
            return;
        }

        String lowerCaseMake = make.toLowerCase();

        switch (lowerCaseMake) {
            case "toyota":
            case "ford":
            case "honda":
            case "tesla":
                this.make = make;
                break;

            default:
                this.make = "Unsupported";
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}

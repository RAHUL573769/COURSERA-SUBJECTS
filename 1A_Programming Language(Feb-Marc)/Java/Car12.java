public class Car12 {

    private String make;
    private String model = "Toyota";
    private String color = "Blue";
    private boolean convertible;

    public String getMake() {
        return make;
    }

    public void setConvertible(boolean Convertible) {
        this.convertible = Convertible;
    }

    public void describeCar() {
        System.out.println(color + " color, " + model + " model" + convertible);
    }
}
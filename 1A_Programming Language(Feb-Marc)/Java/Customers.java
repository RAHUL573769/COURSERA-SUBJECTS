public class Customers {

    private String name;
    private String email;
    private double credentials;

    // Full constructor
    public Customers(String name, String email, double credentials) {
        this.name = name;
        this.email = email;
        this.credentials = credentials;
    }

    // Overloaded constructor (only name)
    public Customers(String name) {
        this(name, "", 0.0);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCredentials() {
        return credentials;
    }
}

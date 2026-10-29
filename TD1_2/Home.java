package TD1_2;

public class Home {
    // Private variables
    private String owner;
    private String address;
    private double surface;

    // Constructor
    public Home(String owner, String address, double surface) {
        this.owner = owner;
        this.address = address;
        this.surface = surface;
    }

    // Getters & setters
    public String getOwner() {
        return owner;
    }
    public String getAddress() {
        return address;
    }
    public double getSurface() {
        return surface;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setSurface(double surface) {
        this.surface = surface;
    }

    // Methods
    public double tax() {
        return 2*surface;
    }

    // Print
    @Override
    public String toString() {
        return "Home[owner=" + owner + ",address=" + address + ",surface=" + surface  + "]";
    }
}

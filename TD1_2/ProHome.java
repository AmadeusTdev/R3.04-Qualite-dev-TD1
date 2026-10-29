package TD1_2;

public class ProHome extends Home {
    // Private variables
    private  int nbEmployes;

    // Constructor
    public ProHome(String owner, String address, double surface, int nbEmployes) {
        super(owner, address, surface);
        this.nbEmployes = nbEmployes;
    }

    // Getters & setters
    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    // Methods
    @Override
    public double tax() {
        return super.tax()+(150*nbEmployes);
    }
}

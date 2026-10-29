package TD1_2;

public class PersonalHome extends Home {
    // Private variables
    private int nbPiece;
    private boolean hasPool;

    // Constructor
    public PersonalHome(String owner, String address, double surface, int nbPiece, boolean hasPool) {
        super(owner, address, surface);
        this.nbPiece = nbPiece;
        this.hasPool = hasPool;
    }

    // Getters & setters
    public int getNbPiece() {
        return nbPiece;
    }
    public boolean getHasPool() {
        return hasPool;
    }

    public void setNbPiece(int nbPiece) {
        this.nbPiece = nbPiece;
    }
    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    // Methods
    @Override
    public double tax() {
        int poolTax = 0;
        if (hasPool == true) {poolTax = 80; }
        return super.tax()+(15*nbPiece)+poolTax;
    }
}

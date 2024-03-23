// Add Employer class - // Add Employer class - get / set methods

public class Employer {

    private int ID;
    String name;
    String address;

    Employer(int ID, String name, String address) {

        this.ID = ID;
        this.name = name;
        this.address = address;

    }

    public int getID() {
        return ID;
    }
}

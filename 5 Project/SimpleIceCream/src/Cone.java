public class Cone implements Eat {

    Flavor flavor;

    Cone() {
    }

    Cone(Flavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public void eatable() {
        System.out.println(flavor);
    }

}

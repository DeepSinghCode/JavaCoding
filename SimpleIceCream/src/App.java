
public class App extends Cone {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Eat cone = new Cone(Flavor.Choclate);
        cone.eatable();
    }
}

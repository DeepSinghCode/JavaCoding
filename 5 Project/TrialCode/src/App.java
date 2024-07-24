public class App {

    static int var() {

        try {
            int i = 1 / 0;
            return i;

        } catch (ArithmeticException ae) {
            System.out.println("var exception");
            return 1;
        }

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try {
            App app = new App();
            app.var();
            System.out.println("before main exception");

        } catch (Exception e) {
            System.out.println("after main method exception");
        }

    }
}

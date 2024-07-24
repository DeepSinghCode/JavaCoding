public class Test {

    public String div() {
        try {
            int i = 5 / 0;
            return ("s1");

        } catch (Exception e) {
            System.out.println(e);
            return "Stinng";
        }
    }

    public static void main(String args[]) {

        try {
            Test test = new Test();
            test.div();
        } catch (Exception e) {
            System.out.println("last");
        }
    }
}
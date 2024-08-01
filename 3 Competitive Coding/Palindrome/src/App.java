public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String string1 = "radar";

        boolean b1 = isPalindrame(string1);

        System.out.println(b1);
    }

    public static boolean isPalindrame(String str) {

        int i1 = 0;
        int i2 = str.length() - 1;
        if (i1 < i2) {

            if (str.charAt(i1) != str.charAt(i2)) {
                return false;
            }

            i1++;
            i2--;
        }
        return true;

    }

}

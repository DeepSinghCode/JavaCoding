public class App {

    static String sample = "String";

    public static void main(String[] args) throws Exception {
        String s1 = App.reverseString(sample);
        System.out.println(s1);
    }

    static String reverseString(String s) {
        int j = s.length();
        StringBuilder sBuilder = new StringBuilder("");
        char[] c = s.toCharArray();
        for (int i = j; i > 0; i--) {
            sBuilder = sBuilder.append(c[i - 1]);
        }
        return sBuilder.toString();
    }

}

import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        String s = "abc";
        String t = "cab";
        int res = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), i);
            tMap.put(t.charAt(i), i);
        }

        for (char key : sMap.keySet()) {
            res += Math.abs(sMap.get(key) - tMap.get(key));
        }
        System.out.println(res);

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        int[] checkArray = { 1, 2, 3, 4 };
        System.out.println(parityArray(checkArray));
    }

    static boolean parityArray(int[] array) {
        if (array.length == 0) {
            return true;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if ((array[i] % 2 == 0 && array[i + 1] % 2 == 0) || (array[i] % 2 != 0 && array[i + 1] % 2 != 0)) {
                    return false;
                }
            }
            return true;
        }

    }
}

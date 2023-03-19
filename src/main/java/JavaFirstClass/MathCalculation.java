package JavaFirstClass;

public interface MathCalculation {

    public static int value = 100;
    static int n = 10;

    void fibonacci(int number);

    default void printNthNum() {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void odd(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.printf(i + " ");
            }
            System.out.println("");
        }
    }

    //java: private interface methods are not supported in -source 8
    /*private void even() {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf(i + " ");
            }
            System.out.println("");
        }
    }*/
}

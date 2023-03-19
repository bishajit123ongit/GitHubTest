package JavaFirstClass;

public class TestMathCalc implements SixthAssignment.Interface.MathCalculation {
    public static int value = 500;

    @Override
    public void fibonacci(int number) {
        int i, n;
        int t1 = 0, t2 = 1;
        int nextTerm = t1 + t2;
        n = number;
        System.out.print("Fibonacci Series: " + t1 + " " + t2);
        // print 3rd to nth terms
        for (i = 3; i <= n; ++i) {
            System.out.println(nextTerm);
            t1 = t2;
            t2 = nextTerm;
            nextTerm = t1 + t2;
        }
    }

    public static void main(String[] args) {
        TestMathCalc tm = new TestMathCalc();
        tm.fibonacci(10);
        System.out.println(TestMathCalc.value);
        tm.printNthNum();
        SixthAssignment.Interface.MathCalculation.odd(10);
    }
}

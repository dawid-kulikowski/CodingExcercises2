//The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
//
//
//        love6(6, 4) → true
//        love6(4, 5) → false
//        love6(1, 5) → true

public class Love6 {
    private int a;
    private int b;


    public Love6(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public boolean love6(int a, int b) {

        int plus = Math.abs(a-b);
        int minus = Math.abs(a+b);

        if (a == 6 || b == 6){
            return true;
        } else if (plus == 6 || minus == 6) {
            return true;
        } else {
            return false;
        }
    }

}

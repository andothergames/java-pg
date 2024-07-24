package fundamentals;
public class Function {
    public static void main(String[] args) {
        //overloading a method with diff combs of pars
        int x = numberSupplier(4, 5);
        System.out.println(x);
        int y = numberSupplier();
        System.out.println(y);
    }

    //method's method signature - all have to be unique
    //private is access modifier
    private static int numberSupplier() {
        // if you are calling it from static, declare as static
        // functions in lower camelcase
        // before function name declare output type (or void)
        return 1;
    }

    //this is unique method signature as diff args
    private static int numberSupplier(int x, int y) {
        return x+y;
    }

}

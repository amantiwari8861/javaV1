package appfuncs.simplefuncs;

public class SimpleMathFuncs {
    // Determine if a is a factor of b.
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0)
            return true;
        return false;
    }

    // Return the smallest positive factor that a and b have in common.
    public static int lcf(int a, int b) {
        // Factor using positive values.
        a = Math.abs(a);
        b = Math.abs(b);
        int min = a < b ? a : b;
        for (int i = 2; i <= min / 2; i++) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }

    // Return the largest positive factor that a and b have in common.
    public static int gcf(int a, int b) {
        // Factor using positive values.
        a = Math.abs(a);
        b = Math.abs(b);
        int min = a < b ? a : b;
        for (int i = min / 2; i >= 2; i--) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }
}

//javac -d appmodules\appfuncs appsrc\appfuncs\appfuncs\simplefuncs\SimpleMathFuncs.java
// javac -d appmodules\appfuncs appsrc\appfuncs\module-info.java

// or 

// javac -d appmodules\appfuncs appsrc\appfuncs\module-info.java appsrc\appfuncs\appfuncs\simplefuncs\SimpleMathFuncs.java

// javac --module-path appmodules -d appmodules\appstart
// appsrc\appstart\module-info.java
// appsrc\appstart\appstart\mymodappdemo\MyModAppDemo.java

// java --module-path appmodules -m appstart/appstart.mymodappdemo.MyModAppDemo

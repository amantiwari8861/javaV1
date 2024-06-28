package com.testjython;
import org.python.util.PythonInterpreter;
import org.python.core.*;

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec(
        "import numpy as np\n"+
        "arr_1d = np.array([1,2,3])\n"+
        "total_sum = np.sum(arr_1d)\n"+
        "print(\"Sum of Elements:\")\n"+
        "print(total_sum)\n"+
        "print('Hello from Jython!')"        
        );

    }
}

// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
    public static int factorial(int n){
        int fac = 1;

        if(n < 0) {
            throw new IllegalArgumentException("Angka tidak boleh negatif!");
        }

        if(n > 16) {
            throw new IllegalArgumentException("Angka tidak boleh lebih dari 16!");
        }

        for (int i=n; i>0; i--)
            fac *= i;
        return fac;
    }
}
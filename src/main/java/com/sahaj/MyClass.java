package com.sahaj;

public class MyClass {
    public int multiply(int a,int b)
    {
        return a*b;
    }

    public void methodToExpected(int a) throws IllegalArgumentException
    {
        try{
            if(a<0)
                throw new IllegalArgumentException("Negative value not allowed");
            System.out.println("a: "+ a);
        }
        catch (IllegalArgumentException e)
        {
            throw new IllegalArgumentException("Negative value not allowed");
        }
    }
}

package org.example.doublecolon;

public class Calculator implements Calculate {
    @Override
    public void calculate(int x, int y) {

    }


    public static void findSum(int x, int y){
        System.out.println( "Sum " + (x+y));
    }

    public void findMultiply(int x, int y){
        System.out.println( "Multiply " + (x*y));
    }
}

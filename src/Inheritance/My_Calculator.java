/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author ThanhLe
 */
class Calculator {
    int z;
    public void addition(int x, int y) {
        z = x + y;
        System.out.println("the sum of given numbers: "+z);
    }
    public void subtraction(int x, int y) {
        z= x-y;
        System.out.println("the difference between of given numbers: "+z);
    }
}

public class My_Calculator extends Calculator {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("the product of the given nummbers: "+z);
    }
    public static void main(String as[]) {
        My_Calculator cal = new My_Calculator();
        cal.addition(10, 20);
        cal.subtraction(30, 20);
        cal.multiplication(40, 50);
    }
}

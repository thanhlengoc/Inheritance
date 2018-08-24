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
class Super_class {
    int num = 20;
    int age;
    
    Super_class(int age) {
        this.age = age;
    }
    public void display() {
        System.out.println("display in super class.");
    }
    public void getAge(){
        System.out.println(age);
    }
}
public class Sub_class extends Super_class { 
    Sub_class(int age) {
        super(age);
    }
    //Sub_class() {}
    int num = 10;
    public void display(){
        System.out.println("display in subclass");
    }
    /*public void my_method()  {
        Sub_class sub = new Sub_class();
        
        sub.display();
        super.display();
        
        System.out.println("num of super class: "+super.num);
        System.out.println("num of subclass: "+sub.num);
    }*/
    public static void main(String as[]) {
        //Sub_class obj = new Sub_class();
        //obj.my_method();
        Sub_class s = new Sub_class(24);
        s.getAge();
    }
}

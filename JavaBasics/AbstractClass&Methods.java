public class MyClass {
    public static void main(String args[]) {
      B obj1 = new B();
      obj1.display(); //Display Function
      obj1.show(); //Show function
    }
}

abstract class A{   //Abstract class have abstract methods & concrete methods & abstract 			class gives partial abstraction.
    abstract void display();  //Only declaration & definition should be in derived class.
    void show(){
        System.out.println("Show function");
    }
}

class B extends A{
    void display(){
        System.out.println("Display Function");
    }
}

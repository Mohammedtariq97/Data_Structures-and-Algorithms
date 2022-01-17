public class MyClass {
    public static void main(String args[]) {
        A obj1 = new A();
        A obj2 = new A(10);
        
        obj1.display();
        obj1.display(10,20);
    }
}

class A{
    //constructor overloading
    A(){
        System.out.println("Constructor without arguments");
    }
    A(int a){
        System.out.println("Constructor with arguments");
    }

    //method overloading and operator overloading
    void display(){
        System.out.println("Method without arguments");
    }
    
    void display(int a,int b){
        System.out.println("Method without arguments "+(a+b));
    }
}

class Parent {
    // Final method
    final double PI = 3.14;
    PI +=3.14;
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    /*void display() {
        System.out.println("This method cannot be overridden.");
        */
    
}

public class FinalDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();
    }
}
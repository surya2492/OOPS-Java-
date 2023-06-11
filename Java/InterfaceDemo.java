interface Vehical{
    abstract void ride();

    default void ride1()
    {

    }

}

interface Vehical1{
    void ride();

}
class Car implements Vehical,Vehical1{
    public void ride()
    {
        System.out.println("You are Riding Car");

    }
}
class Bike implements Vehical{
    public void ride()
    {
        System.out.println("You are Riding a Bike ");

    }
}
class Mechanic{
    void check( Vehical v )
    {
        System.out.println("Checking");
        v.ride();

    }
}


public class InterfaceDemo {
    public static void main(String[] args)
    {   
        Mechanic m = new Mechanic();
        Car c = new Car();
        Bike b= new Bike();
        m.check(c);
        m.check(b);


    }
}

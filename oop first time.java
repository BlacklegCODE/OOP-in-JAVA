

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);

        car.start();
    }
}

//

//car.java below

public class Car
{
    String make = "Indigo LS";
    String model = "LS";
    int year = 2012;
    double price = 15.00000;

    void start()
    {
        System.out.println("You start the engine !");
    }
    void stop()
    {
        System.out.println("You stop the engine !");
    }


}

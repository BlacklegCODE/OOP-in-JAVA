//Main file below 

public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car();

        System.out.println(car1.jawline);
        System.out.println(car1.rating);
        System.out.println(car1.height);
    }
}

//Car.java below

public class Car
{
    String height;
    String looks;
    String jawline;
    boolean attractice;
    double rating;

    public Car()
    {
        this.height = "Just tall....enough..";
        this.looks = "Descent...";
        this.jawline = "Will cut you open !!";
        this.attractice = false;
        this.rating = 7.5;
    }

    public void Human()
    {
        this.height = "Just tall....enough..";
        this.looks = "Descent...";
        this.jawline = "Will cut you open !!";
        this.attractice = false;
        this.rating = 7.5;
    }
}


//constructors

public class OOPj
{
    public static void main(String[] args)
    {
        Pen pen1 = new Pen("Blue","Ind","Gel",8);
        Pen pen2 = new Pen("Purple","Nepal","ink",4);
        Pen pen3 = new Pen("Black","China","fountain",9);

        System.out.println(pen1.type);
        System.out.println(pen2.type);

        System.out.println(pen1.color);
        System.out.println(pen2.color);

        System.out.println(pen1.factory);
        System.out.println(pen2.factory);

        System.out.println(pen1.avail);
        System.out.println(pen2.avail);

        System.out.println();
        System.out.println(pen3.avail);
        System.out.println(pen3.type);
        System.out.println(pen3.color);
        System.out.println(pen3.factory);

        System.out.println(pen1.usebefore);
        System.out.println(pen2.usebefore);
        System.out.println(pen3.usebefore);
        System.out.println("Above are use before days");
    }
}

class Pen
{
    String color;
    String factory;
    String type;
    int usebefore;
    boolean avail;


    Pen(String color, String factory, String type, int usebefore)
    {
        this.color = color;
        this.factory = factory;
        this.type = type;
        this.avail = true;
        this.usebefore = usebefore;

    }
}

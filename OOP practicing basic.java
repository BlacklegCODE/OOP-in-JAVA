import javax.xml.transform.Source;

class pen
{
        String color;
        String type;

        public void write()
        {
            System.out.println("Writing something here !");

        }

        public void ptcolor()
        {
            System.out.println(this.color);
        }
        public void pttype()
        {
            System.out.println(this.type);
        }
}

class Stud
{
    String name;
    String age;
    String talent;

    public void ptname()
    {
        System.out.println(this.name);
    }
    public void pttname()
    {
        System.out.println(this.age);
    }
    public void getPtname()
    {
        System.out.println(this.talent);
    }
}

public class OOPj {
    public static void main(String[] args)
    {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "Cyan";
        pen2.type = "Inky";

        pen1.ptcolor();
        pen2.ptcolor();

        pen1.pttype();
        pen2.pttype();

        Stud s1 = new Stud();

        s1.age = "unknown";
        s1.talent = "Null";
        s1.name = "Zoro";

        s1.ptname();
        s1.pttname();
        s1.getPtname();
    }
}

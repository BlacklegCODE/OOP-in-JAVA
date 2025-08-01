public class OOPj
{
    public static void main(String[] args)
    {
        people guy1 = new people();

        guy1.level = "Infinite";
        guy1.type = "Desciplined";

        System.out.println(guy1.level);
        System.out.println(guy1.type);
    }
}

class people
{
    String type;
    String level;

    public void Type()
    {
        System.out.println(this.type);
    }

    public void Level()
    {
        System.out.println(this.level);
    }
}

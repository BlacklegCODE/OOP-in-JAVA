public class Main
{
    public static void main(String[] args)
    {
        User user1 = new User("Harsh");
        User user2 = new User("Zoro","Blackleg@xmail.co.lol");
        User user3 = new User("Sanji","zoro.towasbetter",69);
        User user4 = new User();


        System.out.println(user1.username);
        System.out.println(user1.age);
        System.out.println(user1.email);
        System.out.println();
        System.out.println(user2.username);
        System.out.println(user2.age);
        System.out.println(user2.email);
        System.out.println();
        System.out.println(user3.username);
        System.out.println(user3.age);
        System.out.println(user3.email);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);


    }
}

class User
{
    String username;
    String email;
    int age;

    User()
    {
        this.username = "Guest";
        this.email = "Not needed";
        this.age = 00;
    }
    User(String username)
    {
        this.username = username;
        this.email = "Not available !";
        this.age = 0;
    }

    User(String username, String email)
    {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    User(String username, String email, int age)
    {
        this.username = username;
        this.email = email;
        this.age = 69;
    }
}

import java.util.ArrayList;

public class Arrsylist {
    public static void main(String[] args) {
        
        User u1=new User(101, "Aman", "xyz", 40, 10, 15, 15);

        ArrayList<User> list=new ArrayList<>();

        list.add(u1);
        list.add(new User(102, "Pooja Sharma", "smpj", 5, 3, 5, 8));

        System.out.println(u1);

        // for (User user : list) 
        // {
        //     System.out.println("------------------------------");
            // System.out.println("Id :"+user.getId());
            // System.out.println("Name :"+user.getName());
            // System.out.println("Password :"+user.getPassword());
        // }



    }
}

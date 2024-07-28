public class UnlimitedUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter materials used :");
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            if (data.isEmpty()) {
                break; // Exit the loop if an empty line is entered
            }
            System.out.println(" Material is :" + data);
        }

        System.out.println("byeee");
        // int i=1;
        // while (sc.hasNext())
        // {
        // System.out.println( (i++) +" "+sc.nextLine());
        // }
        sc.close();
    }
}
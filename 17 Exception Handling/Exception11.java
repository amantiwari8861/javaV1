class Exception1 {
    public static void main(String[] args) {
        
        try {
            int arr[]=new int[3];
            System.out.println("hello ");
            try {
                System.out.println(arr[4]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Exception handled");
            }
            System.out.println("hiii");
            System.out.println(10/0);
            System.out.println("hiii");
            System.out.println("hiii");
        } catch (Exception e) {
            System.out.println("exception handled 1");
        }
    }
}

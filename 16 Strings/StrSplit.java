class StrSplit
{
    public static void main(String[] args) {
        
        String str="hello my name is aman";

        String arr[]=str.split(" ");

        /*for (int i = 0; i < arr.length; i++) {
            System.out.println("the value at arr["+i+"]th position is :"+arr[i]);
        }*/
        for (String strings : arr) {
            System.out.println("the String is :"+strings);
        }
    }
}
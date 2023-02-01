class Strfxn5
{
    public static void main(String[] args) {
        String str="hello my name is Aman";
        String strarr[]=str.split(" ");
        for (int i = 0; i < strarr.length; i++) {
            System.out.println("string arr strarr "+i+"th position value :"+strarr[i]);
        }
    }
}
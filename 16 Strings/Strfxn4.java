class Strfxn4
{
    public static void main(String[] args) {
        
        String str="zello sir my oame is Rohit  Rohit";
        System.out.println(str.lastIndexOf("z"));//0th
        System.out.println(str.lastIndexOf("o"));//4th
        // 1st o = 4th 2nd o at 13 3rd o 22
        int str2=str.indexOf("o");// 4
        System.out.println(str2); //4
        System.out.println(str.indexOf("o",(str2+1))); //13
        System.out.println(str.indexOf("Rohit")); //21st position
    }
}
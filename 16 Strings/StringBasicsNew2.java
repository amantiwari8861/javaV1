public class StringBasicsNew2 {

    public static void main(String[] args) {
        
    String name1="Aman";
    // name1.concat("Tiwari");
    // System.out.println(name1);// Aman why ?

    //Note : Strings are immutable in java 

    // String newName=name1.concat(" Tiwari");  //if u want to reuse the result again and again then use this 
    // System.out.println(newName);
    // //or
    // System.out.println(name1.concat(" Tiwari"));

    // name1=name1.concat(" Tiwari"); //reinitialization of value in variable name1
    // System.out.println(name1);

    System.out.println(name1.charAt(2));

    }
}
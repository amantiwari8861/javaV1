import java.util.Hashtable;

class HashTableDemo
{
    public static void main(String[] args) {
        
        Hashtable<Integer,String> ht=new Hashtable<>();

        ht.put(1,"One");
        ht.put(2,"Two");
        ht.put(3,"Three");
        ht.put(4,"Four");
        
        // System.out.println(ht);
        ht.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });
    }
}
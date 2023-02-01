class Address {  
    String city,state,country;  //global variable     
    Address(String city, String state, String country) 
    {  //local variable 
        this.city = city;  
        this.state = state;  
        this.country = country;  
    }  
}
//------------------------------
public class Emp {  
        int id;  
        String name;  
        Address address1;  
          
       Emp(int id, String name,Address address) {  
            this.id = id;  
            this.name = name;  
            address1=address;  
        }  
        void display()
        {  
        System.out.println(id+" "+name);  
        System.out.println(address1.city+" "+address1.state+" "+address1.country);  
        }  
public static void main(String[] args) 
{  
        Address address2=new Address("gzb","UP","india");            
        Emp e=new Emp(111,"varun",address2);  
        e.display();
        }  
    }
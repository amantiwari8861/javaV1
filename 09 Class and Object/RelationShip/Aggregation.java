class Address 
{  
    String city,state,country;  //instance variable 
    Address(String city, String state, String country) //local variable 
    {  
        this.city = city;  
        this.state = state;  
        this.country = country;  
    }   
}
class Emp 
{  
    int id;  
    String name;  
    Address localAddress;  
    Address permanentAddress;  
    
    Emp(int id, String name,Address localAddress) 
    {  
        this.id = id;  
        this.name = name;  
        this.localAddress=localAddress;  
    }  
    void display()
    {  
        System.out.println(id+" "+name);  
        System.out.println(localAddress.city+" "+localAddress.state+" "+localAddress.country);  
    }  
}
public class Aggregation {
    public static void main(String[] args) 
    {  
        Address address1=new Address("gzb","UP","india");  
          
        Emp e=new Emp(111,"varun",address1);  
    
        e.display();  
              
    }  

    
}
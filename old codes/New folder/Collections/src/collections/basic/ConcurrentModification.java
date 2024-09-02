package collections.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
//import java.util.Iterator;

public class ConcurrentModification {
	public static void main(String[] args) {

		Room room1= new Room(101,"Keluxe",20000);
		Room room2= new Room(102,"Deluxe sweet",30000);
		Room room3= new Room(103,"honeymoon suit",80000);
		Room room4= new Room(104,"honeymoon suit",80000);
		Room room5= new Room(105,"honeymoon suit",80000);
		Collection<Room> rooms=new ArrayList<>(Arrays.asList(room1,room2,room3,room4,room5));
//		Iterator<Room> i=rooms.iterator();
//		while (i.hasNext()) {
//			Room room = (Room) i.next();
//			System.out.println("id ="+room.id+" name ="+room.name+" price= "+room.price);
//		}
//		
//		for (Room room : rooms) {
//			System.out.println("id ="+room.id+" name ="+room.name+" price= "+room.price);
//		}
		room3.setName("mera Room");
		room4.setName("mera Room2");
		for (Room room : rooms)
		{
			System.out.println("id ="+room.getId()+" name ="+room.getName()+" price= "+room.getPrice());

			if(room.getId() >103)
			{
				System.out.println("id ="+room.getId()+" name ="+room.getName()+" price= "+room.getPrice());
				rooms.remove(room);
			}
			
		}	
		System.out.println("--------------------------------------------------");
//		for (Room room : rooms) {
//			System.out.println("id ="+room.id+" name ="+room.name+" price= "+room.price);
//			
//		}
		rooms.stream().forEach(r->System.out.println(r.getId()+" "+r.getName()));
	}

}

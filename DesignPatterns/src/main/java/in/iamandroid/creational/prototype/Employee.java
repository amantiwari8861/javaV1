package in.iamandroid.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable
{
	List<String> skills;
	static String allSkills[];
	public Employee()
	{
		System.out.println("Employee created!");
		skills=new ArrayList<>();
		allSkills=new String[] {"C","C++","Java","Python"};
	}
	public void enhanceSkill()
	{
		Runnable tasks[]=new Runnable[3];
		
//		Runnable t=()->{
//			try {
//			 int delay = (int) ((Math.random()*5) * 1000);
//			 System.out.println("it will take "+(delay/1000)+
//					 " seconds to enhance this new skill");
//             Thread.sleep(delay);
//             skills.add("C");
//             System.out.println(skills.get(skills.size()-1)+
//            		 " skill enhanced!");
//			}
//			catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		};
//		new Thread(t).start();
		for (int i = 0; i < 3; i++) {
            tasks[i] = () -> {
                try {
                    int delay = (int) ((Math.random() * 5) * 1000);
                    System.out.println("It will take "
                    + (delay / 1000) 
                    		+ " seconds to enhance this new skill");
                    Thread.sleep(delay);
                    synchronized (skills) {
                        skills.add(allSkills[skills.size()]);
                        System.out.println(skills.get(skills.size() - 1) + " skill enhanced!");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
        }

        for (Runnable task : tasks) {
            new Thread(task).start();
        }
	}
	public Employee getEmpObj()
	{
		try {
		return (Employee)this.clone();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String toString() {
		return "Employee [skills=" + skills + "]";
	}
	
}

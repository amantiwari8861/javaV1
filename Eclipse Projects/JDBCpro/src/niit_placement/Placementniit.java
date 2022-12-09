
package niit_placement;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import niit_placement.StudentDatabase;
import java.lang.*;

class Dataentry implements ActionListener
{
	String name,fname,gmail,stream,choose;
	String qualification,address,entrytime,exittime,msg;
        int age;
        
        Frame f=new Frame("Data Entry");
                Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
                TextField t1,t2,t3,t4,t5,t6,t7,t9;
	Button b;
        TextArea t8;
        
         StudentDatabase sd=new StudentDatabase();
                
	public void basicentry()
	{
            
		
                
                
                
		l = new Label("Student Registration Form :");  
                l.setForeground(Color.blue);  
                l.setFont(new Font("Serif", Font.BOLD, 20));  
                
                l1=new Label("Full Name: ");
		 t1=new TextField("",20);
                 
                 l2=new Label("Father's Name:");
		t2=new TextField("",20);
		
                l3=new Label("Mail ID:");
		t3=new TextField("",20);
		
                l4=new Label("Stream:");
		t4=new TextField("",20);
                
		l5=new Label("Qualification:");
		t5=new TextField("",20);
		
                l6=new Label("Entry Time: ");
		t6=new TextField("",20);
		
                l7=new Label("Exit Time: ");
		t7=new TextField("",20);
		
                l8=new Label("Address:");
		t8=new TextArea("",180,90,TextArea.SCROLLBARS_VERTICAL_ONLY);
		
                l9=new Label("Age:");
		t9=new TextField("",20);
		
                  b=new Button("Submit");
               b.setBounds(180, 450, 100, 30);
               b.setBackground(Color.yellow);
                b.addActionListener(this);
                
               l.setBounds(40, 30, 400, 30);
               l.setAlignment(Label.CENTER);
                l1.setBounds(20, 70, 150, 30);
                l1.setAlignment(Label.CENTER);
                l2.setBounds(20, 110, 150, 30);
                 l2.setAlignment(Label.CENTER);
                l3.setBounds(20, 150, 150, 30);
                 l3.setAlignment(Label.CENTER);
                l4.setBounds(20, 190, 150, 30);
                 l4.setAlignment(Label.CENTER);
                l5.setBounds(20, 230, 150, 30);
                 l5.setAlignment(Label.CENTER);
                l6.setBounds(20, 270, 150, 30);
                 l6.setAlignment(Label.CENTER);
                l7.setBounds(20, 310, 150, 30);
                 l7.setAlignment(Label.CENTER);
                l8.setBounds(20, 350, 150, 30);
                 l8.setAlignment(Label.CENTER);
                l9.setBounds(20, 390, 150, 30);
                 l9.setAlignment(Label.CENTER);
                
                t1.setBounds(210, 70, 200, 30);
                t2.setBounds(210, 110, 200, 30);
                t3.setBounds(210, 150, 200, 30);
                t4.setBounds(210, 190, 200, 30);
                t5.setBounds(210, 230, 200, 30);
                t6.setBounds(210, 270, 200, 30);
                t7.setBounds(210, 310, 200, 30);
                t8.setBounds(210, 350, 200, 40);
                t9.setBounds(210, 390, 200, 30);
                
               f.setVisible(true);
               f.setSize(500,500);
               f.setLayout(null);
               
               l.setBackground(Color.red);
               l.setForeground(Color.white);
               
               f.add(l);
               
               f.add(l1);
               f.add(t1);
               
               f.add(l2);
               f.add(t2);
               
               f.add(l3);
               f.add(t3);
               
               f.add(l4);
               f.add(t4);
               
               f.add(l5);
               f.add(t5);
               
               f.add(l6);
               f.add(t6);
               
               f.add(l7);
               f.add(t7);
               
               f.add(l8);
               f.add(t8);
               
               f.add(l9);
               f.add(t9);
         
               f.add(b);
               
             f.addWindowListener(new WindowAdapter(){
                 @Override
                 public void windowClosing(WindowEvent we)
        {
                System.exit(0);
             }
        });
               
	}
        
       // public void paint(Graphics g)
        //{g.drawString(msg,100,200);}
        
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getActionCommand().equals("Submit"))
            {
                name=t1.getText();
                fname=t2.getText();
                gmail=t3.getText();
                stream=t4.getText();
                qualification=t5.getText();
                address=t6.getText();
                entrytime=t7.getText();
                exittime=t8.getText();
                age=Integer.parseInt(t9.getText());
                
                int x=sd.insertData(name, fname, gmail, stream, qualification, address, entrytime, exittime, age);
                
                if(x!=0)
                {
                    JOptionPane.showMessageDialog(f,"Record Inserted");  
                }
                else
                {
                JOptionPane.showMessageDialog(f,"Record Not Inserted");  
                }
                
            } 
        }

}
class Councelling extends Dataentry
{
	public void questions()
	{ 
		Scanner obj3=new Scanner(System.in);
		
		System.out.println("how you know about niit ");
		String ans1=obj3.nextLine();
		System.out.println("which type of course is suitable for student");
		System.out.println("choose Qualification between 1 to 3");
		System.out.println("1 for below 12th ");
		System.out.println("2 for 12th passed or undergraduate ");
		System.out.println("3 for graduate ");
		int choice=obj3.nextInt();
		System.out.println("choose stream between 1 to 3");
		System.out.println("1 for science");
		System.out.println("2 for art");
		System.out.println("3 for commerce");
		int ch=obj3.nextInt();
		
		switch(choice)
		{
			case 1:
			if(ch==1||ch==2)
			{
			System.out.println("basic of computer,english,bpo course etc");
			System.out.println("course fee=20000 "+" duration is 3month");
			}
			else
			{
			System.out.println("tally");
			System.out.println("course fee=2.5lakh"+"duration is 3year");
			}
			break;
			case 2:
			if(ch==1||ch==2)
			{
			System.out.println("gniit");
			System.out.println("course fee=2.5lakh "+" duration is 3year");
			}
			else
			{
			System.out.println("aniit");
			System.out.println("course fee=2.5lakh "+" duration is 3year");

			}
			break;
			case 3:	
			if(ch==1||ch==2)
			{
			System.out.println("pjp java,dt etc");
			System.out.println("course fee=70000"+"duration is 6 or 7 month");
			}
			else
			{
			System.out.println("pjp banking");
			System.out.println("course fee=60000"+"duration is 8month");
			}
			break;
			default:
			System.out.println("correctly choose Your Qualification");
		}
	}

	void display()
	{
		Scanner obj2=new Scanner(System.in);
		
		String stuid=name;
		System.out.println("kindly choose your course according your Qualification");
		System.out.println("choose between to your suggestion");
		choose=obj2.nextLine();
		System.out.println("enter today's date");
		String date=obj2.nextLine();
		System.out.println("enter your mobile number");
		String mno=obj2.nextLine();
		System.out.println("enter father's mobile number");
		String fmno=obj2.nextLine();
		System.out.println("do you want to pay now  your registration fee of your course");
		System.out.println(" yes and no later");
		String payment=obj2.nextLine();
		String password=mno;
		
		if(payment.equals("yes"))
		{
			System.out.println("thanks for payed amount now you are student of Niit");
			System.out.println("your user id is generated user Id="+ stuid);
			System.out.println("your password is"+ password);
		}
		else
		{
			System.out.println("sorry you are not a student of Niit till now Kindly pay your fee hurry");
		}
		System.out.println(" please login to check your details");
		System.out.println("enter your login id which is do you have");
		String loginid=obj2.nextLine();
		System.out.println("enter your login id password");
		String check=obj2.nextLine();
		
		if(stuid.equals(loginid)&&password.equals(check))
		{
			System.out .println("You are successfully login");
			System.out.println("Student details");
			System.out.println("Student name is = "+name);
			System.out.println("Student's father name is = "+fname);
			System.out.println("Student's gmailid= "+gmail);
			System.out.println("Student's stream  = "+stream);
			System.out.println("Student's Qualification  ' = "+qualification);
			System.out.println("coming date = "+date);
			System.out.println("Student's address  = "+address);
			System.out.println("Student's age = "+age);
			System.out.println("Student'selected course  = "+choose);
			System.out.println("Studend's mobile number = "+mno);
			System.out.println("father's mobile number = "+fmno);
			System.out.println("date is"+date);
		}
		else
		{
			System.out.println("sorry incorrect password or login id");
		}
	}
	}


public class Placementniit extends Councelling
{
	String marji,cstatus,interview,company;
	//Company method
	void company()
	{
		Scanner obj1=new Scanner(System.in);
		System.out.println("do you want to do job");
		System.out.println("choose yes or no");
		marji=obj1.nextLine();
		if(marji.equals("yes"))
		{
			switch(choose)
			{
			case "pgpjava":
			case "gniit":
			case "dt":
			System.out.println("select your company of IT department ");
			System.out.println("your option is");
			System.out.println("wipro");
			System.out.println("nokia");
			System.out.println("samsung");
			System.out.println("tech mahindra");
			company=obj1.nextLine();
			break;
			case "pjp banking":
			case"tally":
			case"aniit":
			System.out.println("select your company of Banking department ");
			System.out.println("your option is");
			System.out.println("HDFC BANK");
			System.out.println("ICICI BANK");
			System.out.println("SBI BANK");
			System.out.println("AXIS BANK");
			company=obj1.nextLine();
			break;
			case "bpo course":
			case "english":
			System.out.println("select your company of bpo department ");
			System.out.println("your option is");
			System.out.println("reliance");
			System.out.println("vodafone");
			System.out.println("airtel");
			System.out.println("international bpo");
			company=obj1.nextLine();
			break;
			
			default:
			System.out.println("choose a valid course ");
			System.out.println("your course is"+choose+"niit does not give job for this course");
			break;
			}
		}
		else
		{
			System.out.println("ok you will come when you ready for the job");
							System.out.println("choose yes or no only");
		}

	}
	//Interview method
	void interview()
	{
		String status;
		int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		int i=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("do you really want to do job in"+company);
		System.out.println("choose yes or no");
		marji=obj.nextLine();
		if(marji.equals("yes"))
		{
		System.out.println("did you complete your course of"+choose);
		System.out.println("choose yes or no");
		cstatus=obj.nextLine();
		if(cstatus.equals("yes"))
		{
		System.out.println("first you will have to give interview are you ready");
		System.out.println("choose yes or no");
		interview=obj.nextLine();
		if(interview.equals("yes"))
		{
		System.out.println("i will ask you 10 Questions ");
		System.out.println("for every correct answer i will give four marks but ");
		System.out.println("for every incorrect answer i will cut  your 1 marks ");
		if(company.equals("tech mahindra")||company.equals("samsung")||company.equals("nokia")||company.equals("wipro"))
		 {
		System.out.println("do is used with which of these choose option between 1 to 4 ");
		System.out.println("1 is for if");
		System.out.println("2 is for for)");
		System.out.println("3 is for else)");
		System.out.println("4 is for WHILE");
		a1=obj.nextInt();
		if(a1==4)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is syntax of deconstructor choose option between 1 to 4 ");
		System.out.println("1 is for (~ classname()");
		System.out.println("2 is for (classname())");
		System.out.println("3 is for (~methodname())");
		System.out.println("4 is for (methodname())");
		a2=obj.nextInt();
		if(a2==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }

		System.out.println("what is syntax of constructor choose option between 1 to 4 ");
		System.out.println("1 is for (~ classname()");
		System.out.println("2 is for (classname())");
		System.out.println("3 is for (~methodname())");
		System.out.println("4 is for (methodname())");
		a3=obj.nextInt();
		if(a3==2)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		  System.out.println("what is syntax of DO WHILE choose option between 1 to 4 ");
		 System.out.println("1 is for (DO{_}WHILE()))");
		System.out.println("2 is for (for(i=1;i<j:i++))");
		System.out.println("3 is for (for(i=1;i<j;i++)");
		System.out.println("4 is for (methodname())");
		a4=obj.nextInt();
		if(a4==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is syntax of forloop choose option between 1 to 4 ");
		 System.out.println("1 is for (for(i++;i<j;i=1))");
		System.out.println("2 is for (for(i=1;i<j:i++))");
		System.out.println("3 is for (for(i=1;i<j;i++)");
		System.out.println("4 is for (methodname())");
		a5=obj.nextInt();
		if(a5==3)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is syntax of IF ELSE choose option between 1 to 4 ");
		System.out.println("1 is for (~ classname()");
		System.out.println("2 is for (IF{_}ELSE{_})");
		System.out.println("3 is for (~methodname())");
		System.out.println("4 is for (methodname())");
		a6=obj.nextInt();
		if(a6==2)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("HOW YOU CAN USE FINALLY choose option between 1 to 4 ");
		System.out.println("1 is for (~ classname()");
		System.out.println("2 is for (classname())");
		System.out.println("3 is for (~methodname())");
		System.out.println("4 is for TO CREATE A FINALLY BLOCK)");
		a7=obj.nextInt();
		if(a7==4)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is FINALLY choose option between 1 to 4 ");
		System.out.println("1 is for (~ classname()");
		System.out.println("2 is for (classname())");
		System.out.println("3 is for (FINALLY IS A BLOCK))");
		System.out.println("4 is for (methodname())");
		a8=obj.nextInt();
		if(a8==3)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is FINAL choose option between 1 to 4 ");
		System.out.println("1 is for (~ classname()");
		System.out.println("2 is for (FINAL IS A KEYWORD)");
		System.out.println("3 is for (~methodname())");
		System.out.println("4 is for (methodname())");
		a9=obj.nextInt();
		if(a9==2)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("HOW YOU ALLOCATE THE MEMORY TO A CLASS choose option between 1 to 4 ");
		System.out.println("1 is for (TO CREATE OBJECT OF A CLASS )");
		System.out.println("2 is for (classname())");
		System.out.println("3 is for (~methodname())");
		System.out.println("4 is for (methodname())");
		a10=obj.nextInt();
		if(a10==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 if(i>=25)
		 {
			 status="passed";
			 System.out.println("you are selected your interview status is ="+status);
			 System.out.println("congratulations you got "+i+"marks");
		 }
			 
		 else
		 {
			 System.out.println("sorry your marks is low then 50 you have to go your home");
			 System.out.println("your mark = "+i);
		 }
		 }
		 else if(company.equals("airtel")||company.equals("vodafone")||company.equals("international bpo")||company.equals("reliance"))
		 {
		System.out.println("which tense is it ram is playing choose option between 1 to 4 ");
		System.out.println("1 is for simple present");
		System.out.println("2 is for (presentcontinous)");
		System.out.println("3 is for (pastindefinite())");
		System.out.println("4 is for (future())");
		a1=obj.nextInt();
		if(a1==2)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is ram choose option between 1 to 4 ");
		System.out.println("1 is for adverb");
		System.out.println("2 is for verb");
		System.out.println("3 is for (noun)");
		System.out.println("4 is for (pronoun)");
		a2=obj.nextInt();
		if(a2==3)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }

		System.out.println("what is pronoun choose option between 1 to 4 ");
		System.out.println("1 is for (he,she)");
		System.out.println("2 is for (name of person)");
		System.out.println("3 is for (subject )");
		System.out.println("4 is for (forester)");
		a3=obj.nextInt();
		if(a3==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is run choose option between 1 to 4 ");
		System.out.println("1 is for (noun)");
		System.out.println("2 is for (subject)");
		System.out.println("3 is for (adverb)");
		System.out.println("4 is for (verb)");
		a4=obj.nextInt();
		if(a4==4)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is run fast choose option between 1 to 4 ");
		System.out.println("1 is for pronoun");
		System.out.println("2 is for noun");
		System.out.println("3 is for (verb)");
		System.out.println("4 is for adverb");
		a5=obj.nextInt();
		if(a5==4)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is sita(gender) choose option between 1 to 4 ");
		System.out.println("1 is for (a feminine )");
		System.out.println("2 is for (male)");
		System.out.println("3 is for (plural)");
		System.out.println("4 is for (thing)");
		a6=obj.nextInt();
		if(a6==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is train choose option between 1 to 4 ");
		System.out.println("1 is for (animal)");
		System.out.println("2 is for (person)");
		System.out.println("3 is for (bird)");
		System.out.println("4 is for (medium of transport)");
		a7=obj.nextInt();
		if(a7==4)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is thing choose option between 1 to 4 ");
		 System.out.println("1 is for (ram)");
		System.out.println("2 is for (table)");
		System.out.println("3 is for (eagle)");
		System.out.println("4 is for (temple)");
		a8=obj.nextInt();
		if(a8==2)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is oyo choose option between 1 to 4 ");
		System.out.println("1 is for hotels");
		System.out.println("2 is for temple)");
		System.out.println("3 is for church)");
		System.out.println("4 is for vehicles)");
		a9=obj.nextInt();
		if(a9==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is place choose option between 1 to 4 ");
		System.out.println("1 is for delhi");
		System.out.println("2 is for(ram)");
		System.out.println("3 is for (1 kg)");
		System.out.println("4 is for (gold)");
		a10=obj.nextInt();
		if(a10==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 if(i>=20)
		 {
			 status="passed";
			 System.out.println("you are selected your interview status is ="+status);
			 System.out.println("congratulations you got "+i+"marks");
		 }
			 
		 else
		 {
			 System.out.println("sorry your marks is low then 50 you have to go your home");
							   System.out.println("your marks is ="+i);
		 }
		 
		 }
		 else
		 {
			 //if(company.equals("AXIS BANK")||company.equals("HDFC BANK")||company.equals("SBI BANK")||company.equals("ICICIBANK"))
		System.out.println("what is purpose of data entry  choose option between 1 to 4 ");
		System.out.println("1 is for (to store data in excel sheet)");
		System.out.println("2 is for (delete data)");
		System.out.println("3 is for (receive data)");
		System.out.println("4 is for (to send data ))");
		a1=obj.nextInt();
		if(a1==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is logical operator choose option between 1 to 4 ");
		System.out.println("1 is for (which performs action using if else)");
		System.out.println("2 is for which is increment the vale");
		System.out.println("3 is for ( who repeat the action again and again)");
		System.out.println("4 is for (who makes data become large)");
		a2=obj.nextInt();
		if(a2==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }

		System.out.println("what is EMI choose option between 1 to 4 ");
		System.out.println("1 is for (rent of home)");
		System.out.println("2 is for (which a customer pay the part of whole amount  in durations of time ");
		System.out.println("3 is for (which is taken by a customer)");
		System.out.println("4 is for (which is given by bank)");
		a3=obj.nextInt();
		if(a3==2)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 } 
		System.out.println("what is DD choose option between 1 to 4 ");
		System.out.println("1 is for (rent of home)");
		System.out.println("2 is for (which a customer pay the part of whole amount  in durations of time ");
		System.out.println("3 is for(dd is a address to giving amout)");
		System.out.println("4 is for (which is given by bank)");
		a4=obj.nextInt();
		if(a4==4)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is loan choose option between 1 to 4 ");
		System.out.println("1 is for (rent of home)");
		System.out.println("2 is for (which a customer pay the part of whole amount in durations of time ");
		System.out.println("3 is for (which is taken by a bank)");
		System.out.println("4 is for (which is given by bank)");
		a5=obj.nextInt();
		if(a5==4)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is account choose option between 1 to 4 ");
		System.out.println("1 is for (rent of home)");
		System.out.println("2 is for (which a customer pay the part of whole amount  in durations of time ");
		System.out.println("3 is for (a type of id of bank's customer)");
		System.out.println("4 is for (which is given by bank)");
		a6=obj.nextInt();
		if(a6==3)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is branch choose option between 1 to 4 ");
		System.out.println("1 is for (address and identity of bank)");
		System.out.println("2 is for (which a customer pay the part of whole amount  in durations of time ");
		System.out.println("3 is for (which is taken by a bank)");
		System.out.println("4 is for (which is given by bank)");
		a7=obj.nextInt();
		if(a7==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is slogan choose option between 1 to 4 ");
		System.out.println("1 is for (rent of home)");
		System.out.println("2 is for (which a customer pay the part of whole amount  in durations of time ");
		System.out.println("3 is for ( which is represent the motive of bank)");
		System.out.println("4 is for (which is given by bank)");
		a8=obj.nextInt();
		if(a8==3)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("when a person living a another person's home then what he will pay choose option between 1 to 4 ");
		System.out.println("1 is for (rent of home)");
		System.out.println("2 is for (which a customer pay the part of whole amount  in durations of time ");
		System.out.println("3 is for (which is taken by a bank)");
		System.out.println("4 is for (which is given by bank)");
		a9=obj.nextInt();
		if(a9==1)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 System.out.println("what is asset proof choose option between 1 to 4 ");
		System.out.println("1 is for (rent of home)");
		System.out.println("2 is for (which a customer pay the part of whole amount  in durations of time ");
		System.out.println("3 is for (which is  show you have really this  asset )");
		System.out.println("4 is for (which is given by bank)");
		a10=obj.nextInt();
		if(a10==3)
		{
			System.out.println("correct answer you get 4 marks for this");
			i=i+4;
		}
		else
		{
			i=i-1;
		System.out.println("sorry this is wrong answer i cut your 1 marks");
		 }
		 if(i>=15)
		 {
			 status="passed";
			 System.out.println("you are selected your interview status is ="+status);
			 System.out.println("congratulations you got "+i+"marks");
		}
		 else
		 {
			 System.out.println("sorry your marks is low then 50 you have to go your home");
							 System.out.println("your marks is = "+i);
		 }
		 }
		 }
		 }
		 }
	 }
	
	public static void main(String[]args)
	{
		Placementniit oj=new Placementniit();
		oj.basicentry();
		oj.questions();
		oj.display();
		oj.company();
		oj.interview();
	}
}
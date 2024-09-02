import java.util.Scanner;
class nerd
{
public static void main (String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Hi there, welcome to my game please enter your name before we start :)");
        String name=obj.nextLine();
        System.out.println("\n"+"\n"+"\n"+"Hello"+" "+name+" "+"Before starting the game let me tell u the rules."+"\n"+"You will have 11 questions infront of you each with multiple choices but single correct answer."+"\n"+"You will have to answer questions correctly for moving forward step by step towards the 11th question."+"\n"+"After every 5 question you will get a becnhmark which will garuntee you a fixed prize amount."+"The last question is a special question designed to test your Smartness, only a true nerd can answer the 11th question its answer is hidden somewhere within the quiz.Keep your eyes and mind open"+"\n"+"All the best for the game."+"\n"+"\n"+"\n"+"Are your ready y/n ?");
        String ready=obj.nextLine();
        if(ready.equals("y"))
            System.out.println("Here comes your first question....press c to continue");
        else
            System.out.println("Come back again when you are ready");
        String space=obj.next();
        if(space.equals("c"))
        System.out.println("Q1)Access modifier applied to classes is"+"\n"+"1)Private"+"    "+"2)Public"+"\n"+"3)Native"+"    "+"4)None of the Above");
        else
        {
            System.out.println("Do as instructed dont be negligent -_-");
        System.out.println("Now restart again and learn to follow rules, this attitude will take you nowhere in life");
        }
        int ans1=obj.nextInt();
        if(ans1==2)
            System.out.println("Congratulations!!! You have won Rs.1000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("Hope to see you soon");
        }
        System.out.println("Press c for next question");
        String choice1=obj.next();
        if(choice1.equals("c"))
            System.out.println("Q2)Select the correct order of different statements"+"\n"+"1)Package Statement-> Import Statement-> Class Declaration-> Method Declaration"+"n"+"2)Package Statement-> Import Statement-> Method Declaration-> Class Declaration"+"\n"+"3)Package Statement-> Method Declaration-> Import Statement-> Class Declaration"+"\n"+"4)None of the Above");
        int ans2=obj.nextInt();
        if(ans2==1)
            System.out.println("Congratulations!!! You have won Rs.2500"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("Hope to see you soon");
        }
        System.out.println("Press c for next question");
        String choice2=obj.next();
        if(choice2.equals("c"))
            System.out.println("Q3)Which of the statement is not correct about Identifiers?"+"n"+"1) Identifier name can begin with a Letter"+"\n"+"2)Identifier name can begin with a Currency character"+"\n"+"3)Identifier name can begin with a Underscore"+"\n"+"4)Identifier name can begin with a Number");
        int ans3=obj.nextInt();
        if(ans3==4)
            System.out.println("Congratulations!!! You have won Rs.5000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("Hope to see you soon");
        }
            System.out.println("Press c for next question");
            String choice3=obj.next();
            if(choice3.equals("c"))
            System.out.println("Q4)Which of these method signature is not valid as per Java Bean Method Signature Rules"+"\n"+"1)public void isValid()"+"   "+"2)public void setMethod(int i)"+"\n"+"3)void setMethod(int i)"+"   "+"4)None of the Above");
        int ans4=obj.nextInt();
        if(ans4==3)
        System.out.println("Congratulations!!! You have won Rs.10000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("Hope to see you soon");
        }
            System.out.println("Press c for next question");
            String choice4=obj.next();
        if(choice4.equals("c"))
            System.out.println("Q5)If X extends Y is TRUE then which of below statement can be correct"+"\n"+"1)X is an Interface and Y is a class"+"\n"+"2) X is an class and Y is a Interface"+"\n"+"3)X is a Interface and Y is an Interface"+"\n"+"4)None of the Above");
        int ans5=obj.nextInt();
        if(ans5==3)
            System.out.println("Congratulations!!! You have won Rs.25000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("Hope to see you soon");
        }
            System.out.println("Press c for next question");
            String choice5=obj.next();
        if(choice5.equals("c"))
            System.out.println("Q6)Select the statement which is true for Final variables"+"\n"+"1)A reference variable can not be final"+"\n"+"2) Final variable can not be static"+"\n"+"3) Final variable can not be reinitialized once assigned a value"+"\n"+"4)None of the Above");
        int ans6=obj.nextInt();
        if(ans6==3)
            System.out.println("Congratulations!!! You have won Rs.50000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("You have won Rs.25000");
        }
            System.out.println("Press c for next question");
            String choice6=obj.next();
        if(choice6.equals("c"))
            System.out.println("Q7)If we apply instanceof method on the variable that have null value, it will return"+"\n"+"1)True"+"   "+"2)False"+"\n"+"3)Can not be applied"+"   "+"4)None of the Above");
        int ans7=obj.nextInt();
        if(ans7==2)
            System.out.println("Congratulations!!! You have won Rs.100000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("You have won Rs.25000");
        }
            System.out.println("Press c for next question");
            String choice7=obj.next();
        if(choice7.equals("c"))
            System.out.println("Q8)Inheritance provides _________."+"\n"+"1)code reusability and represents IS-A relationship"+"\n"+"2)code reusability and represents HAS-A relationship"+"\n"+"3)Both"+"\n"+"4)None of the above");
        int ans8=obj.nextInt();
        if(ans8==1)
            System.out.println("Congratulations!!! You have won Rs.1000000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("You have won Rs.25000");
        }
            System.out.println("Press c for next question");
            String choice8=obj.next();
        if(choice8.equals("c"))
            System.out.println("Q9)If we have private method in class, there is"+"\n"+"1)static binding"+"   "+"2) dynamic binding"+"\n"+"3)Both"+"   "+"4)Nome of the above");
        int ans9=obj.nextInt();
        if(ans9==1)
            System.out.println("Congratulations!!! You have won Rs.2500000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("You have won Rs.25000");
        }
            System.out.println("Press c for next question");
            String choice9=obj.next();
        if(choice9.equals("c"))
            System.out.println("Q10)Whcich type of variable gets initialised automatically within a program code"+"\n"+"1)Global Variable"+"   "+"2)Local Variable"+"\n"+"3)Both"+"   "+"4)None of the Above");
        int ans10=obj.nextInt();
        if(ans10==2)
            System.out.println("Congratulations!!! You have won Rs.5000000"+"\n"+"\n"+"\n");
        else
        {
            System.out.println("Sorry You lost, Thanks for playing.");
            System.out.println("You have won Rs.25000");
        }
            System.out.println("Press c for next question");
            String choice10=obj.next();
        if(choice10.equals("c"))
            System.out.println("\n"+"\n"+"\n"+"Wow you have been a great performer till now,you have won Rs5000000 which you will be taking home tonight for sure,those question were quite tough and i must say you have really shown your potential to win this game, I am quite Impressed. But impressing me wont give you the Jackpot Prize. Now we have tested your nerdy knowledge its time that we check your nerdy soul. So get ready for the last question, as already mentioned above the answer to this question was hidden somewhere within the quiz. I hope you followed the instruction and paid attention to each minute detail. So lets play the Final round"+"\n"+"\n");
            System.out.println("Press c for Final question");
            String choicee=obj.next();
        if(choicee.equals("c"))
            System.out.println("Q11)I have a numerogenic vault in my house which has Rs.10000000 in it, which is your prize money. All you have to do is enter the code of the vault to win the game and the prize money. Please enter the 10 digit Password");
            int ans11=obj.nextInt();
        if(ans11==2143332112)
            System.out.println("\n"+"\n"+"\n"+"Congratulation you have won Rs.1 Crore. You are a true nerd in all of its sense. I am proud to have you on my gameshow, it always refreshing to meet a fellow nerd."+"\n"+"Keep being the nerd you are."+"\n"+"You played Great Today.Cheers."+"\4n"+" Please leave your Comments down below about how you felt about my game and the concept.This is my first gaming venture, i would love to hear from you"+"\n"+"Thank You");
            String feedback=obj.nextLine();
        

    }
}


































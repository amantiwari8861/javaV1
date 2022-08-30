import java.util.Scanner;

public class pf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary, hra, da,pf;
        System.out.println("enter salary:");
        salary = sc.nextDouble();

        if (salary >= 20000) 
        {
            hra = salary * 20.0 / 100.0;
            da = salary * 40.0 / 100.0;

            salary = salary + hra + da;

            System.out.println("Salary:"+ salary+" hra :"+hra+" da:"+da );

        } 
        else 
        {
            pf=salary*15.0/100.0;
            salary=salary-pf;
            System.out.println("Salary :" + salary+" pf:"+pf);
        }

    }
}
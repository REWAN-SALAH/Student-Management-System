package Project2022;
import java.util.Scanner;
public class StudentMangeApp

{
    //id
    static String Studid;
    static String idd;
    //balance
    static int bal;
    //main
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------Welcome------------------");
        //Number of Student can enroll
        System.out.print("Enter number of new Student to Enroll : ");
        int numstd=sc.nextInt();
        StudentBack[] stud=new StudentBack[numstd];
        // 20 student max
        if (numstd<=20 && numstd>0)
        {
            //loop for num of students
            for (int i=0;i<numstd;i++)
            {
                // constructor : name
                System.out.print("Enter the First Name of Student : ");
                String fris= sc.next();
                System.out.print("Enter the Last Name of Student : ");
                String las= sc.next();
                System.out.print("Enter the Year that Student join FCDS : ");
                int lev=sc.nextInt();
                stud[i]=new StudentBack(fris,las,lev);
                //enroll
                System.out.print("How many Course do you want to enroll : ");
                int n = sc.nextInt();
                stud[i].enroll(n);
                System.out.println("");
                //payment
                System.out.println("\n------------------Payment------------------");
                System.out.print("Enter Your Payment :");
                int payment=sc.nextInt();
                stud[i].PayTuitionFees(payment);
                //statue
                System.out.println("------------------Statues------------------ \n"+stud[i].toString(Studid));
                //Database
                Operation.connection(idd,fris,las,lev,Studid,bal);
                operation2.connection();


            }
        }
        System.out.println("------------------Thank you------------------");
    }
}
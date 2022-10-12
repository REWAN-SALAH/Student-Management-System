package Project2022;//Abdelrahman - Rewan
import java.util.Scanner;
public class StudentBack {

    //Variable
    private final String FirstName;
    private final String FamilyName;
    public String[] CourseName;
    private  String StuId;
    private final int StuLevl;
    private  int TotalBalance =0;
    private static final int EachCourseCost =300;
    private static int id=1001;

    // constructor : name
    public StudentBack(String f1, String f2, int l1)
    {
        this.FirstName=f1;
        this.FamilyName=f2;
        this.StuLevl=l1;
        setStuId();
        createID();
    }

    //student ID
    private  void setStuId()
    {
            this.StuId = StuLevl + "" + (id);
            StudentMangeApp.Studid = StuId;
    }


    public synchronized void createID()
    {
        StuId=String.valueOf(id++);
        StudentMangeApp.idd=StuId;
    }

    //Enroll students courses
    public  void enroll(int n)
    {
        Scanner sc=new Scanner(System.in);
        if (n >= 3)
        {
            System.out.println("Enter Course You Want to Enroll ");
            CourseName = new String [n];
            for(int i=0; i<CourseName.length; i++)
            {
                System.out.print("Course " +(i+1)+" : ");
                CourseName[i]=sc.next();
            }
            TotalBalance=EachCourseCost*(n);
        }

        else
        {
            System.out.println("The minimum enroll is 3 courses ");
            Scanner uu=new Scanner(System.in);
            System.out.print("Try Again , \nHow many Course do you want to enroll : ");
            int jj=uu.nextInt();
            enroll(jj);
            TotalBalance=EachCourseCost*(jj);
        }

    }

    //Balance
    public  void ShowBalance()
    {
    System.out.println("Your Certain Balance is : "+TotalBalance+" .LE");
    }

    //pay tuition fees
    public void PayTuitionFees(int pay)
    {
    TotalBalance=TotalBalance-pay;
    System.out.println("Your Payment : "+pay+ " .LE");
    ShowBalance();
    StudentMangeApp.bal=TotalBalance;
    }

    //show status.
    public  String toString(String Studid)
    {
        return "Student Name : " + FirstName + " " + FamilyName + "\n" + "Student ID : " + Studid  + "\n" + "Your Balance :" + TotalBalance;
    }

}
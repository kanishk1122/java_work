import java.util.Scanner;

public class markscalculater {
    public static void main(String[] args)
    {
        float maths,sst,science,hindi,english;
        System.out.println("Enter the number of Hindi : ");
        Scanner sc = new Scanner(System.in);
        hindi = sc.nextFloat();
        System.out.println("enter the number of English : ");
        english = sc.nextFloat();
        System.out.println("Enter the number of SST : ");
        sst =sc.nextFloat();
        System.out.println("Enter the number of Science : ");
        science = sc.nextFloat();
        System.out.println("Enter the number of maths : ");
        maths = sc.nextFloat();
        float percentage;
        float macksobtain =maths +english+hindi+sst+science;
        percentage =  (macksobtain /500)*100;
        System.out.println("The the percentage of student is : " + percentage);








    }

}

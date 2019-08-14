import java.util.Scanner;
public class input
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name");
        String name = obj.nextLine();
        System.out.println("Your name is : "+name);
        Scanner obj1=new Scanner(System.in);
        System.out.println("enter a number");
        int num=obj1.nextInt();
        System.out.println("The number is "+num);


    }
}
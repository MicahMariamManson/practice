import java.util.Scanner;

class function{
    public static void main(String args[]){
    System.out.println("Enter two numbers");

    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int result = sum(num1,num2);//function is called

    System.out.println("Sum of numbers are :" + result);


    }

    //Another function

    static int sum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
}
  

//1. Program to check the given number is odd or even

public class EvenOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check : ");
        int a = sc.nextInt();

        if(a % 2 == 0 ){
            System.out.println("1");
        }
        else
            System.out.println("0");

    }
}

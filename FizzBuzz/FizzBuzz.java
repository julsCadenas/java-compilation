import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int integer=in.nextInt();

        System.out.println("FizzBuzz sequence from 1 to "+integer+":");
        for(int i=1;i<=integer;i++){
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz ");
            }else if(i%5==0){
                System.out.print("Buzz ");
            }else if(i%3==0){
                System.out.print("Fizz ");
            }else{
                System.out.print(i+" ");
            }
        }

    }
}


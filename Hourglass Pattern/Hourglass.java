import java.util.Scanner;

class Hourglass {

    public static void main (String[] args){

        Scanner in=new Scanner(System.in);

        System.out.print("Enter size: ");
        int size=in.nextInt();

        for(int i=size;i>=0;i--){
            for(int j=0;j<size-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)+1;k++){
                System.out.print("*");
            }System.out.println();
        }
        for(int i=1;i<=size;i++){
            for(int j=0;j<size-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)+1;k++){
                System.out.print("*");
            }System.out.println();
        }
    }

}
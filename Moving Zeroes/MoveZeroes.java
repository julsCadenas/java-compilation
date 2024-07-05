import java.util.Scanner;
import java.util.Arrays;

class MoveZeroes {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size=in.nextInt();

        int[] array=new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            array[i]=in.nextInt();
        }
        int[] copy=array.clone();
        int count=0;
        for(int i=0;i<size;i++){
            if(copy[i]!=0){
                copy[count++]=copy[i];
            }
        }
            while(count<size){
                copy[count++]=0;
            }

        System.out.print("Original Array: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Modified Array: ");
        for(int i=0;i<size;i++){
            System.out.print(copy[i]+" ");
        }
    }
}

    
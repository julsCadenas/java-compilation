import java.util.Scanner;
import java.util.Arrays;

class DiagonalDifference {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the size of the square matrix: ");
        int size=in.nextInt();

        int[][] matrix=new int[size][size];

        System.out.println("Enter the elements of the square matrix: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        int dia1=0;
        int dia2=0;
        for(int i=0;i<size;i++){
            dia1+=matrix[i][i];
            dia2+=matrix[i][size-1-i];
        }
        int absDiff=Math.abs(dia1-dia2);;
        System.out.println("Absolute diagonal difference: "+absDiff);
    }
}
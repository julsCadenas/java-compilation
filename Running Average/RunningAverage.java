import java.util.Scanner;

class RunningAverage {

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arrSize=in.nextInt();
        double average=0;
        double temp=0;
        int[] array=new int[arrSize];

        System.out.println("Enter the elements of the array, one per line: ");
        for(int i=0;i<arrSize;i++){
            array[i]=in.nextInt();
            temp+=array[i];
            average=(temp)/(i+1);
            System.out.printf("Running Average at index %d: %.2f%n",i,average);
        }

    }
}
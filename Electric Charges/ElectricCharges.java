import java.util.Scanner;

public class ElectricCharges {  
    
    private static double billCalculator(double kwHours){

        double firstRate=0.07633; //first 1000 hours
        double secondRate=0.09259; //rate after the first 1000 hours
        double electricBill=0;
        
       if(kwHours<=1000){
           electricBill=1000*firstRate;
       }else{
           electricBill=1000*firstRate;
           electricBill+=(kwHours-1000)*secondRate;
       }
        return electricBill;
    }
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);  
        
        System.out.print("enter kw hours used: ");
        double kwHours=in.nextDouble();
        
        double electricBill=billCalculator(kwHours);
        System.out.println("your electric bill is $"+electricBill);
        
    }
}

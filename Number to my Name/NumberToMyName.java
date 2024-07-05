import java.util.Scanner;
import java.util.HashMap;

class Main {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        HashMap<Character,String> numMap=new HashMap<>();
        numMap.put('0',"ZERO");
        numMap.put('1',"ONE");
        numMap.put('2',"TWO");
        numMap.put('3',"THREE");
        numMap.put('4',"FOUR");
        numMap.put('5',"FIVE");
        numMap.put('6',"SIX");
        numMap.put('7',"SEVEN");
        numMap.put('8',"EIGHT");
        numMap.put('9',"NINE");

        System.out.print("Enter number: ");
        int nums=in.nextInt();

        String numStr=Integer.toString(nums);
        int numStrLength=numStr.length();

        System.out.println("Word representation of the number:");
        for(int i=numStrLength-1;i>=0;i--){
            char numChar=numStr.charAt(i);
            System.out.println(numMap.get(numChar));
        }

    }
}
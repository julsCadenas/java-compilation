import java.util.*;

public class LargestQuotient {

    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);  
        
        ArrayList<Integer> list=new ArrayList<>();

       
        System.out.println("Enter integers separated by a space.");
        System.out.print("end with 0: ");
        int numbers=1;
        while(numbers!=0){
            numbers=in.nextInt();
            list.add(numbers);
           
        }
        
        ArrayList<Integer> copyList=new ArrayList<>(list);
        Collections.sort(copyList,Collections.reverseOrder());
       
        int quotient=0;
        int largeQ=0;

        for(int i=0;i<list.size();i++){
            for(int j=0;j<copyList.size();j++){
                if(list.get(j)!=0){
                    quotient=list.get(i)/copyList.get(j); 
                    if(quotient>largeQ){
                        largeQ=quotient;
                    }
                }
            }
        }
        System.out.println("the largest quotient is: "+largeQ);        
        
    }
}

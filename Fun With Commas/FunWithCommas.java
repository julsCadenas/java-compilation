import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunWithCommas {
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);  
        
        List<String> list=new ArrayList<>();

        System.out.print("enter the next word or quit: ");        
        String word=in.next();
        while(!word.equalsIgnoreCase("quit")){
            System.out.print("enter the next word or quit: ");        
            list.add(word);
            word=in.next();    
        }

        int size=list.size();

        if(size==1){
            System.out.println(list.get(0));
        }else{  
            for(int i=0;i<list.size()-2;i++){
                String wording=list.get(i);
                System.out.print(wording+", ");
            }
            System.out.println(list.get(list.size()-2)+" and "+list.get(list.size()-1));
        }

    }
}

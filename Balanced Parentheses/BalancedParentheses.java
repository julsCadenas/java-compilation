import java.util.Scanner;

class BalancedParentheses {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input=in.next();
        boolean output=false;
        char iteration;
        int count=0;
        for(int i=0;i<input.length();i++){
            iteration=input.charAt(i);
            if(iteration=='{' || iteration=='[' || iteration=='('){
                count++;
            }else if(iteration=='}' || iteration==']' || iteration==')'){
                count--;
            }
            if(count<0){
                break;
            }
        }
        if(count==0){
            output=true;
        }
        System.out.println(output);
    }
}
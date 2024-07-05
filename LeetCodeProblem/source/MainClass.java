package source;
import java.util.Arrays;
public class MainClass {
    public static void main(String[] args){
        TwoSum method=new TwoSum();
        int[] nums={6,5,1};
        int target=8;
        System.out.println(Arrays.toString(method.twoSum(nums,target)));
    }
}
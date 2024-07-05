
import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;
public class ArryList {
    public static void main(String[] args) 
    {
       // Collection<Integer> nums = new ArrayList<>();
        List<Integer> nums=new ArrayList<>();
       
        nums.add(2);
        nums.add(3);
        nums.add(5);

        System.out.println(nums);
        for (Integer e : nums) {
            System.out.println(e);
            
        }
        System.out.println(nums.size());
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(2));
    }

    
}

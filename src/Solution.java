import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            int c=map.getOrDefault(a,0);
            if(c>=1){
                return true;
            }
            map.put(a,c+1);
        }
        return false;
    }
}

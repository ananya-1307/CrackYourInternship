import java.util.*;
class Solution {
    public int[] twoSum(int[] arr, int t) {
        
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
            int d=t-arr[i];
            if(map.containsKey(d))
            {
                return new int[]{map.get(d),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
        
        
    }
}
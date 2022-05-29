class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i:nums)
        {
            if(m.containsKey(i))
            {
                m.put(i,m.get(i)+1);

            }
            else
            {
            m.put(i,1);
            }
        }
    for(Map.Entry<Integer, Integer> i: m.entrySet())
    {
        Integer key = i.getKey();
        Integer value = i.getValue();
        if(value > 1)
            arr.add(key);
    }
    return arr;
    }
}
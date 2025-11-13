class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int minIndSum = Integer.MAX_VALUE;

        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int sum = map.get(list2[i])+i;
                if(sum<minIndSum){
                   minIndSum = sum;
                    res.clear();
                    res.add(list2[i]);
                }else if(minIndSum == sum){
                    res.add(list2[i]);
                }

            }
        }
        String[] ans = res.toArray(new String[res.size()]);

        return ans;
        
    }
}
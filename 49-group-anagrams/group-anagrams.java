class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anaGroups = new HashMap<>();

        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key  = new String(charArray);
            if(!anaGroups.containsKey(key)){
                anaGroups.put(key,new ArrayList<>(List.of(str)));
            }
            else{
                anaGroups.get(key).add(str);
            }
        }
        return new ArrayList<>(anaGroups.values());
        
    }
}
class Solution {
    public boolean isAnagram(String s,String t) {
        // if(s.length() != t.length()) return false;
        // char[] c1 =s.toCharArray();
        // char[]c2=t.toCharArray();
        // Arrays.sort(c1);
        // Arrays.sort(c2);
        // for(int i=0;i<c1.length;i++)if(c1[i]!=c2[i])return false;
        // return true; 

        int n = s.length();
        int m = t.length();
        int[] freq = new int[26];
        if(n!=m) return false;
        for(char ch :s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch :t.toCharArray()){
            freq[ch-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return false;
        }
        return true;
    }
}
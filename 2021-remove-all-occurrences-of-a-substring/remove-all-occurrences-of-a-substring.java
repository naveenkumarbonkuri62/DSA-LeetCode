class Solution {
    public String removeOccurrences(String s, String part) {
        int m = part.length();
        StringBuilder sb = new StringBuilder();
        for(char ch :s.toCharArray()){
            sb.append(ch);
            if(sb.length()>=m){
                String sub = sb.substring(sb.length()-m);
                if(sub.equals(part)){
                    sb.setLength(sb.length()-m);
                }
            }
        }
        
        return sb.toString();
    }
}

















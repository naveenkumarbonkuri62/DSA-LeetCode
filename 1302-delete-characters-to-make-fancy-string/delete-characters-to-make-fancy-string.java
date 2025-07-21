class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        char prev = s.charAt(0);
        boolean f = false;
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if( c!=prev){
                sb.append(c);
                prev =c;

                f = false;
            }else if(!f){
                sb.append(c);
                f= true;
            }
        }
        return sb.toString();
    }
}
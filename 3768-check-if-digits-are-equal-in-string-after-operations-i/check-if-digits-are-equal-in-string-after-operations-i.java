class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();  // convert string to char array
        
        while (n > 2) {
            for (int i = 0; i < n - 1; i++) {
                int a = arr[i] - '0';
                int b = arr[i + 1] - '0';
                arr[i] = (char)(((a + b) % 10) + '0'); // update
            }
            n--; // reduce the size
        }
        
        return arr[0] == arr[1];
    }
}

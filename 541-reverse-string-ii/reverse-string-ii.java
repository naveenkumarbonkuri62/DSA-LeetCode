class Solution {
    public String reverseStr(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) return s;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, chars.length - 1);

            // Reverse the first k characters in every 2k block
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}

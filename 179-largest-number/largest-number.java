import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert the integers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort using custom comparator: (b + a) vs (a + b)
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number from sorted strings
        StringBuilder result = new StringBuilder();
        for (String s : strNums) {
            result.append(s);
        }

        return result.toString();
    }
}

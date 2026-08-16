class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;    // just increment and return
                return digits;
            }
            digits[i] = 0;      // carry over
        }

        // If all digits were 9, we need an extra digit at the front
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}

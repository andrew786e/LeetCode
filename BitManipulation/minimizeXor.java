class Solution {
    public int minimizeXor(int num1, int num2) {

        // Count number of bits
        int count = Integer.bitCount(num2); 
        int result = 0;

        // Step 1: Take as many high-order bits from num1 as possible
        for (int i = 31; i >= 0 && count > 0; i--) {
            if (((num1 >> i) & 1) == 1) {
                result |= (1 << i); 
                count--;
            }
        }

        // Step 2: Fill remaining 1's in the lowest available positions
        for (int i = 0; i < 32 && count > 0; i++) {
            if (((result >> i) & 1) == 0) {
                result |= (1 << i);
                count--;
            }
        }

        return result;
    }
}

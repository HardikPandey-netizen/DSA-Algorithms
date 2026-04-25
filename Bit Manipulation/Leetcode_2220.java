// https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/
// We have to find the bits that are not equal between 2 numbers so we can use XOR which gives 1 when 2 bits are unequal and 0 when equal
// Then count the no. of set bits using : n & (n-1)


public class Leetcode_2220 {
    public int minBitFlips(int start, int goal) {
        int a = start ^ goal;
        int count = 0;
        while(a > 0){
            a = a & (a-1);
            count++;
        }
        return count;
    }
}

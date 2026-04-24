// https://leetcode.com/problems/power-of-two/description/
// Powers of 2 in binary will always have 1 then 0s
// So if we remove the last set bit we must get 0
// We can remove the last set bit using n & (n-1)
public class Leetcode_231 {
    public boolean isPowerOfTwo(int n) {

        if(n<=0) return false;

        return ((n&(n-1))==0);
    }
}

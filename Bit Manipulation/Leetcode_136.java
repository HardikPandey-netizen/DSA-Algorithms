// https://leetcode.com/problems/single-number/description/

// Applied XOR on all the array elements as we know
// number XOR number = 0
// number XOR 0 = number

// So duplicates will become 0 and only the unique element will be remaining

public class Leetcode_136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }
}

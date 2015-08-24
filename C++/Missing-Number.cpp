class Solution {
public:
    int missingNumber(vector<int>& nums) {
    	int len = nums.size();
        for (int i = 0; i < len; i ++) {
        	while (nums[i] != i && nums[i] < len) {
        		int temp = nums[nums[i]];
        		nums[nums[i]] = nums[i];
        		nums[i] = temp;
        	}
        }
        for (int i = 0; i < len; i ++) {
        	if (nums[i] != i) return i;
        }
        return len;
    }
};
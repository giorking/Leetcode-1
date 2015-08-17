class Solution {
public:
    int threeSumSmaller(vector<int>& nums, int target) {
    	sort(nums.begin(), nums.end());
        int res = 0;
        for (int i = 0; i + 2 < nums.size(); i ++) {
        	int temp = target - nums[i], left = i + 1, right = nums.size() - 1;
        	while (left < right) {
        		if (nums[left] + nums[right] >= temp) {
        			right --;
        		} else {
        			res += (right - left);
        			left ++;
        		}
        	}
        }
        return res;
    }
};
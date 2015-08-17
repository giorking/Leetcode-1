class Solution {
public:
	vector<int> singleNumber(vector<int>& nums) {
		int exlu = 0, len = nums.size();
		for (int i = 0; i < len; i++) {
			exlu ^= nums[i];
		}
		int dim = 1;
		while ((exlu&dim) == 0) {
			dim <<= 1;
		}
		int res1 = 0, res2 = 0;
		for (int i = 0; i < len; i++) {
			if ((nums[i] & dim) != 0) {
				res1 ^= nums[i];
			}
			else {
				res2 ^= nums[i];
			}
		}
		vector<int> res = { res1, res2 };
		return res;
	}
};
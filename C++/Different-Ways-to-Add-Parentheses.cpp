class Solution {
public:
    vector<int> diffWaysToCompute(string input) {
        vector<int> res;
        int size = input.size();
        for (int i = 0; i < size; i ++) {
        	if (input[i] == '+' || input[i] == '-' || input[i] == '*') {
        		vector<int> left = diffWaysToCompute(input.substr(0, i));
        		vector<int> right = diffWaysToCompute(input.substr(i + 1));
        		for (auto n1 : left) {
        			for (auto n2 : right) {
        				if (input[i] == '+') {
        					res.push_back(n1 + n2);
        				} else if (input[i] == '-') {
        					res.push_back(n1 - n2);
        				} else {
        					res.push_back(n1 * n2);
        				}
        			}
        		}
        	}
        }
        if (res.empty()) {
        	res.push_back(atoi(input.c_str()));
        }
        return res;
    }
};
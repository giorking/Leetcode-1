// Forward declaration of the knows API.
bool knows(int a, int b);

class Solution {
public:
    int findCelebrity(int n) {
        if (n <= 1) return n;
        int cur = 0;
        for (int i = 1; i < n; i ++) {
        	if (!knows(i, cur)) {
        		cur = i;
        	}
        }
        for (int i = 0; i < n; i ++) {
        	if (i == cur) continue;
        	if (!knows(i, cur) || knows(cur, i))  //if i does not know candidate, or candidate knows i, return -1;
        		return -1;
        }
        return cur;
    }
};
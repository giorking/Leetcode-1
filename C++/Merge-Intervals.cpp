/**
 * Definition for an interval.
 * struct Interval {
 *     int start;
 *     int end;
 *     Interval() : start(0), end(0) {}
 *     Interval(int s, int e) : start(s), end(e) {}
 * };
 */
class Solution {
public:
    static bool cmp(Interval x, Interval y) {
        return x.start < y.start;
    }
    vector<Interval> merge(vector<Interval>& intervals) {
        
    }
};
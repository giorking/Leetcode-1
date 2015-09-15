class ZigzagIterator {
private:
	int idx1, idx2;
	vector<int> &vec1, &vec2;
public:
	ZigzagIterator(vector<int>& v1, vector<int>& v2) : vec1(v1), vec2(v2) {
		idx1 = idx2 = 0;
	}

	int next() {
		if (idx1 == vec1.size()) {
			return vec2[idx2++];
		}
		else if (idx2 == vec2.size()) {
			return vec1[idx1++];
		}
		else {
			if (idx1 > idx2) {
				return vec2[idx2++];
			}
			else {
				return vec1[idx1++];
			}
		}
	}

	bool hasNext() {
		return idx1 != vec1.size() || idx2 != vec2.size();
	}
};

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i(v1, v2);
 * while (i.hasNext()) cout << i.next();
 */
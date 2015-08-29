class Codec {
public:

	// Encodes a list of strings to a single string.
	string encode(vector<string>& strs) {
		string res;
		for (int i = 0; i < strs.size(); i++) {
			res += (to_string(strs[i].length()) + "#" + strs[i]);
		}
		return res;
	}

	// Decodes a single string to a list of strings.
	vector<string> decode(string s) {
		vector<string> strs;
		while (s.length() != 0) {
			int idx = 0;
			while (s[idx] >= '0' && s[idx] <= '9') {
				idx += 1;
			}
			int len = atoi(s.substr(0, idx).c_str());
			strs.push_back(s.substr(idx + 1, len));
			s = s.substr(idx + len + 1);
		}
		return strs;
	}
};

// Your Codec object will be instantiated and called as such:
// Codec codec;
// codec.decode(codec.encode(strs));
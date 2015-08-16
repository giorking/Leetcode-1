public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        if (s == null || s.length() <= 0 || words == null || words.length <= 0) return res;
        int wordlen = words[0].length(), len = words.length;
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i ++) {
            if (!hash.containsKey(words[i])) {
                hash.put(words[i], 1);
            } else {
                hash.put(words[i], hash.get(words[i]) + 1);
            }
        }
        for (int i = 0; i + wordlen * len - 1 < s.length(); i ++) {
            HashMap<String, Integer> temp = new HashMap<String, Integer>(hash);
            int vis = 1;
            for (int j = i; j < i + wordlen * len; j += wordlen) {
                String str = s.substring(j, j + wordlen);
                if (!temp.containsKey(str)) {
                    vis = 0;
                    break;
                }
                int cur = temp.get(str) - 1;
                if (cur == 0) {
                    temp.remove(str);
                } else {
                    temp.put(str, cur);
                }
            }
            if (vis == 1 && temp.size() == 0) res.add(i);
        }
        return res;
    }
}
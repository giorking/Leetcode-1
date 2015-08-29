public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs.size(); i ++) {
            sb.append(String.valueOf(strs.get(i).length()));
            sb.append("#");
            sb.append(strs.get(i));
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<String>();
        int index = 0, cur = 0;
        while (index < s.length()) {
            if (s.charAt(index) != '#') {
                cur = cur * 10 + s.charAt(index) - '0';
                index ++;
            } else {
                res.add(s.substring(index + 1, index + 1 + cur));
                index = index + 1 + cur;
                cur = 0;
            }
        }
        return res;
    }
}

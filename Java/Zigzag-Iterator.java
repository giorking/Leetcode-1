public class ZigzagIterator {
    public int x1, x2;
    public ArrayList<Integer> arr1;
    public ArrayList<Integer> arr2;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        arr1 = new ArrayList<Integer>(v1);
        arr2 = new ArrayList<Integer>(v2);
        x1 = 0;
        x2 = 0;
    }

    public int next() {
        if (x1 == arr1.size()) {
            return arr2.get(x2 ++);
        } else if (x2 == arr2.size()) {
            return arr1.get(x1 ++);
        } else {
            if (x1 > x2) {
                return arr2.get(x2 ++);
            } else {
                return arr1.get(x1 ++);
            }
        }
    }

    public boolean hasNext() {
        return x1 != arr1.size() || x2 != arr2.size();
    }
}

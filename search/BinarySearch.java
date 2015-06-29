public class BinarySearch {
    public static int BinarySearch(int[] a, int key)
    {
        int lo = 0, hi = a.length-1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int collection[] = new int[] {5, 11, 13, 24, 33, 44, 51, 63, 77, 90, 95, 99};
        int key = 24;

        int result = BinarySearch(collection, key);
        System.out.print("Key of value " + Integer.toString(key) + " is in position: " + result);
    }
}

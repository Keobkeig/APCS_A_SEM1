public class BinarySearch {
    public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2; //done by finding the low + high(in this case r - 1 since exclusive) / 2
            System.out.println("THIS INVOCATION LOOKING FOR: " + x);
            System.out.println("middle value: " + arr[mid]);

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then it can only be present in the lower half subarray
            if (arr[mid] > x) {
                System.out.println("lower value:" + arr[l]);
                System.out.println("high value:" + (arr[r] - 1));
                return binarySearch(arr, l, mid - 1, x); }
 
            // Else the element can only be present in the upper half subarray
            else {
                System.out.println("lower value:" + (arr[l] + 1));
                System.out.println("high value:" + (arr[r]));
                return binarySearch(arr, mid + 1, r, x); }
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int n = arr.length;
        int x = 11;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
}
package algorithms;

public class BinarySearch {
	public static int binarySearch(int [] a, int x, int l, int r) {
		if (l<=r) {
			int mid = (l+r)/2;
			if (mid>=x) {
				r = mid;
				return binarySearch(a, x, l, r);
			}
			else if (mid<=x) {
				l = mid;
				return binarySearch(a, x, l, r);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		
		
		int arr[] = {20,30,40,50,3,4,5,6,7,8};
		BinarySearch bs = new BinarySearch();
		bs.binarySearch(arr, 50, 0, 9);
		

	}

}

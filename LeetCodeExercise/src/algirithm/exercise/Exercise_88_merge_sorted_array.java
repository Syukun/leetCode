/**
 * 
 */
package algirithm.exercise;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 * <p>
 * 
 * 
 * 
 * @author Archer Shu
 * @date 2019/05/22
 */
public class Exercise_88_merge_sorted_array {
	/**
	 * 
	 * @param num1
	 * @param m
	 * @param num2
	 * @param n
	 */
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		// iterate second array
		if (m == 0) {
			for (int i = 0; i < n; i++) {
				nums1[i] = nums2[i];
			}
		}else {
			for (int i = n - 1; i >= 0; i--) {
				if (nums2[i] > nums1[m - 1]) {
					nums1[m + i] = nums2[i];
				} else {
					nums1[m + i] = nums1[m - 1];
					for (int j = m - 2; j >= 0; j--) {
						if (nums1[j] > nums2[i]) {
							nums1[j + 1] = nums1[j];
						} else {
							nums1[j + 1] = nums2[i];
							break;
						}
					}
					if (nums1[0] > nums2[i]) {
						nums1[0] = nums2[i];
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 0};
		int b[] = { 1 };
		int m = 0;
		int n = 1;
		merge(a, m, b, n);
	}
}

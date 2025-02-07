import java.util.HashSet;

public class LonelyPair {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 1, 2, 4 };
		int res = 0;
		HashSet<Integer> s = new HashSet<Integer>();

		for (int i : arr) {
			res = res ^ i;
		}
		System.out.println("lonely pair is " + res);
		System.out.println("lonely pair is findLonely()->>"+findLonely(arr)  );
	}

	public static int findLonely(int arr[]) {
		HashSet<Integer> s = new HashSet<Integer>();

		for (int i : arr) {
			// res= res^ i;
			if (s.contains(i)) {
				s.remove(i);
			} else {
				s.add(i);
			}
		}

		for (int i : s) {
			return i;
		}
		return -1;
	}
}

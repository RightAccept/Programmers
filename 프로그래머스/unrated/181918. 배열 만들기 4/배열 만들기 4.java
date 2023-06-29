import java.util.ArrayList;

class Solution {
	public int[] solution(int[] arr) {
		int[] stk = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i = 0;

		while (i < arr.length) {
			if (stk.length == 0) {
				list.add(arr[i]);
				i++;
				stk = new int[i];
			} else if (list.get(list.size() - 1) < arr[i]) {
				list.add(arr[i]);
				i++;
			} else if (list.get(list.size() - 1) >= arr[i]) {
				list.remove(list.size() - 1);
				if (list.isEmpty()) {
					stk = new int[0];
				}
			}
		}

		stk = new int[list.size()];
		for (i = 0; i < list.size(); i++) {
			stk[i] = list.get(i);
		}
		return stk;
	}
}
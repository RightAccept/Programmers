import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < flag.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++) {
					list.add(arr[i]);
				}
			} else {
				for (int j = 0; j < arr[i]; j++) {
					int index = list.size() - 1;
					list.remove(index);
				}
			}
		}
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
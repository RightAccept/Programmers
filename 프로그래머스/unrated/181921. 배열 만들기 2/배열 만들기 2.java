import java.util.ArrayList;
class Solution {
	public int[] solution(int l, int r) {
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;

		for (int i = l; i <= r; i++) {
			if (i % 5 == 0) {
				String tmp = Integer.toString(i);
				for (int j = 0; j < tmp.length(); j++) {
					if (tmp.charAt(j) == '5' || tmp.charAt(j) == '0') {
						count++;
					} else {
						count -= 5;
					}
				}
				if (count >= 1) {
					list.add(i);
				}
			}
			count = 0;
		}
		
		if (list.isEmpty()) {
			list.add(-1);
		}
		
		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
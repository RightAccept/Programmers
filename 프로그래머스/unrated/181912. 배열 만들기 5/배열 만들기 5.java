class Solution {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		int[] answer = {};
		int index = 0;
		for (int i = 0; i < intStrs.length; i++) {
			int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));
			if (tmp > k) {
				index++;
			}
		}
		answer = new int[index];
		index = 0;
		for (int i = 0; i < intStrs.length; i++) {
			int tmp = Integer.parseInt(intStrs[i].substring(s, s + l));
			if (tmp > k) {
				answer[index++] = tmp;
			}
		}
		return answer;
	}
}
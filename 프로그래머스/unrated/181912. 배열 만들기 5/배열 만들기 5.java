class Solution {
	public int[] solution(String[] intStrs, int k, int s, int l) {
		int[] answer = {};
		int index = 0;
		for (int i = 0; i < intStrs.length; i++) {
			String tmp = "";
			for (int j = 0; j < intStrs[i].length(); j++) {
				if (j >= s && j <= s + l - 1) {
					tmp += intStrs[i].charAt(j);
				}
			}
			int intTmp = Integer.parseInt(tmp);
			if (intTmp > k) {
				index++;
			}
		}
		answer = new int[index];
		index = 0;
		for (int i = 0; i < intStrs.length; i++) {
			String tmp = "";
			for (int j = 0; j < intStrs[i].length(); j++) {
				if (j >= s && j <= s + l - 1) {
					tmp += intStrs[i].charAt(j);
				}
			}
			int intTmp = Integer.parseInt(tmp);
			if (intTmp > k) {
				answer[index++] = intTmp;
			}
		}
		return answer;
	}
}
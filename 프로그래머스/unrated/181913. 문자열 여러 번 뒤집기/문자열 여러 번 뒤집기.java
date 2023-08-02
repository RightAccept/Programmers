class Solution {
	public String solution(String my_string, int[][] queries) {
		String answer = "";

		for (int i = 0; i < queries.length; i++) {
			answer = "";
			int[] tmpArr = queries[i];
			int s = tmpArr[0];
			int e = tmpArr[1];

			for (int j = 0; j < my_string.length(); j++) {
				if (j == s) {
					for (int k = e; k >= s; k--) {
						answer += my_string.charAt(k);
					}
					j += e - s;
				} else {
					answer += my_string.charAt(j);
				}
			}
			my_string = answer;
		}
		return answer;
	}
}
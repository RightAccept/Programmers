class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
		int len = my_string.length() / m;
		if (m == 1) {
			return my_string;
		}
		for (int i = 0; i < len; i++) {
			String tmp = "";
			if (i == len - 1) {
				tmp = my_string.substring(i * m);
			} else {
				tmp = my_string.substring(i * m, (i + 1) * m);
			}
			answer += tmp.charAt(c - 1);
		}
		return answer;
    }
}
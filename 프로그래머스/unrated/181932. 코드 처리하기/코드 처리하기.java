class Solution {
	public String solution(String code) {
		String answer = "";
		boolean flag = false;

		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '1') {
				flag = !flag;
			} else if (flag) {
				answer += i % 2 != 0 ? code.charAt(i) : "";
			} else {
				answer += i % 2 == 0 ? code.charAt(i) : "";
			}
		}
		return answer.equals("") ? "EMPTY" : answer; 
	}
}
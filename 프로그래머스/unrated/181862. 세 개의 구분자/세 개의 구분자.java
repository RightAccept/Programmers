class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
		String[] tmp;
		int index = 0;

		myStr = myStr.replace("a", "_");
		myStr = myStr.replace("b", "_");
		myStr = myStr.replace("c", "_");
		tmp = myStr.split("_");

		for (int i = 0; i < tmp.length; i++) {
			if (!tmp[i].isEmpty()) {
				index++;
			}
		}
		answer = new String[index];
		index = 0;

		for (int i = 0; i < tmp.length; i++) {
			if (!tmp[i].isEmpty()) {
				answer[index++] = tmp[i];
			}
		}
		if (answer.length == 0) {
			answer = new String[1];
			answer[0] = "EMPTY";
		}
		return answer;
	}
}
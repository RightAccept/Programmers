class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
		int index = 0;
		int count = 0;

		for (int i = 0; i < strArr.length; i++) {
			if (index < strArr[i].length()) {
				index = strArr[i].length();
			}
		}
		while (index > 0) {
			count = 0;
			for (int i = 0; i < strArr.length; i++) {
				if (strArr[i].length() == index) {
					count++;
				}
			}
			if (count > answer) {
				answer = count;
			}
			index--;
		}
		return answer;
	}
}
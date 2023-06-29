import java.util.HashMap;

class Solution {
    public int[] solution(int n, String[] words) {
    	int[] answer = new int[2];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int person = 1;
		map.put(words[0], person++);

		for (int i = 1; i < words.length; i++) {
			if (person > n) {
				person = 1;
			}
			map.put(words[i], person++);

			if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0) || map.size() < i + 1) {
				answer[0] = map.get(words[i]);
				answer[1] = i / n + 1;
				break;
			}
		}
		return answer;
	}
}
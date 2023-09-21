class Solution {
	public int solution(String my_string, String is_suffix) {
		int answer = 0;
		for (int i = my_string.length() - 1; i >= 0; i--) {
			String suffix = my_string.substring(i);
			if (suffix.equals(is_suffix)) {
				answer = 1;
			}
		}
		return answer;
	}
}
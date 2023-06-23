class Solution {
	public int solution(int a, int b) {
		int answer = 0;
		int apb;
		int ab2;

		apb = Integer.parseInt("" + a + b);
		ab2 = 2 * a * b;

		answer = apb >= ab2 ? apb : ab2;

		return answer;
	}
}
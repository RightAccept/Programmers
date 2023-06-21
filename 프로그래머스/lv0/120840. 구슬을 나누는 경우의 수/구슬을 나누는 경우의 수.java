class Solution {
	public long solution(int balls, int share) {
		
		long answer = 1;
		int n = balls;
		int m = share;
		int o = balls - share;

		for (int i = 0; i < o; i++) {
			answer *= (n - i);	// 5, 4 
			answer /= (i + 1);	// 1, 2
		}
        return answer;
	}
}
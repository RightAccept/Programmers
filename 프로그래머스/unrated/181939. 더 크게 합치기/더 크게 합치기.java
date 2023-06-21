class Solution {
    public int solution(int a, int b) {
        int answer = 0;
		String apb = "" + a + b;
		String bpa = "" + b + a;
		
		answer = apb.compareTo(bpa) >= 0 ? Integer.parseInt(apb) : Integer.parseInt(bpa);

		return answer;
	}
}
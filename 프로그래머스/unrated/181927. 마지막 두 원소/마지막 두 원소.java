class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length + 1];
		int tmp = 0;

		for (int i = 0; i < num_list.length; i++) {
			int num = num_list[i];
			if (i == num_list.length - 1) {
				answer[i+1] = num > tmp ? num - tmp : num * 2;
			}
			answer[i] = num;
			tmp = num;
		}
        return answer;
    }
}
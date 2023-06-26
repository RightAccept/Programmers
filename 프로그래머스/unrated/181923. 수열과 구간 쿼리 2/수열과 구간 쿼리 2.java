class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			int tmp = Integer.MAX_VALUE;
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			for (int j = 0; j < arr.length; j++) {
				if (s <= j && j <= e) {
					if (arr[j] > k && tmp > arr[j]) {
						tmp = arr[j];
					}
				}
			}
			if (tmp == Integer.MAX_VALUE) {
				tmp = -1;
			}
			answer[i] = tmp;
		}

		return answer;
	}
}
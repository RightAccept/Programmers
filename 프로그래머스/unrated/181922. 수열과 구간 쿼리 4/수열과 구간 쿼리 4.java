class Solution {
    public int[] solution(int[] arr, int[][] queries) {
		int[] answer = {};
		
		for(int i = 0; i < queries.length; i++) {
			int[] query = new int[queries[i].length];
				query = queries[i].clone();
				int s = query[0];
				int e = query[1];
				int k = query[2];
				for(int j = 0; j < arr.length; j++) {
					if(s <= j && j <= e && j % k == 0) {
						arr[j] += 1;
					}
				}
			}
		
		answer = arr;
		return answer;
	}
}
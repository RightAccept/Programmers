class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
        int count = 0;
        
        for(int i = start; i <= end; i++) {
        	count++;
        }
        
        answer = new int[count];
        count = 0;
        
        for(int i = start; i <= end; i++) {
        	answer[count++] = i;
        }
        
        return answer;
    }
}
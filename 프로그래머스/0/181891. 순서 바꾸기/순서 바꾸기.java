import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[num_list.length];
        int front = 0;
        int end = answer.length - n;
        for (int i = 0; i < num_list.length; i++) {
            if (i >= n) {
                answer[front++] = num_list[i];
            } else {
                answer[end++] = num_list[i];
            }
        }
        return answer;
    }
}
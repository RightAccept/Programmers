import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < num_list.length; i++) {
        	if(i % n == 0) {
        		answer.add(num_list[i]);
        	}
        }
        
        return answer;
    }
}
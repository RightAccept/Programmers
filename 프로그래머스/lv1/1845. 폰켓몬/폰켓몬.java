import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
        	set.add(nums[i]);
        }
        answer = set.size()>nums.length/2 ? nums.length/2 : set.size();
        
        return answer;
    }
}
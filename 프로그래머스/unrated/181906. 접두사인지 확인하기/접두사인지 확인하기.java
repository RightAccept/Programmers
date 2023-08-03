class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String tmp = "";
        
        for(int i = 0; i < my_string.length(); i++) {
        	tmp += my_string.charAt(i);
        	if(is_prefix.equals(tmp)) {
        		answer = 1;
        		return answer;
        	}
        }
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String tmp = my_string.substring(s, e + 1);
        int tmp_len = tmp.length() - 1;
        for (int i = 0; i < my_string.length(); i++) {
        	if (i >= s && i <= e) {
        		answer += tmp.charAt(tmp_len--);
        	} else {
        		answer += my_string.charAt(i);
        	}
        }
        return answer;
    }
}
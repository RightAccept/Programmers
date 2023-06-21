class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] test = null;
        
        test = my_string.split(" ");
        answer = Integer.parseInt(test[0]);
        
        for(int i = 1; i < test.length - 1; i++) {
        	if(test[i].equals("+")) {
        		answer += Integer.parseInt(test[i+1]);
        	}
        	if(test[i].equals("-")) {
        		answer -= Integer.parseInt(test[i+1]);
        	}
        }
        return answer;
    }
}
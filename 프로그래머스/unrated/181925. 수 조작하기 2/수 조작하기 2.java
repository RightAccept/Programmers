class Solution {
       public String solution(int[] numLog) {
        String answer = "";
        int tmp = 0;
        
        for(int i = 0; i < numLog.length; i++) {
        	int num = numLog[i];
        	if (i == 0) {
        		tmp = num;
        	}
        	switch(num - tmp) {
        	case 1: answer += "w"; break;
        	case -1: answer += "s"; break;
        	case 10: answer += "d"; break;
        	case -10: answer += "a"; break;
        	}
        	tmp = num;
        }
        
        return answer;
    }
}
import java.util.Arrays;

class Solution {
	int sort = -1;
	public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        int state = -1;
        
        int count = 0;
        int length = data.length;
        
        switch(ext) {
	        case("code"):
	        	state = 0;
	        	break;
	        case("date"):
	        	state = 1;
	        	break;
	        case("maximum"):
	        	state = 2;
	        	break;
	        case("remain"):
	        	state = 3;
	        	break;
        }
        
        for (int i = 0; i < length; i++) {
    		if (data[i][state] < val_ext) {
    			count++;
    		}
    	}
    	answer = new int[count][data[0].length];
    	count = 0;
    	for (int i = 0; i < length; i++) {
    		if (data[i][state] < val_ext) {
    			int[] tmp = data[i].clone();
    			answer[count++] = tmp;
    		}
    	}
    	
    	switch(sort_by) {
	    	case("code"):
	        	sort = 0;
	        	break;
	        case("date"):
	        	sort = 1;
	        	break;
	        case("maximum"):
	        	sort = 2;
	        	break;
	        case("remain"):
	        	sort = 3;
	        	break;
    	}
    	
    	Arrays.sort(answer, (num1, num2) -> {
    		return num1[sort]-num2[sort];
    	});
        return answer;
    }
}

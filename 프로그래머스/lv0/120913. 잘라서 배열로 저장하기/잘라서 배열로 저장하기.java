class Solution {
    public String[] solution(String my_str, int n) {
       // 배열의 갯수 지정 : +1을 안해주면 나머지가 있을 때, 남은 문자열을 넣을 배열이 없어서 에러 남
    	int cnt = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
    	// 문자열 타입의 배열을 cnt만큼 생성
      String[] answer = new String[cnt];
      // while을 사용하기 위한 변수 생성
      int i = 0;
        
			while(my_str.length() != 0) {
        	if(my_str.length() < n) {
        		n = my_str.length();
        	}
        	answer[i] = my_str.substring(0, n);
        	my_str = my_str.substring(n);
        	i++;
       }
       return answer;
   }
}
public class Solution {
    public static void main(String[] args) {
		/*
		 * 특수문자 출력하기 다음과 같이 출력하도록 코드를 작성해 주세요
		 * !@#$%^&*(\'"<>?:;
		 */
		int[] answer = {'!','@','#','$','%','^','&','*','(','\\','\'','\"','<','>','?',':',';'};
		for(int i = 0; i < answer.length; i++) {
			System.out.printf("%c",answer[i]);
		}
	}
}
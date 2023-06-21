class Solution {
    static int[] solution(int[] arr) {
        int[] answer = {};	// 반환할 answer 배열
        int power = 1;	 // 2의 제곱을 계산할 변수 -> 1도 2의 0승이기 때문에 1로 설정해 줘야 한다
       
        int length = arr.length; // while 반복문을 돌리기 위해 arr의 길이를 저장하는 length 변수
        while(length != power) {	// arr의 길이가 2의 제곱이 아닐 때 반복
        	length = arr.length;
        	if(length > power) {	// length가 2의 거듭제곱보다 클 때
        		power *= 2;		// power에 2를 곱한다
        	}
        	if(length < power) {	// length가 2의 거듭제곱의 값보다 작을 때
        		int[] tmp = new int[power];	// 임시 정수 배열 tmp를 생성
        		for(int i = 0; i < arr.length; i++) {	// arr의 길이만큼 반복하면서
        			tmp[i] = arr[i];	// 임시 배열 tmp의 i번째에 arr의 i를 저장
        		}
        		arr = tmp;	// arr이 tmp 배열이 가리키는 곳을 가리키게 만든다
        	}
        }
        answer = arr;	// 제출할 answer 배열이 arr을 가리키게 만든다
        return answer;
    }
}
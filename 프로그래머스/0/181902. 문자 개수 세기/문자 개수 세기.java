class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = 0;
        for (int i = 0; i < 52; i++) {
            if (i == 26) {
                alpha = alpha.toLowerCase();
                index = 0;
            }
            answer[i] = my_string.length() - my_string.replace(alpha.charAt(index++) + "", "").length();
        }
        return answer;
    }
}
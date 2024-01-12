import java.util.*;

class Solution {
    public long solution(long n) {

        String str = n + "";
        char[] cArr = new char[str.length()];

        for(int i = 0; i < cArr.length; i++) {
            cArr[i] = str.charAt(i);
        }
        Arrays.sort(cArr);

        for(int i = 0; i < cArr.length / 2; i++) {
            char c = cArr[cArr.length - i - 1];
            cArr[cArr.length - i - 1] = cArr[i];
            cArr[i] = c;
        }

        str = String.valueOf(cArr);
        long answer = Long.parseLong(str);

        return answer;
    }
}
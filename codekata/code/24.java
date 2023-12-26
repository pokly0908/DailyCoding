class Solution {
    public String solution(String[] seoul) {
        String trash = "Kim";
        String answer = "";
        for(int i = 0; i < seoul.length; i++){
            if(trash.equals(seoul[i])) answer = "김서방은 " + i + "" +"에 있다";
        }
        return answer;
    }
}
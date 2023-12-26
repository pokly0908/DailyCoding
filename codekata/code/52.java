class Solution {
    public int solution(int a, int b, int n) {
        //n : 가지고 있는 수   a : 바꿔주는 수  b = 돌려받 수
        int answer = 0;
        while(n >= a){
            if(n >= a){
                answer += (n / a) * b;  //바꿔먹은 콜라 수
                n = (n % a) + ((n / a) * b); //남은거
            }
        }
        return answer;
    }
}
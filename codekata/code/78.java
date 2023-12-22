class Solution {
    public int solution(int n) {
        int trash = 1234567;
        int[] fib = new int[100001];
        fib[0] = 0;
        fib[1] = 1;
        if(n > 1){
            for(int i = 2; i <= n; i++){
                fib[i] = (fib[i - 1] % trash) + (fib[i - 2] % trash);
            }
        }
        return fib[n] % trash;
    }
}
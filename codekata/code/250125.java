class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for(int i = 0; i <= 3; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if(n > h_check && h_check >= 0 && n > w_check && w_check >= 0){
                if(board[h][w].equals(board[h_check][w_check])) count++;
            }
        }
        return count;
    }
}
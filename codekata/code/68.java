import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int ans = 0;
        List<Integer> burger = new ArrayList<>();

        for(int i :ingredient){
            burger.add(i);

            while(burger.size() >= 4){
                int n = burger.size();
                if(!(burger.get(n - 4) == 1 && burger.get(n - 3) == 2 && burger.get(n - 2) == 3 && burger.get(n - 1) == 1)) break;

                for(int j = 0; j < 4; j++){
                    burger.remove(burger.size() - 1);
                }
                ans++;
            }
        }
        return ans;
    }
}
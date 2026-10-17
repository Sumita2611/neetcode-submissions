class Solution {
    public int sum(int n){
        int sqSum = 0;
        while(n != 0){
            sqSum += Math.pow(n%10 , 2.0);
            n /= 10;
        }
        return sqSum;
    }
    public boolean isHappy(int n) {
      int slow = n;
      int fast = n;
      while(true){
        slow = sum(slow);
        fast = sum(sum(fast));
        if(slow == fast){
            break;
        }
    }
    return slow == 1;
    }
}

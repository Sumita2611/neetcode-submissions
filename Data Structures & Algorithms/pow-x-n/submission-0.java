class Solution {
    public double myPow(double x, int n) {
        long power = Math.abs((long)n);
        double ans = 1;
        for(long i = 0;i < power;i++){
            ans *= x;
        }
        if(n < 0){
            return 1/ans;
        }
        return ans;
    }
}

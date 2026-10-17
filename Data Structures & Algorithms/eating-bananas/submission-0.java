class Solution {
    public boolean fun(int[] piles , int m , int h){
        int actualHrs = 0;
        for(int x : piles){
            actualHrs += x/m;
            if(x % m != 0){
                actualHrs++;
            }
        }
        return actualHrs <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int r = Integer.MIN_VALUE;
        int l = 1;
        for(int x : piles){
            r = Math.max(r , x);
        }
        while(l <= r){
        int m = l + (r-l)/2;
        if(fun(piles , m , h)){
            r = m-1;
        }
        else{
            l = m+1;
        }
        }
        return l;
    }
}

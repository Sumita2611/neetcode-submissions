class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totGas = 0,totCost = 0,stInd = 0,currGas = 0;
        for(int i = 0;i < gas.length;i++){
            totGas += gas[i];
            totCost += cost[i];
            currGas += (gas[i] - cost[i]);
            if(currGas < 0){
                stInd = i+1;
                currGas = 0;
            }
        }
        if(totGas < totCost){
            return -1;
        }
        return stInd;
    }
}

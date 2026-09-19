// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         return nums[n-k];
//     }
// }

// max heap
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int x : nums){
//             pq.offer(x);
//         }
//         for(int i = 1;i < k;i++){
//             pq.poll();
//         }
//         return pq.peek();
//     }
// }

//min heap
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x : nums){
            pq.offer(x);
        }
        while(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}
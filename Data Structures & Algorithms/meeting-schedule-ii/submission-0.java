/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        Map<Integer , Integer> mp = new TreeMap<>();
        for(Interval interval : intervals){
            mp.put(interval.start , mp.getOrDefault(interval.start , 0) + 1);
            mp.put(interval.end , mp.getOrDefault(interval.end , 0) - 1);
        }
        int rooms = 0 , maxRooms = 0;
        for(int delta : mp.values()){
            rooms += delta;
            maxRooms = Math.max(maxRooms , rooms);
        }
        return maxRooms;
    }
}

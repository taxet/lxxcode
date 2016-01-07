/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> res = new LinkedList<Interval>();
		if(intervals.size() == 0){
			res.add(newInterval);
			return res;
		}
		res.addAll(intervals);
		boolean isIn = false;
		for(int i = 0; i < res.size(); i++){
			if(newInterval.start > res.get(i).end) continue; 
			if(newInterval.end < res.get(i).start){
				if(isIn) res.get(i - 1).end = newInterval.end;
				else res.add(i, newInterval);
				return res;
			}
			if(newInterval.end <= res.get(i).end){
				if(isIn){
					res.get(i-1).end = Math.max(res.get(i).end, newInterval.end);
					res.remove(i);
					return res;
				}
				res.get(i).start = Math.min(res.get(i).start, newInterval.start);
				res.get(i).end = Math.max(res.get(i).end, newInterval.end);
				return res;
			}
			if(isIn){
				res.remove(i);
				i--;
			}else{
				res.get(i).start = Math.min(res.get(i).start, newInterval.start);
				isIn = true;
			}
		}
		if(isIn) res.get(res.size() - 1).end = newInterval.end;
		if(newInterval.start > res.get(res.size() - 1).end)
			res.add(newInterval);
		return res;
        
    }
}

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
    public List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<Interval>();
		if (null == intervals || 0 == intervals.size()) {
			return res;
		}
		Collections.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval a, Interval b) {
				return a.start - b.start;
			}
		});
		res.add(intervals.get(0));
		for (int i = 1; i < intervals.size(); i++) {
			if (res.get(res.size() - 1).end < intervals.get(i).start) {
				res.add(intervals.get(i));
			} else {
				res.get(res.size() - 1).start = Math.min(res.get(res.size() - 1).start, intervals.get(i).start);
				res.get(res.size() - 1).end = Math.max(res.get(res.size() - 1).end, intervals.get(i).end);
			}
		}
		return res;
        
    }
}

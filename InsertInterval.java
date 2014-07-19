 //http://blog.csdn.net/linhuanmars/article/details/22238433
 public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<Interval>();  
        if(intervals.size()==0){  
            res.add(newInterval);  
            return res;  
        }  
        int i=0;  
        while(i<intervals.size() && intervals.get(i).end<newInterval.start)  
        {  
            res.add(intervals.get(i));  
            i++;  
        }  
        if(i<intervals.size())  
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);  
        res.add(newInterval);  
        while(i<intervals.size() && intervals.get(i).start<=newInterval.end)  
        {  
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);  
            i++;  
        }  
        while(i<intervals.size())  
        {  
            res.add(intervals.get(i));  
            i++;  
        }  
        return res;  
    }
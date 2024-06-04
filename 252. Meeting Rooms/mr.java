class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
                Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])); // Sort the start time of meeting 
                for (int i = 1; i < intervals.length; i++) {
                    if(intervals[i-1][1]>intervals[i][0]){ // compare the previous meeting end time > next meeting start time then he can't attend the 2nd meeting 
                        return false;
                    } 

    }
    return true;
}}

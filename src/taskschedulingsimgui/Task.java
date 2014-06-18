package taskschedulingsimgui;

import java.util.ArrayList;

/**
 *
 * @author ljubo
 */

public class Task {
    ArrayList<Integer> activationTimes;
    ArrayList<Integer> absoluteDeadlines;
    ArrayList<Integer> deadlineBreaches;
    ArrayList<ArrayList<Integer>> startTimes;
    ArrayList<ArrayList<Integer>> endTimes;
    
    public Task() {
        this.activationTimes = new ArrayList<>();
        this.absoluteDeadlines = new ArrayList<>();
        this.deadlineBreaches = new ArrayList<>();
        this.startTimes = new ArrayList<>();
        this.endTimes = new ArrayList<>();
    }
    
    public void addActivationTime(int time) {
        activationTimes.add(time);
    }
    
    public void addAbsoluteDeadline(int time) {
        absoluteDeadlines.add(time);
    }
    
    public void addDeadlineBreach(int time) {
        deadlineBreaches.add(time);
    }
    
    public void addStartTimes(ArrayList<Integer> s) {
        this.startTimes.add(s);
    }
    
    public void addEndTimes(ArrayList<Integer> e) {
        this.endTimes.add(e);
    }

    public ArrayList<Integer> getActivationTimes() {
        return activationTimes;
    }

    public ArrayList<Integer> getAbsoluteDeadlines() {
        return absoluteDeadlines;
    }

    public ArrayList<Integer> getDeadlineBreaches() {
        return deadlineBreaches;
    }

    public ArrayList<ArrayList<Integer>> getStartTimes() {
        return startTimes;
    }

    public ArrayList<ArrayList<Integer>> getEndTimes() {
        return endTimes;
    }
}

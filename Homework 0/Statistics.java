// CMP 426: Operating Systems - Homework 0 - Isaac D. Hoyos

import java.util.ArrayList;
import java.util.Collections;

// The Statistics class provides basic statistical operations on a list of integer values.
public class Statistics {

    // This field stores the list of integer values used for statistical calculations.
    private ArrayList<Integer> values;

    // This constructor initializes the list as an empty list.
    public Statistics() {
        values = new ArrayList<Integer>();
    }

    // This constructor initializes the list with the provided values.
    public Statistics(ArrayList<Integer> vals) {
        values = new ArrayList<Integer>();
        add(vals);
    }

    // This method adds a single integer value to the list.
    public void add(int val) {
        values.add(val);
    }

    // This method adds all integer values from the provided list to the member list.
    public void add(ArrayList<Integer> vals) {
        for (int v : vals) {
            values.add(v);
        }
    }

    // This method computes and returns the average of the values rounded to one decimal place.
    public double getAverage() {
        if (values.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        double avg = (double) sum / values.size();
        return Math.round(avg * 10.0) / 10.0;
    }

    // This method returns the maximum value stored in the list.
    public int getMaximum() {
        if (values.isEmpty()) {
            return 0;
        }
        return Collections.max(values);
    }

    // This method returns the minimum value stored in the list.
    public int getMinimum() {
        if (values.isEmpty()) {
            return 0;
        }
        return Collections.min(values);
    }

    // This method computes and returns the median value of the list.
    public double getMedian() {
        if (values.isEmpty()) {
            return 0.0;
        }
        ArrayList<Integer> sorted = new ArrayList<Integer>(values);
        Collections.sort(sorted);
        int size = sorted.size();
        int middle = size / 2;
        if (size % 2 == 1) {
            return sorted.get(middle);
        } else {
            return (sorted.get(middle - 1) + sorted.get(middle)) / 2.0;
        }
    }

    // This method returns the range of the values by subtracting the minimum from the maximum.
    public int getRange() {
        if (values.isEmpty()) {
            return 0;
        }
        return getMaximum() - getMinimum();
    }

    // This method clears all stored values and resets the list to an empty state.
    public void clear() {
        values.clear();
    }
}

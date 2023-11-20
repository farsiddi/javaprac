package Comparing;

import java.util.Comparator;

public class WorkexpComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.workexp - o2.workexp;
    }
}

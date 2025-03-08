package day1.pt1;

import java.util.List;

public class NumberLists {
    private final List<Integer> firstList;
    private final List<Integer> secondList;

    public NumberLists(List<Integer> firstList, List<Integer> secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public int getFirstListSize() {
        return firstList.size();
    }

    public int getSecondListSize() {
        return secondList.size();
    }

    public int getDistance() {
        int sum = 0;
        if (firstList.size() != secondList.size()) {
            throw new IllegalArgumentException("Lists must have the same size");
        }
        for (int i = 0; i < getFirstListSize(); i++) {
            int firstListNum = firstList.get(i);
            int secondListNum = secondList.get(i);
            sum += Math.abs(firstListNum - secondListNum);
        }
        return sum;
    }
}

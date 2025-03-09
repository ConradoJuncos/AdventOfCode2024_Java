package day1;

import java.util.List;

public class NumberLists {
    private final List<Integer> firstList;
    private final List<Integer> secondList;

    public NumberLists(List<Integer> firstList, List<Integer> secondList) {
        this.firstList = firstList;
        this.secondList = secondList;
    }

    public List<Integer> getFirstList() {
        return firstList;
    }

    public List<Integer> getSecondList() {
        return secondList;
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

    public int getSimilarityScore() {
        int similarityScore = 0;
        int size = this.getFirstListSize();
        for (int i = 0; i < size; i++) {
            int secondListCount = 0;
            for (int j = 0; j < size; j++) {
                if (firstList.get(i).equals(secondList.get(j))) {
                    secondListCount += 1;
                }
            }
            similarityScore += (firstList.get(i) * secondListCount);
        }
    return similarityScore;
    }
}

package day1.pt1;
// Input is 2 lists of numbers, I have to get each list on an array, sort it and find the sum of the distances

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> sort(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr;
    }

    public static NumberLists readAndGetLists(String filename) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().replaceAll("\\s+", " "); // Normalize spaces
                String[] parts = line.split(" "); // Split by space

                if (parts.length == 2) { // Ensure there are exactly 2 numbers
                    firstList.add(Integer.parseInt(parts[0]));
                    secondList.add(Integer.parseInt(parts[1]));
                }
            }
            return new NumberLists(sort(firstList), sort(secondList));

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        NumberLists list = readAndGetLists("src/main/java/day1/pt1/input.txt");
        System.out.println("Sum of distances of numbers between lists: " + list.getDistance());
    }
}

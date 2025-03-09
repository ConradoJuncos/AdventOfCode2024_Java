package day1;

public class Main {
    public static void main(String[] args) {
        NumberLists list = FileReader.readAndGetLists("src/main/resources/day1/input.txt");
        System.out.println("Sum of distances of numbers between lists: " + list.getDistance());
        System.out.println("Total Similarity Score: " + list.getSimilarityScore());
    }
}

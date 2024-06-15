package StructuralDesignPattern.CompositeDesignPattern.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("movie");
        directory.add(new File("abc.mp4"));
        System.out.println(directory);
    }
}

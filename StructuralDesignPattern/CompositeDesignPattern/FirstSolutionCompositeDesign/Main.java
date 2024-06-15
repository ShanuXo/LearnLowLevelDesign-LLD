package StructuralDesignPattern.CompositeDesignPattern.FirstSolutionCompositeDesign;


public class Main {
    public static void main(String[] args)
    {
        Directory movieDirectory = new Directory("Movie");
    FileSystem jawan=new File("Jawan");
    movieDirectory.add(jawan);

    Directory comedyMovie = new Directory("ComedyMovie");
    File golmaal=new File("Golmaal");

    comedyMovie.add(golmaal);

    movieDirectory.add(comedyMovie);

    movieDirectory.ls();
    }
}

package InterviewQuestions.BookMyShow;

import  java.util.HashMap;
import java.util.List;

import InterviewQuestions.BookMyShow.Enums.City;

import java.util.ArrayList;

public class MovieController {
    HashMap<City,List<Movie>> cityVsMovies;
    List<Movie> allMovie;

    MovieController()
    {
        cityVsMovies =new HashMap<>();
        allMovie = new ArrayList<>();
    }

    void addMovie(Movie movie,City city)
    {
        allMovie.add(movie);
        List<Movie> movies=cityVsMovies.getOrDefault(city,new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city,movies);
    }

    Movie getMovieByName(String movieName)
    {
        for(Movie movie : allMovie)
        {
            if((movie.getMovieName().equals(movieName)))
            {
                return movie;
            }
        }
        return null;
    }

    List<Movie> getMovieByCity(City city)
    {
        return cityVsMovies.get(city);
    }
     //REMOVE movie from a particular city, make use of cityVsMovies map

    //UPDATE movie of a particular city, make use of cityVsMovies map

    //CRUD operation based on Movie ID, make use of allMovies list

}

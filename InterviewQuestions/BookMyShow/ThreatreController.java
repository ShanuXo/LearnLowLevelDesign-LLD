package InterviewQuestions.BookMyShow;

import InterviewQuestions.BookMyShow.Enums.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class ThreatreController {
    HashMap<City,List<Theatre>> cityVsTheatre;
    List<Theatre> allThreatre;

    public ThreatreController()
    {
        cityVsTheatre = new HashMap<>();
        allThreatre = new ArrayList<>();
    }
    void addThreatre(Theatre theatre,City city)
    {
        allThreatre.add(theatre);
        List<Theatre> theatres = cityVsTheatre.getOrDefault(city,new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatre.put(city,theatres);
    }

    public HashMap<Theatre,List<Show>> getAllShow(Movie movie,City city)
    {
        //get all the theater of this city
        HashMap<Theatre,List<Show>> threatreVsShows = new HashMap<>();
        List<Theatre> theatres = cityVsTheatre.get(city);

        for(Theatre theatre : theatres)
        {
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();
            for(Show show : shows)
            {
                if(show.movie.getMovieId() == movie.getMovieId())
                {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty())
            {
                threatreVsShows.put(theatre,givenMovieShows);
            }
        }
        return threatreVsShows;
    }
}

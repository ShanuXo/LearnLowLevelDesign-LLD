package InterviewQuestions.BookMyShow;

import InterviewQuestions.BookMyShow.Enums.City;
import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int theateId;
    String address;
    City city;
    List<Screen> screens=new ArrayList<>();
    List<Show> shows=new ArrayList<>();

    public int getTheatreId()
    {
        return theateId;
    }
    public void setTheatreId(int threateId)
    {
        this.theateId=threateId;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public City getCity()
    {
        return city;
    }
    public void setCity(City city)
    {
        this.city = city;
    }

    public List<Screen> getScreen()
    {
        return screens;
    }
    public void setScreen(List<Screen> screens)
    {
        this.screens = screens;
    }
    public List<Show> getShows()
    {
        return shows;
    }
    public void setShows(List<Show> shows)
    {
        this.shows = shows;
    }
}

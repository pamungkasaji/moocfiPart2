
package reference;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {
    
    private Map<Film, List<Rating>> filmRating;
    private Map<Person, Map<Film,Rating>> personRating;

    public RatingRegister() {
        filmRating = new HashMap<Film, List<Rating>>();
        personRating = new HashMap<Person, Map<Film,Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(!filmRating.containsKey(film)){
            filmRating.put(film, new ArrayList<Rating>());
        }
        
        filmRating.get(film).add(rating);
    }
    
    public List<Rating> getRatings(Film film){
        return filmRating.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return filmRating;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(!personRating.containsKey(person)){
            personRating.put(person, new HashMap<Film, Rating>());
            personRating.get(person).put(film, rating);
            addRating(film, rating);
        } else if (!personRating.get(person).containsKey(film)){
            personRating.get(person).put(film, rating);
            addRating(film, rating);
        }
    }
    
    public Rating getRating(Person person, Film film){
        if (!personRating.containsKey(person)){
            return Rating.NOT_WATCHED;
        } else if (!personRating.get(person).containsKey(film)){
            return Rating.NOT_WATCHED;
        }
        
        return personRating.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if (!personRating.containsKey(person)){
            return new HashMap<Film, Rating>();
        }
        return personRating.get(person);
    }
    
    public List<Person> reviewers(){
        return new ArrayList<Person>(personRating.keySet());
    }
}

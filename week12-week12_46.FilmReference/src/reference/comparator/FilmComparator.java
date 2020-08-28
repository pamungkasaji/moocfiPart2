
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import reference.domain.Film;
import java.util.Map;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film>{
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    @Override
    public int compare(Film o1, Film o2) {
        double average1 = average(ratings.get(o1));
        double average2 = average(ratings.get(o2));
        
        if (average1 == average2){
            return 0;
        } else if (average1 > average2){
            return -1;
        } else {
            return 1;
        }
    }
    
    private double average(List<Rating> filmRatings){
        double sum = 0;
        for (Rating filmRating : filmRatings){
            sum += filmRating.getValue();
        }
        return (double) sum/filmRatings.size();
    }
}

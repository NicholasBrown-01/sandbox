package parentchildpractice;

import java.util.ArrayList;

public class Blueprint {

    // ***PROPERTIES*** //

    public String name;
    public String hours;
    public ArrayList<BlueprintReview> review= new ArrayList<>();
    public Integer starRating;
    public String slogan;

    public Blueprint(String name, String hours, ArrayList<BlueprintReview> review, Integer starRating, String slogan) {
        this.name = name;
        this.hours = hours;
        this.review = review;
        this.starRating = starRating;
        this.slogan = slogan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public ArrayList<BlueprintReview> getReview() {
        return review;
    }

    public void setReview(ArrayList<BlueprintReview> review) {
        this.review = review;
    }

    public Integer getStarRating() {
        return starRating;
    }

    public void setStarRating(Integer starRating) {
        this.starRating = starRating;
    }

    @Override
    public String toString() {
        return "Blueprint{" +
                "name='" + name + '\'' +
                ", hours='" + hours + '\'' +
                ", review=" + review +
                ", starRating=" + starRating +
                '}';
    }
}

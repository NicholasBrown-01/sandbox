package parentchildpractice.Businesses;

import parentchildpractice.Blueprint;

import java.util.ArrayList;

public class Club extends Blueprint {


    // ***PROPERTIES*** //

    public String drinksList;


    public Club(String name, String hours, ArrayList<BlueprintReview> review, Integer starRating) {
        super(name, hours, review, starRating);
    }
}

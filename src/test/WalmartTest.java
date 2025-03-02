package test;

import java.util.HashMap;
import java.util.Map;

public class WalmartTest {

    Map<Integer, Integer> contentMap;
    int maxPopularity = 0;

    public WalmartTest() {
        contentMap = new HashMap<>();
    }


    public void increasePopularity(int contentId) {
        if (contentMap.containsKey(contentId)) {
            int popularity = contentMap.get(contentId);
            popularity++;
            contentMap.put(contentId, popularity);
        } else {
            contentMap.put(contentId, 1);
        }
    }

    public void decreasePopularity(int contentId) {
        if (contentMap.containsKey(contentId)) {
            int popularity = contentMap.get(contentId);
            popularity--;
            contentMap.put(contentId, popularity);
        } else {
            contentMap.put(contentId, 0);
        }
    }

    public int mostPopular() {
        for (Map.Entry<Integer, Integer> entry : contentMap.entrySet()) {
            maxPopularity = Math.max(entry.getValue(), maxPopularity);
            int popularity = entry.getValue();
            if (popularity == maxPopularity) {
                return entry.getKey();
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        WalmartTest test = new WalmartTest();
        test.increasePopularity(1);
        test.increasePopularity(1);
        test.increasePopularity(1);
        test.increasePopularity(4);
        test.increasePopularity(5);
        test.increasePopularity(3);
        test.increasePopularity(1);

        test.decreasePopularity(1);
        test.decreasePopularity(2);
        test.decreasePopularity(1);
        test.decreasePopularity(1);
        test.increasePopularity(5);
        test.increasePopularity(5);

        System.out.println(test.mostPopular());
    }
}


// social Media
// it shows content (like and dislike button)
// user clicks like popularity increase by 1
// user clicks dislike decrement by one
// retrieve first 5 popular content
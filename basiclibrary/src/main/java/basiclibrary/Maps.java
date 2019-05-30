package basiclibrary;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Maps {

    public static void main(String[] args) {

        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(analyzeWeather(weeklyMonthTemperatures));


        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        System.out.println(tally(votes));

    }

    public static String analyzeWeather(int[][] weatherArrays) {
        int minTemp = weatherArrays[0][0];
        int maxTemp = weatherArrays[0][0];
        String weatherReport;

        Set<Integer> tempsRecorded = new HashSet<>();

        for (int[] weatherArray : weatherArrays) {
            for (int dailyTemp : weatherArray) {
                if (dailyTemp < minTemp) {
                    minTemp = dailyTemp;
                } else if (dailyTemp > maxTemp) {
                    maxTemp = dailyTemp;
                }

                tempsRecorded.add(dailyTemp);
            }
        }

        weatherReport = "High: " + maxTemp + "\nLow: " + minTemp;

        for (int i = minTemp ; i < maxTemp ; i++) {
            if (!tempsRecorded.contains(i)) {
                weatherReport += "\nNever saw temperature: " + i;
            }
        }

        return weatherReport;
    }

    public static String tally(List<String> votesList) {

        // Create a list containing each unique vote cast
        ArrayList<String> candidates = new ArrayList<>();
        for (String candidate : votesList) {
            if (!candidates.contains(candidate)) {
                candidates.add(candidate);
            }
        }

        // Create an array with a counter for each element in the candidates list, and for each counter iterate through votesList to total votes cast for that candidate.
        int[] tallyArray = new int[candidates.size()];
        for (int i = 0 ; i < tallyArray.length ; i++) {
            for (String vote : votesList) {
                if (vote == candidates.get(i)) {
                    tallyArray[i]++;
                }
            }
        }

        // Determine the index of the winning candidate
        int winnerIndex = 0;
        for(int i = 1 ; i < tallyArray.length ; i++) {
            if (tallyArray[i] > tallyArray[winnerIndex]) {
                winnerIndex = i;
            }
        }

        return candidates.get(winnerIndex);
    }
}

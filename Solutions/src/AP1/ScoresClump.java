package AP1;

public class ScoresClump {

    // Given an array of scores sorted in increasing order,
    // return true if the array contains 3 adjacent scores
    // that differ from each other by at most 2,
    // such as with {3, 4, 5} or {3, 5, 5}.

    // scoresClump([3, 4, 5]) → true
    // scoresClump([3, 4, 6]) → false
    // scoresClump([1, 3, 5, 5]) → true

    public boolean scoresClump(int[] scores) {
        for (int i = 0; i < scores.length - 2; i++) {
            int max = Math.max(Math.max(scores[i], scores[i + 1]), Math.max(scores[i + 1], scores[i + 2]));
            int min = Math.min(Math.min(scores[i], scores[i + 1]), Math.min(scores[i + 1], scores[i + 2]));
            if (max - min <= 2) return true;
        }
        return false;
    }

}

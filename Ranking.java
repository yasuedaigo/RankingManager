import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ranking {
    private ArrayList<Score> list;
    private final String RANKING_MESSAGE = "%d 位: %s %d";
    private final int START_RANK = 1;

    public Ranking() {
        list = new ArrayList<>();
    }

    public void EntryScore(int point, String name) {
        Score score = new Score(point, name);
        list.add(score);
    }

    public void PrintRanking() {
        Collections.sort(list, new Comparator<Score>() {
            @Override
            public int compare(Score scoreFirst, Score scoreSecond) {
                return Integer.compare(scoreSecond.getPoint(), scoreFirst.getPoint());
            }
        });
        for (int i = 0; i < list.size(); i++) {
            int rank = START_RANK;
            Score listElement = list.get(i);
            System.out.println(String.format(RANKING_MESSAGE, rank, listElement.getName(), listElement.getPoint()));
            rank++;
        }
    }
}

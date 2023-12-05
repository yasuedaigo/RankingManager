import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ranking {
    private List<Integer> pointList;
    private List<Score> point_name_List;
    private static final String POINT_RANKING_FORMAT = "%d 位: %d";
    private static final String POINT_NAME_RANKING_FORMAT = "%d 位: %s %d";

    public Ranking() {
        pointList = new ArrayList<>();
        point_name_List = new ArrayList<>();
    }

    //スコアだけを登録する
    public void EntryScore(int inputScore) {
        pointList.add(inputScore);
    }

    //スコアと名前を登録する
    public void EntryScore(int inputScore, String inputName) {
        Score score = new Score(inputScore, inputName);
        point_name_List.add(score);
    }

    //スコアのみのランキングを出力する
    public void printPointRanking() {
        // スコアを降順にソート
        Collections.sort(pointList, Collections.reverseOrder());

        // ランキングの出力
        for (int i = 0; i < pointList.size(); i++) {
            System.out.println(String.format(POINT_RANKING_FORMAT, i + 1, pointList.get(i)));
        }
    }

    //スコアと名前のランキングを出力する
    public void printPoint_NameRanking() {
        // Score オブジェクトのリストをスコアに基づいて降順にソート
        Collections.sort(point_name_List, (s1, s2) -> Integer.compare(s2.getPoint(), s1.getPoint()));

        // 名前とスコアのペアのランキングを出力
        for (int i = 0; i < point_name_List.size(); i++) {
            Score score = point_name_List.get(i);
            System.out.println(String.format(POINT_NAME_RANKING_FORMAT, i + 1, score.getName(), score.getPoint()));
        }
    }
}
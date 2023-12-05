public class RankingManager {
    public static void main(String[] args) {
        Ranking ranking = new Ranking();
        //課題1
        ranking.EntryScore(300);
        ranking.EntryScore(100);
        ranking.EntryScore(400);
        ranking.EntryScore(200);
        ranking.printPointRanking();

        //課題2
        ranking.EntryScore(300, "name300");
        ranking.EntryScore(100, "name100");
        ranking.EntryScore(400, "name400");
        ranking.EntryScore(200, "name200");
        ranking.printPoint_NameRanking();
    }
}
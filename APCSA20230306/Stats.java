package APCSA20230306;

import java.util.ArrayList;

public class Stats {
    public static ArrayList<ScoreInfo> scoreList = new ArrayList<>();
            //listed in increasing score order;
            // no two ScoreInfo objects containthe same score
        
            /** records the score in the database, keeping the database in increasing score order.  If no other 
             * ScoreInfo object represents a score, a new ScoreInfo object representing score
             * is added to the database; otherwise, the frequency in the ScoreInfo object representing 
             * score is incremented.
             * @param score a score to be recorded in the list
             * @return true if a new ScoreInfo object representing score was added to the list;
             * false otherwise
             */
            public static boolean record(int score)  {
                 
                /* implemented in part(a)  */
                 for(int i=0;i< scoreList.size();i++){
                    int  compareScore = scoreList.get(i).getScore();
                    if (score == compareScore) {
                        scoreList.get(i).increment();
                        return false;
                    }    
                    else if(score > compareScore) {
                        ScoreInfo newScore = new ScoreInfo(score);  
                        scoreList.add(i, newScore); 
                        return true;
                    }
                }   
                scoreList.add(new ScoreInfo(score));
                return true;
            }

            /** Records all scores in stuScores in the database, keeping the
             * database in increasing score order
             * @param stuScores an array of student test scores
             */
            public static void recordScores(int[] stuScores) {
             /* implemented in part (b) */
                for (int score : stuScores)
                  record(score);    
            }
    
}

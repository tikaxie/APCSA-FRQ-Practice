package APCSA20230306;

import java.util.ArrayList;


public class Main {

             public static void main(String[] args) throws Exception {

                int testingScores[] = {5, 10, 25, 70, 95, 83, 95, 75, 93, 70};

                Stats.recordScores(testingScores);

                for (int i = 0; i < Stats.scoreList.size(); i++)  {
                    System.out.println(Stats.scoreList.get(i).getScore() + 
                    " Frequency: " 
                    + Stats.scoreList.get(i).getFrequency()
                    + "\n");
                }
            }


        
}

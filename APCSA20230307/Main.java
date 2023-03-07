package APCSA20230307;

import java.util.ArrayList;


public class Main {

             public static void main(String[] args) throws Exception {

                int pixelValues[][] = {
                                        { 255, 184, 178, 84, 129},
                                       { 84, 255, 255, 130, 84},
                                       {78, 255, 0, 0, 78},
                                       {84, 130, 255, 130, 84}
                                      };

                GrayImage img = new GrayImage(pixelValues);
                int whitePixels = img.countWhitePixels();

               
                System.out.println("White Pixels = " + whitePixels);
      
            }


        
}

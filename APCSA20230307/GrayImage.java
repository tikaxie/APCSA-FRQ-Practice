package APCSA20230307;

public class GrayImage
  {

    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /** The 2-dimensional representation of this image.  Guaranteed not to be null.
    * All values in the array are within the range [BLACK, WHITE] inclusive.
    */
    private int[][] pixelValues;

    // mpropp added constructor for testing
    GrayImage(int [[][] testImage]) {
      pixelValues = testImage;
    }
    

    /** @return the total number of white pixels in this image.
    * Postcondition:  this image has not been changed.
    */
    public int countWhitePixels() {
      // to be implemented in part A
      return
      
    }

    /** Processes this image in row-major order and decreases the value of each pixel 
    * at position (row,col) by the value of the pixel at position (row+2, col+2) if it exists.
    * resulting values that would be les than BLACK are replaced by BLACK.
    * Pixels for which there is no pixel at position (row + 2, col +2) are unchanged.
    */
    public void processImage{
      // to be implemented in part B
      
    }
  }
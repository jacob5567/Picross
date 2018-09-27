/**
 * Jacob Faulk
 */
package com.jacob5567.Picross;
import java.util.Random;

/**
 * @author jacob
 *
 */
public class Square
{
   private static final Random rand = new Random();
   private boolean filled;
   
   public Square()
   {
      filled = rand.nextBoolean();
   }
   
   public Square(boolean filled)
   {
      this.filled = filled;
   }
   
   public boolean getFilled()
   {
      return filled;
   }
   
   public void setFilled(boolean filled)
   {
      this.filled = filled;
   }

}

/**
 * Jacob Faulk
 */
package com.jacob5567.Picross;

/**
 * @author jacob
 *
 */
public class PlaySquare
{
	   private int fill;
	   //0 is empty, 1 is full, 2 is X'd
	   public PlaySquare()
	   {
	      this.fill = 0;
	   }//end constructor
	   
	   public PlaySquare(int fill)
	   {
	      this.fill = fill;
	   }//end constructor
	   
	   public void setFill(int fill)
	   {
	      this.fill = fill;
	   }//end setFill
	   
	   public int getFill()
	   {
	      return fill;
	   }//end getFill
	   
	   public boolean getFilled()
	   {
	      return fill == 1;
	   }//end getFilled
	   
}

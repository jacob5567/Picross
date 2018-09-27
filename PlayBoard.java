/**
 * Jacob Faulk
 */
package com.jacob5567.Picross;
import java.awt.Graphics;
import java.awt.Color;
//import java.awt.Font;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

/**
 * @author jacob
 *
 */
public class PlayBoard
{
   private final int dimensions;
   private Board ansBoard;
   private PlaySquare[][] playBoard;
   private String[] rowNums;
   private String[] colNums;
   
   public PlayBoard(Board ansBoard)
   {
      this.ansBoard = ansBoard;
      this.dimensions = ansBoard.getBoard().length;
      this.rowNums = ansBoard.getRowNums();
      this.colNums = ansBoard.getColNums();
      playBoard = new PlaySquare[dimensions][dimensions];
      for(int r=0;r<playBoard.length;r++)
         for(int c=0;c<playBoard[0].length;c++)
            playBoard[r][c] = new PlaySquare();
   }//end constructor
   
   public boolean changeSquare(int r, int c, int fill)
   {
      playBoard[r][c].setFill(fill);
      if(this.checkBoard())
      {
         //System.exit(0);
         return true;
      }
      return false;
   }//end changeSquare
   
   public Board getAnsBoard()
   {
      return ansBoard;
   }
   
   public int getSquareFill(int r, int c)
   {
      return playBoard[r][c].getFill();}
   
   public boolean checkBoard()
   {
      for(int r=0;r<playBoard.length;r++)
         for(int c=0;c<playBoard[0].length;c++)
            if(playBoard[c][r].getFilled() != ansBoard.getBoard()[r][c].getFilled())
               return false;
      return true;
   }//end checkBoard

   public void drawBoard(Graphics g, int x, int y)
   {
      //g.setFont(new Font("TimesRoman",Font.PLAIN,30));
      BufferedImage img = null;
      int gSizeY=((y/playBoard[0].length)*3)/4;
      int add=(x/4)+(x/20);
      for(int row=0;row<playBoard.length;row++)
      {
         g.setColor(Color.BLACK);
         g.drawString(rowNums[row],(gSizeY+add)-(gSizeY*2),(row*gSizeY)+(gSizeY/2));
         for(int col=0;col<playBoard[0].length;col++)
         {
            switch(playBoard[row][col].getFill())
            {
               case 0:
               
                  g.setColor(Color.WHITE);
                  g.fillRect((row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY);
                  g.setColor(Color.black);
               
               /*
                  g.setColor(Color.WHITE);
                  g.fillRect((row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY);
                  g.setColor(Color.black);
                  try
                  {
                     img = ImageIO.read(new File("blankTile.png"));
                  }
                  catch(IOException e)
                  {
                  }
                  g.drawImage(img,(row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY,null);
               */
                  break;
               case 1: 
               
                  g.setColor(Color.GRAY);
                  g.fillRect((row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY);
                  g.setColor(Color.black);
               
               /*
                  try
                  {
                     img = ImageIO.read(new File("filledTile.png"));
                  }
                  catch(IOException e)
                  {
                  }
                  g.drawImage(img,(row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY,null);
               */
                  break;
               case 2:
               /*
                  g.setColor(Color.red);
                  g.fillRect((row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY);
                  g.setColor(Color.black);
               */
                  g.setColor(Color.WHITE);
                  g.fillRect((row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY);
                  g.setColor(Color.black);
                  try
                  {
                     img = ImageIO.read(new File("redX.png"));
                  }
                  catch(IOException e)
                  {
                  }
                  g.drawImage(img,(row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY,null);
                  break;
            }
            
            g.drawRect((row*gSizeY)+add,(col*gSizeY),gSizeY,gSizeY);
         }
      }
      for(int col=0;col<playBoard[0].length;col++)
      {
         g.setColor(Color.BLACK);
         g.drawString(colNums[col],(gSizeY*col)+add+gSizeY/5,(gSizeY*playBoard[0].length)+(gSizeY/2));
      }
   }
   
   public int getDimensions()
   {
      return dimensions;
   }

}

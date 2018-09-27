/**
 * Jacob Faulk
 */
package com.jacob5567.Picross;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.util.Scanner;
/*
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;
import java.util.Date;
*/

/**
 * @author jacob
 *
 */
public class Panel extends JPanel
{
   private final int width;
   private final int height;
   private PlayBoard playBoard;
   private boolean solved;
   private int level;
   //private static Timer timer;
   //private static  action;
   //private static Graphics l;
   
   public Panel(int sizeX, int sizeY)
   {
      super();
      width = sizeX;
      height = sizeY;
      solved = false;
      level = 1;
      
      /*TIMER STUFF
      timer = new Timer(1000,
         new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
               levelComplete(l);
            }
         }
      );
      timer.setInitialDelay(1000);
      */ 
   }
   
   public void initializeLevel(int level)
   {
      this.level = level;
      boolean[][] box = {{true,true,true,true},
                         {true,false,false,true},
                         {true,false,false,true},
                         {true,true,true,true}};
      
      
      boolean[][] twoByTwo = {{true,true},
                              {true,false}};
      
      
      boolean[][] emptyFour = {{false,false,false,false},
                               {false,false,false,false},
                               {false,false,false,false},
                               {false,false,false,false}};
      
      
      boolean[][] filledFour = {{true,true,true,true},
                                {true,true,true,true},
                                {true,true,true,true},
                                {true,true,true,true}};
      
      
      boolean[][] level1 = {{false,true,false},
                             {true,true,true},
                             {false,true,false}};
                             
                             
      boolean[][] gap = {{true,false,true},
                        {false,true,false},
                        {true,false,true}};
                        
                       
      boolean[][] level2 = {{false,false,true,false,false},
                                {false,true,true,true,false},
                                {true,true,true,true,true},
                                {false,true,true,true,false},
                                {false,false,true,false,false}};
                             
                             
      boolean[][] fourLines = {{true,true,true,true},
                               {false,false,false,false},
                               {true,true,true,true},
                               {false,false,false,false}};
                             
                             
      boolean[][] testLines = {{true,true,true,true,true,true,true,true,true},
                              {false,false,false,false,false,false,false,false,false},
                              {true,true,true,true,true,true,true,true,true},
                              {false,false,false,false,false,false,false,false,false},
                              {true,true,true,true,true,true,true,true,true},
                              {false,false,false,false,false,false,false,false,false},
                              {true,true,true,true,true,true,true,true,true},
                              {false,false,false,false,false,false,false,false,false},
                              {true,true,true,true,true,true,true,true,true}};
      
      
      boolean[][] helicopter = {{false,false,false,true,false,false,false,false,false,false},
                               {true,true,true,true,true,true,true,true,false,false},
                               {false,false,false,true,false,false,false,false,false,false},
                               {false,false,true,true,true,false,false,false,false,false},
                               {false,true,false,true,true,false,false,false,false,true},
                               {true,true,true,true,true,true,true,false,false,true},
                               {true,true,true,true,true,true,true,true,true,true},
                               {false,false,true,false,false,false,false,true,false,false},
                               {true,true,true,true,true,true,true,true,true,true},
                               {false,false,false,false,false,false,false,false,false,false}};
                               
                               
      boolean[][] dosPrompt = {{true,true,true,true,true,true,true,true,true,true},
                               {true,false,true,false,true,true,true,true,true,true},
                               {true,true,true,true,true,true,true,true,true,true},
                               {true,false,false,false,false,false,false,false,false,true},
                               {true,false,true,false,false,false,false,false,false,true},
                               {true,false,false,true,false,true,true,true,false,true},
                               {true,false,true,false,false,false,false,false,false,true},
                               {true,false,false,false,false,false,false,false,false,true},
                               {true,false,false,false,false,false,false,false,false,true},
                               {true,true,true,true,true,true,true,true,true,true}};
                               
      boolean[][] usb = {{false,false,false,false,false,false,false,false,false,false},
                         {false,false,false,false,false,false,false,false,false,false},
                         {true,true,true,true,true,false,false,false,false,false},
                         {true,true,true,true,true,true,true,true,true,false},
                         {true,true,true,true,true,true,true,false,true,false},
                         {true,true,true,true,true,true,true,true,true,false},
                         {true,true,true,true,true,true,true,false,true,false},
                         {true,true,true,true,true,true,true,true,true,false},
                         {true,true,true,true,true,false,false,false,false,false},
                         {false,false,false,false,false,false,false,false,false,false}};
      
                               
      boolean[][] current = new boolean[1][1];
      
      switch(this.level)
      {
         case 1:
            current = level1;
            break;
         case 2:
            current = level2;
            break;
         /*
         case 3:
            current = testLines;
            break;
         */
         case 3:
            current = dosPrompt;
            break;
         case 4:
            current = usb;
            break;
         case 5:
            current = helicopter;
            break;
         default:
            System.exit(0);
      }//end switch
                               
      playBoard=new PlayBoard(new Board(current));
      for(int r=0;r<playBoard.getDimensions();r++)
      {
         for(int c=0;c<playBoard.getDimensions();c++)
         {
            if(playBoard.getAnsBoard().getBoard()[r][c].getFilled())
               System.out.print("X ");
            else
               System.out.print("O ");
         }
         System.out.println();
      }
      System.out.println();
   
   
   }//end initializeLevel
   
   public void changeSquare(int num, int x, int y, int iX, int iY)
   {
      int sizeY=((height/playBoard.getDimensions())*3)/4;
      int add=(width/4)+(width/20);
      int xRow = 0;
      int yCol = 0;
      int iXRow = 0;
      int iYCol = 0;
      for(int row=0;row<playBoard.getDimensions();row++)
         for(int col=0;col<playBoard.getDimensions();col++)
         {
            if((x>(row*sizeY)+add && x<((row+1)*sizeY)+add) && (y>(col*sizeY) && y<((col+1)*sizeY)))
            {
               if(playBoard.getSquareFill(row,col) == num)
                  solved = playBoard.changeSquare(row,col,0);
                     
               else
                  solved = playBoard.changeSquare(row,col,num);
               xRow = row;
               yCol = col;
            }
            /*
            else if((iX>(row*sizeY)+add && iX<((row+1)*sizeY)+add) && (iY>(col*sizeY) && iY<((col+1)*sizeY)))
            {
               if(playBoard.getSquareFill(row,col) == num)
               {
                  solved = playBoard.changeSquare(row,col,0);
                  iXRow = row;
                  iYCol = col;
               }    
               else
               {
                  solved = playBoard.changeSquare(row,col,num);
                  iXRow = row;
                  iYCol = col;
               }
               
               if(iXRow == xRow)
               {
                  if(iYCol<yCol)
                     for(int i=iYCol+1;i<yCol;i++)
                        solved = playBoard.changeSquare(xRow,i,num);
                  else
                     for(int i=yCol+1;i<iYCol;i++)
                        solved = playBoard.changeSquare(xRow,i,num);
               }
               else if(iYCol == yCol)
               {
                  if(iXRow<xRow)
                     for(int i=iXRow+1;i<xRow;i++)
                        solved = playBoard.changeSquare(i,yCol,num);
                  else   
                     for(int i=xRow+1;i<iXRow;i++)
                        solved = playBoard.changeSquare(i,yCol,num);
               }
               
            }
            */
         }
   }
   
   @Override
   public void paintComponent(Graphics g)
   {
      playBoard.drawBoard(g,width,height);
      if(solved)
      {
         levelComplete(g);
         
         /*
         NONE OF THESE WORK!!!!
         
         timer.setDelay(1000);
         timer.setRepeats(false);
         timer.start();
         
         timer.stop();
         
         try
         {
         this.wait(1000);
         }
         catch(Exception e)
         {}
         
         try
         {
         TimeUnit.SECONDS.sleep(1);
         }
         catch(InterruptedException e)
         {}
         
         try {
            Thread.sleep(100);
         } 
         catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
         }
         
         pause3(1000);
         
         pause(1);
         */
         //pause();
         solved = false;
         level++;
         g.setColor(getBackground());
         g.fillRect(0,0,width,height);
         initializeLevel(level);
         
      }
   }
   
   public void levelComplete(Graphics g)
   {	
      g.setColor(new Color(0,152,240));
      g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
      g.drawString("Level Complete!",50,725);
   }
   
   public synchronized void pause()
   {
   	try
      {
      this.wait(1000);
      }
      catch(Exception e)
      {}
   }
   
   /* 
   public static void pause(int seconds){
      Date start = new Date();
      Date end = new Date();
      while(end.getTime() - start.getTime() < seconds * 1000){
         end = new Date();
      }
   }
   
   
   public void pause3(long sleeptime) {
      long expectedtime = System.currentTimeMillis() + sleeptime;
      while(System.currentTimeMillis() < expectedtime) {
        //Empty Loop   
      }
   }
   */

}

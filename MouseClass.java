//Jacob Faulk
package com.jacob5567.Picross;

import java.awt.event.MouseMotionListener;
//import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

public class MouseClass extends MouseInputAdapter implements MouseMotionListener
{
	  
   private boolean clicked=false;
   private int x=0;
   private int y=0;
   private int set=0;
   private int iX=0;
   private int iY=0;
   
   public MouseClass()
   {
      super();
   }
   
   @Override
    public void mouseClicked(MouseEvent e)
   {
   /*
      if(e.getButton() == MouseEvent.BUTTON1)
      {
         clicked =true;
         x=(int)e.getX();
         y=(int)e.getY();
         iX=(int)e.getX();
         iY=(int)e.getY();
         set=1;
         //System.out.println("pressed");
      }
      if(e.getButton() == MouseEvent.BUTTON3)
      {
         clicked =true;
         x=(int)e.getX();
         y=(int)e.getY();
         iX=(int)e.getX();
         iY=(int)e.getY();
         set=2;
         //System.out.println("r pressed");
      }
   */
   }
   
   
   @Override
   public void mouseDragged(MouseEvent e)
   {
   /*
      if(e.getButton() == MouseEvent.BUTTON1)
      {
         clicked =true;
         x=(int)e.getX();
         y=(int)e.getY();
         set=1;
         System.out.println("pressed");
      }
      if(e.getButton() == MouseEvent.BUTTON3)
      {
         clicked =true;
         x=(int)e.getX();
         y=(int)e.getY();
         set=2;
         System.out.println("r pressed");
      }
   */
   }

   @Override
    public void mouseEntered(MouseEvent e)
   {/*
    if(e.getButton() == MouseEvent.BUTTON1)
      {
         clicked =true;
         x=(int)e.getX();
         y=(int)e.getY();
         set=1;
         System.out.println("pressed");
      }
      if(e.getButton() == MouseEvent.BUTTON3)
      {
         clicked =true;
         x=(int)e.getX();
         y=(int)e.getY();
         set=2;
         System.out.println("r pressed");
      }
   */
   }

   @Override
    public void mouseExited(MouseEvent e) 
   {
   
   }

   @Override
    public void mousePressed(MouseEvent e) 
   {
           
      if(e.getButton() == MouseEvent.BUTTON1)
      {
         clicked = true;
         x=(int)e.getX();
         y=(int)e.getY();
         set = 1;
         //System.out.println("pressed");
      }
      if(e.getButton() == MouseEvent.BUTTON3)
      {
         clicked = true;
         x=(int)e.getX();
         y=(int)e.getY();
         set = 2;
         //System.out.println("r pressed");
      }
      /*
      if(e.getButton() == MouseEvent.BUTTON2)
      {
         clicked = true;
         x=(int)e.getX();
         y=(int)e.getY();
         set = 1;
         System.out.println("m pressed");
      }
      */
   }

   @Override
    public void mouseReleased(MouseEvent e) 
   {
   /*
      iX=(int)e.getX();
      iY=(int)e.getY();
      clicked = true;
   */
   }
   
   public boolean getClicked()
   {
      return clicked;
   }
   
   public int getX()
   {
      return x;
   }
   public int getY()
   {
      return y;
   }
   
   public int getIX()
   {
      return iX;
   }
   
   public int getIY()
   {
      return iY;
   }

   
   public int getSet()
   {
      clicked=false;
      return set;
   }


}

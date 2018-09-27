//Jacob Faulk
package com.jacob5567.Picross;

import java.awt.event.KeyListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Frame extends JFrame implements KeyListener
{

	private static final long serialVersionUID = 1L;
	private final Panel panel;
   private boolean isRunning;
   private final int width;
   private final int height;
   private MouseClass mouse;
   
   public Frame()
   {
      super("Picross");
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      width = 1 + ((int)screenSize.getWidth());
      height = 1 + ((int)screenSize.getHeight());
      panel = new Panel(width,height);
      panel.initializeLevel(1);
      //resizeable stuff
      //setLocation(0,0);
      addKeyListener((KeyListener) this);
      //setExtendedState(Frame.MAXIMIZED_BOTH);
      setSize(width,height);
      this.add(panel);
      mouse = new MouseClass();
      this.addMouseListener(mouse);
      this.addMouseMotionListener(mouse);
      setUndecorated(true);//change this to make fullscreen
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      isRunning=true;
   }
   public void updatePanel()
   {
      try
      {Thread.sleep(15);}
      catch(Exception e)
      {System.out.println(e);}
      if(mouse.getClicked())
         {
         panel.changeSquare(mouse.getSet(),mouse.getX(),mouse.getY(),mouse.getIX(),mouse.getIY());
         }
      panel.revalidate();
      panel.repaint();
   }
   
   public boolean getRun()
   {
      return isRunning;
   }
   
   @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) 
       {
       if(e.getKeyCode() == KeyEvent.VK_ESCAPE)//ends frame
          {setVisible(false);
          dispose();
          isRunning=false;}
       }

    @Override
    public void keyReleased(KeyEvent e) 
       {
       }



}

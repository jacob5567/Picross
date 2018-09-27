//Jacob Faulk
package com.jacob5567.Picross;

public class PicrossRunner
{
   public static void main(String[] args)
   {
      Frame frame=new Frame();
      
      while(frame.getRun())
         frame.updatePanel();
   }
  
}

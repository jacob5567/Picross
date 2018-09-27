/**
 * Jacob Faulk
 */
package com.jacob5567.Picross;

/**
 * @author jacob
 *
 */
public class Board
{
   private final int dimensions;
   private Square[][] board;
   private String[] rowNums;
   private String[] colNums;
   
   public Board()
   {
      this.dimensions = 10;
      board = new Square[dimensions][dimensions];
      rowNums = new String[dimensions];
      for(int i=0;i<rowNums.length;i++)
         rowNums[i] = "";
      colNums = new String[dimensions];
      for(int i=0;i<colNums.length;i++)
         colNums[i] = "";
      for(int r=0;r<board.length;r++)
      {
         for(int c=0;c<board[0].length;c++)
         {
            board[r][c] = new Square();
         }
      }
      //generate numbers
      int rowNum = 0;
      for(int r=0;r<board.length;r++)
      {
         for(int c=0;c<board[0].length;c++)
         {
            if(board[r][c].getFilled())
            {
               rowNum++;
            }
            else
            {
               if(c != 0 && board[r][c-1].getFilled())
                  rowNums[r] = rowNums[r] + String.valueOf(rowNum) + " ";
               rowNum = 0;
            }
         }
         if(rowNum != 0)
            rowNums[r] = rowNums[r] + String.valueOf(rowNum);
         if(rowNums[r].isEmpty())
            rowNums[r] = "0 ";
         rowNum = 0;
      }
      int colNum = 0;
      for(int c=0;c<board.length;c++)
      {
         for(int r=0;r<board[0].length;r++)
         {
            if(board[r][c].getFilled())
            {
               colNum++;
            }
            else
            {
               if(r != 0 && board[r-1][c].getFilled())
                  colNums[c] = colNums[c] + String.valueOf(colNum) + " ";
               colNum = 0;
            }
         }
         if(colNum != 0)
            colNums[c] = colNums[c] + String.valueOf(colNum);
         if(colNums[c].isEmpty())
            colNums[c] = "0 ";
         colNum = 0;
      }
   }//end constructor

   public Board(Square[][] board)
   {
      if(board.length != board[0].length)
      {
         System.out.println("Error! Board must have the same number of rows and columns!");
         System.exit(0);
      }
      this.dimensions = board.length;
      this.board = board;
      rowNums = new String[dimensions];
      for(int i=0;i<rowNums.length;i++)
         rowNums[i] = "";
      colNums = new String[dimensions];
      for(int i=0;i<colNums.length;i++)
         colNums[i] = "";
      
      //generate numbers
      int rowNum = 0;
      for(int r=0;r<board.length;r++)
      {
         for(int c=0;c<board[0].length;c++)
         {
            if(board[r][c].getFilled())
            {
               rowNum++;
            }
            else
            {
               if(c != 0 && board[r][c-1].getFilled())
                  rowNums[r] = rowNums[r] + String.valueOf(rowNum) + " ";
               rowNum = 0;
            }
         }
         if(rowNum != 0)
            rowNums[r] = rowNums[r] + String.valueOf(rowNum);
         if(rowNums[r].isEmpty())
            rowNums[r] = "0 ";
         rowNum = 0;
      }
      int colNum = 0;
      for(int c=0;c<board.length;c++)
      {
         for(int r=0;r<board[0].length;r++)
         {
            if(board[r][c].getFilled())
            {
               colNum++;
            }
            else
            {
               if(r != 0 && board[r-1][c].getFilled())
                  colNums[c] = colNums[c] + String.valueOf(colNum) + " ";
               colNum = 0;
            }
         }
         if(colNum != 0)
            colNums[c] = colNums[c] + String.valueOf(colNum);
         if(colNums[c].isEmpty())
            colNums[c] = "0 ";
         colNum = 0;
      }
   }//end constructor
   
   public Board(boolean[][] boolBoard)
   {
      if(boolBoard.length != boolBoard[0].length)
      {
         System.out.println("Error! Board must have the same number of rows and columns!");
         System.exit(0);
      }
      this.dimensions = boolBoard.length;
      board = new Square[dimensions][dimensions];
      rowNums = new String[dimensions];
      for(int i=0;i<rowNums.length;i++)
         rowNums[i] = "";
      colNums = new String[dimensions];
      for(int i=0;i<colNums.length;i++)
         colNums[i] = "";
      for(int r=0;r<board.length;r++)
      {
         for(int c=0;c<board[0].length;c++)
         {
            board[r][c] = new Square(boolBoard[r][c]);
         }
      }
      //generate numbers
      int rowNum = 0;
      for(int r=0;r<board.length;r++)
      {
         for(int c=0;c<board[0].length;c++)
         {
            if(board[r][c].getFilled())
            {
               rowNum++;
            }
            else
            {
               if(c != 0 && board[r][c-1].getFilled())
                  rowNums[r] = rowNums[r] + String.valueOf(rowNum) + " ";
               rowNum = 0;
            }
         }
         if(rowNum != 0)
            rowNums[r] = rowNums[r] + String.valueOf(rowNum);
         if(rowNums[r].isEmpty())
            rowNums[r] = "0 ";
         rowNum = 0;
      }
      int colNum = 0;
      for(int c=0;c<board.length;c++)
      {
         for(int r=0;r<board[0].length;r++)
         {
            if(board[r][c].getFilled())
            {
               colNum++;
            }
            else
            {
               if(r != 0 && board[r-1][c].getFilled())
                  colNums[c] = colNums[c] + String.valueOf(colNum) + " ";
               colNum = 0;
            }
         }
         if(colNum != 0)
            colNums[c] = colNums[c] + String.valueOf(colNum);
         if(colNums[c].isEmpty())
            colNums[c] = "0 ";
         colNum = 0;
      }
   }//end constructor


   public Board(int dimensions)
   {
      this.dimensions = dimensions;
      board = new Square[dimensions][dimensions];
      rowNums = new String[dimensions];
      for(int i=0;i<rowNums.length;i++)
         rowNums[i] = "";
      colNums = new String[dimensions];
      for(int i=0;i<colNums.length;i++)
         colNums[i] = "";
      for(int r=0;r<board.length;r++)
      {
         for(int c=0;c<board[0].length;c++)
         {
            board[r][c] = new Square();
         }
      }
      //generate numbers
      int rowNum = 0;
      for(int r=0;r<board.length;r++)
      {
         for(int c=0;c<board[0].length;c++)
         {
            if(board[r][c].getFilled())
            {
               rowNum++;
            }
            else
            {
               if(c != 0 && board[r][c-1].getFilled())
                  rowNums[r] = rowNums[r] + String.valueOf(rowNum) + " ";
               rowNum = 0;
            }
         }
         if(rowNum != 0)
            rowNums[r] = rowNums[r] + String.valueOf(rowNum);
         if(rowNums[r].isEmpty())
            rowNums[r] = "0 ";
         rowNum = 0;
      }
      int colNum = 0;
      for(int c=0;c<board.length;c++)
      {
         for(int r=0;r<board[0].length;r++)
         {
            if(board[r][c].getFilled())
            {
               colNum++;
            }
            else
            {
               if(r != 0 && board[r-1][c].getFilled())
                  colNums[c] = colNums[c] + String.valueOf(colNum) + " ";
               colNum = 0;
            }
         }
         if(colNum != 0)
            colNums[c] = colNums[c] + String.valueOf(colNum);
         if(colNums[c].isEmpty())
            colNums[c] = "0 ";
         colNum = 0;
      }
   }//end constructor
   
   public String[] getRowNums()
   {
      return rowNums;
   }
   
   public String[] getColNums()
   {
      return colNums;
   }
   
   public Square[][] getBoard()
   {
      return board;
   }

}

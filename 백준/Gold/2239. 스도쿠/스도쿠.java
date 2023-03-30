import java.io.*;
import java.util.*;

public class Main {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static StringBuilder sb = new StringBuilder();
   static StringTokenizer st;   
   
   static final int SIZE = 9;
   static int[][] sudoku = new int[SIZE][SIZE];
   static boolean[][] rows = new boolean[SIZE][SIZE];
   static boolean[][] cols = new boolean[SIZE][SIZE];
   static boolean[][][] boxs = new boolean[3][3][SIZE];
   static List<Blank> list = new ArrayList<>();
   
   public static void main(String[] args) throws IOException {
      
      for(int i=0; i<sudoku.length; i++) {
         String input = br.readLine();
         for(int j=0; j<sudoku[i].length; j++) {
            int num = input.charAt(j) - '0' - 1;
            sudoku[i][j] = num;
            if(num == -1) {
               list.add(new Blank(i, j));
            }else {
               rows[i][num] = true;
               cols[j][num] = true;
               boxs[i/3][j/3][num] = true;
            }
         }
      }
      
      makeIt(0);
      
      printIt();
         
      System.out.println(sb);
   }
   
   static void printIt() {
      int idx = 0;
      for(int i=0; i<sudoku.length; i++) {
         for(int j=0; j<sudoku[i].length; j++) {
            if(sudoku[i][j] == -1) {
               sb.append(list.get(idx++).num + 1);
            }else {
               sb.append(sudoku[i][j] + 1);
            }
         }
         sb.append('\n');
      }
   }
   
   static boolean makeIt(int idx) {
      if(idx == list.size()) return true;
      
      Blank blank = list.get(idx);
      int r = blank.r;
      int c = blank.c;
      
      boolean isSudoku = false;
      for(int num=0; num<SIZE; num++) {
         if(rows[r][num]) continue;
         if(cols[c][num]) continue;
         if(boxs[r/3][c/3][num]) continue;
         
         rows[r][num] = true;
         cols[c][num] = true;
         boxs[r/3][c/3][num] = true;
         isSudoku = makeIt(idx+1);
         if(isSudoku) {
            blank.num = num;
            break;
         }
         rows[r][num] = false;
         cols[c][num] = false;
         boxs[r/3][c/3][num] = false;
      }
      
      return isSudoku;
   }
   
   static class Blank{
      int r, c;
      int num;
      
      Blank(int r, int c){
         this.r = r;
         this.c = c;
      }
   }
}
/*
 * Problem statement
Two players, named ‘player1’ and ‘player2’, play a tic-tac-toe game on a grid of size ‘3 x 3’. Given an array ‘moves’ of size ‘n’, where each element of the array is a tuple of the form (row, column) representing a position on the grid. Players place their characters alternatively in the sequence of positions given in ‘moves’. Consider that ‘player1’ makes the first move. Your task is to return the winner of the game, i.e., the winning player’s name. If there is no winner and some positions remain unmarked, return ‘uncertain’. Otherwise, the game ends in a draw, i.e., when all positions are marked without any winner, return ‘draw’.

The rules of tic-tac-toe are as follows :

1. At the start of the game, all grid positions are empty.

2. The players take turns to place their characters alternatively into empty positions. ‘player1’ always places character ‘X’ and ‘player2’ always places character ‘O’.

3. A player will never place characters into filled positions.

4. The game ends when all the positions are filled.

5. The game also ends when any row, column, or diagonal contains three same characters (i.e., either ‘X’ or ‘O’). In this case, the winner is the player whose character occupies these three positions.

6. Once the game ends, no more moves are played.

Example :

n = 5, moves = {{0,2}, {0,0}, {1,1}, {2,2}, {2,0}}

First, an ‘X’ is placed at (0,2) by ‘player1’, then an ‘O’ at (0,0) by ‘player2’ and so on. After performing the given five moves, the grid contains three ‘X’s along a diagonal; hence the winner is ‘player1’. So the answer is ‘player1’.

Note :

1. The array ‘moves’ doesn’t contain any repeating positions, and all positions are valid.
2. The array ‘moves’ follows all the rules of tic-tac-toe.
3. You do not need to print anything; it has already been taken care of. Just implement the function
Detailed explanation ( Input/output format, Notes, Images )
Sample input 1 :
2
9
0 0
0 1
1 1
1 0
2 1
2 2
2 0
0 2
1 2
5
0 0
1 1
0 2
2 2
2 1
Sample output 1 :
draw
uncertain
Explanation of sample input 1 :
Test Case 1:

There is no row, column, or diagonal with three same characters after performing the given nine moves. Hence there is no winner. With no more moves to make (all grid positions are marked), the game ends in a draw. So, the answer is ‘draw’.

Test Case 2:

There is no row, column, or diagonal with three same characters after performing the given five moves. Hence there is no winner as of now. With four grid positions remaining unmarked, the winner of the game is uncertain. So, the answer is ‘uncertain’.
Sample input 2 :
2
6
0 0
1 1
2 2
0 2
1 0
2 0
5
0 1
1 2
2 1
1 0
1 1
Sample output 2 :
player2
player1
 */
// Intuit, Facebook, Apple

import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe {
    public static String ticTacToeWinner(ArrayList<ArrayList<Integer>> moves, int n) {
		// Write your code here
		char[][] board=new char[3][3];

		for(int i=0;i<3;i++){
			Arrays.fill(board[i],'-');
		}
		boolean isPlayer1=true;
		for(ArrayList<Integer> move:moves){
			int row=move.get(0);
			int col=move.get(1);

			board[row][col]=isPlayer1?'X':'0';

			if(helper(board,row,col)) return isPlayer1?"player1":"player2";
			isPlayer1=!isPlayer1;
		}
		return moves.size()==9?"draw":"uncertain";
	}
	private static boolean helper(char[][] board,int r,int c){
		char curr=board[r][c];

		if(board[r][0]==curr && board[r][1]==curr && board[r][2]==curr) return true;
		if(board[0][c]==curr && board[1][c]==curr && board[2][c]==curr) return true;
		if(r==c && board[0][0]==curr && board[1][1]==curr && board[2][2]==curr) return true;
		if((r+c)==2 && board[0][2]==curr && board[1][1]==curr && board[2][0]==curr) return true;
		return false;
	}
}

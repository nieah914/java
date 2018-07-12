package java_algorithm;

public class Book_jumpgame {
	private int n;
	private int[][] board;
	 public Book_jumpgame(int _n, int[][] _board) {
		 n = _n;
		 System.out.println(n);
		 board = _board;
		 System.out.println(board[0][0]);
	 }
	
	public boolean jump(int y, int x) {
		//±âÀú »ç·Ê °ÔÀÓÆÇ ¹Û
		if( y >= n || x >= n) return false;
		//±âÀú »ç·Ê ¸¶Áö¸·Ä­ µµÂø
		if(y == n-1 && x == n-1) return true;
		
		System.out.println("board[y][x] = " + board[y][x]);
		int jumpside = board[y][x];
		
		return jump(y+jumpside,x) || jump(y,x+jumpside);
	}
	
	
	
}

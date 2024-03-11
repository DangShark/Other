// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int rows = grid.length; // Số hàng
		int cols = grid[0].length; // Số cột (giả sử tất cả các hàng có số cột bằng nhau)
		int maxX = 0, minX = 999, maxY=0,minY = 999;
		int beginX = 0,endX = 0,beginY = 0,endY = 0;
		int cnt = 0;
		for(int i = 0; i < rows; i++){
			for (int j = 0; j < cols; j++){
				if(grid[i][j] == ch){
					cnt++;
					beginX = Math.min(minX,j);// gtri nho nhat
					minX = beginX;
					endX = Math.max(maxX,j);// gtri lon nhat
					maxX = endX;
					beginY = Math.min(minY,i);// gtri nho nhat
					minY = beginY;
					endY = Math.max(maxY,i);// gtri lon nhat
					maxY = endY;
				}
			}
		}
		if(cnt != 0){
			int dt = (endX - beginX + 1) * (endY - beginY + 1);
			return (dt);
		}
		return 0;

	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int rows = grid.length; // Số hàng
		int cols = grid[0].length; // Số cột (giả sử tất cả các hàng có số cột bằng nhau)
		int kqua = 0;
		for (int i = 1; i < rows - 1; i++) {
			for (int j = 1; j < cols - 1; j++) {
				if (grid[i][j] != ' ') {
					char center = grid[i][j];
					if (grid[i - 1][j] == center && grid[i + 1][j] == center && grid[i][j - 1] == center && grid[i][j + 1] == center) {
						int k = 1;
						while (true) {
							int cnt = 0;
							if (i - 1 - k >= 0 && grid[i - 1 - k][j] == center) cnt++;
							if (i + 1 + k <= rows - 1 && grid[i + 1 + k][j] == center) cnt++;
							if (j - 1 - k >= 0 && grid[i][j - 1 - k] == center) cnt++;
							if (j + 1 + k <= cols - 1 && grid[i][j + 1 + k] == center) cnt++;
							if (cnt == 4) {
								k++;
							}
							else if (cnt == 0) {
								kqua++;
								break;
							}
							else{
								break;
							}
						}
					}
				}
			}
		}
		return (kqua);
	}
	
}

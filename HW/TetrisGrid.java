//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
	boolean[][] grid;
	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int rows = grid.length; // Số hàng
		int cols = grid[0].length;
		boolean[] check = new boolean[cols];
		for (int j = 0; j < cols; j++) {
			for(int i = 0; i < rows; i++) {
				if (!grid[i][j]) {
					check[j] = false;
					break;
				}
				else{
					check[j] = true;
				}
			}
		}
		for(int row = 0; row < cols - 1; row++) {
			while (check[row]) {
				int swap = row;
				while (swap < cols - 1) {
					for (int col = 0; col < rows; col++) {
						grid[col][swap] = grid[col][swap + 1];
					}
					check[swap] = check[swap+1];
					swap++;
				}
				for (int i = 0; i < rows; i++) {
					grid[i][cols - 1] = false;
				}
			}
		}
		for (int j = 0; j < rows; j++) {
			for (int i = 0; i < cols; i++) {
				System.out.print(grid[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return this.grid;
	}
}

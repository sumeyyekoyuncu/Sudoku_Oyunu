
public class Sudoku_solver {
    sudokugrid sudoku_grid=new sudokugrid();

    public static void main(String[] args) {
         int[][] grid = {
        { 0, 0, 3, 0, 0, 2, 0, 0, 0},
        {0, 0, 0, 0, 8, 0, 0, 0, 0},
        {0, 0, 7, 6, 0, 0, 5, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {5, 2, 0, 0, 0, 0, 0, 3, 4},
        {4, 0, 0, 0, 0, 0, 0, 0, 8},
        {0, 0, 1, 0, 0, 7, 6, 0, 0},
        {0, 0, 0, 0, 9, 0, 0, 0, 0},
        {0, 0, 0, 4, 0, 0, 7, 0, 0}
        };
         if(sudokugrid.sudokucoz(grid, 9))
         {
             System.out.println("cozumu asagidadir:");
             sudokugrid.grid_yazdir(grid);
         }
    }
}

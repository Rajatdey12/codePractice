package test.leetCode;


/*Given an m x n 2D binary grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume
all four edges of the grid are all surrounded by water.



Example 1:

Input: grid = [
        ["1","1","1","1","0"],
        ["1","1","0","1","0"],
        ["1","1","0","0","0"],
        ["0","0","0","0","0"]
        ]
Output: 1
Example 2:

Input: grid = [
        ["1","1","0","0","0"],
        ["1","1","0","0","0"],
        ["0","0","1","0","0"],
        ["0","0","0","1","1"]
        ]
Output: 3*/
public class Leet200 {

    static int row = 0, col = 0;
    public static int numIslands(char[][] grid) {

        row = grid.length;
        col = grid[0].length;
        int iLandCnt = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    lookup(grid, i, j);
                    iLandCnt++;
                }
            }
        }
        System.out.println(iLandCnt);
        return iLandCnt;
    }

    private static void lookup(char[][] grid, int i, int j) {
        if (i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '2';

        lookup(grid, i, j - 1);
        lookup(grid, i - 1, j);
        lookup(grid, i, j + 1);
        lookup(grid, i + 1, j);
    }

    public static void main(String[] args) {
        numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        });
    }
}

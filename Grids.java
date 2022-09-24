public class Grids {
    public static void main(String[] args) {
        int[][] grid = new int[13][13];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = i * j;
            }
        }
        int a = 3, b = 4;
        System.out.printf("%d times %d equals %d \n\n", a, b, grid[a][b]);
        int[][] magicSquare = {
                { 16, 3, 2, 13 },
                { 5, 10, 11, 8 },
                { 9, 6, 7, 12 },
                { 4, 15, 14, 1 }
        };
        for (int[] row : magicSquare) {
            for (int element : row) {
                System.out.printf("%4d ", element);
            }
            System.out.println();
        }
    }
}

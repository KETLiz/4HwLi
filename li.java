public class li {
    public static void main(String[] args) {
        int[][] labirint = new int [10][10];
        labirint[3][0] = -1;
        labirint[5][4] = -1;
        int x =4;
        int y = 4;
        labirint[x][y] = 0;

        while(labirint[9][9] == 0) {
            for(int i = 1; i < 5; i++) {
                switch(i) {
                    case 1:
                    if (labirint[x-1][y] == 0) {
                        labirint[x-1][y] = labirint[x][y] + 1;
                    }
                    break;
                    case 2:
                    if (labirint[x][y-1] == 0) {
                        labirint[x][y-1] = labirint[x][y] + 1;
                    }
                    break;
                    case 3:
                    if (labirint[x+1][y] == 0) {
                        labirint[x+1][y] = labirint[x][y] + 1;
                    }
                    break;
                    case 4:
                    if (labirint[x][y+1] == 0) {
                        labirint[x][y+1] = labirint[x][y] + 1;
                    }
                    break;
                }
            }
        }
        for (int i = 0; i < labirint.length; i++) {
            for (int j = 0; j < labirint[0].length; j++) {
                System.out.println(labirint[i][j] + " ");
            }
            System.out.println();
        }
    }
}
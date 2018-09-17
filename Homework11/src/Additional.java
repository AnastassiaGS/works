import java.util.Random;

public class Additional {

    public static void main(String[] args) {

        char[][] mas2d = {{'h', 'e', 'l', 'l'}, {'o', ',', 'm', 'y'}, {'d', 'a', 'r', 'l'}, {'i', 'n', 'g', '.'}};


        for (int n = 0; n < mas2d.length; n++) {
            for (int m = 0; m < mas2d.length; m++)
                System.out.print(mas2d[n][m] + " ");
            System.out.println();
        }
        System.out.println();


        for (int n = mas2d.length - 1; n >= 0; n--) {
            for (int m = mas2d[n].length - 1; m >= 0; m--)
                System.out.print(mas2d[n][m] + " ");
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < mas2d.length; i++) {
            for (int j = 0; j < mas2d[j].length; j++) {
                char temp = mas2d[i][j];
                mas2d[i][j] = mas2d[mas2d[i].length - i - 1][j];
                mas2d[mas2d[i].length - i - 1][j] = temp;
                i++;

                System.out.print(mas2d[i][j] + " ");
                System.out.println();
            }
        }
        System.out.println();

        for (int k = 0; k < mas2d.length; k++) {
            for (int p = 0; p < mas2d[p].length; p++) {
                char temp1 = mas2d[k][p];
                mas2d[k][p] = mas2d[k][p + 1];
                mas2d[k][p + 1] = temp1;
                p = p + 2;
                System.out.print(mas2d[k][p] + " ");
                System.out.println();
            }
        }
        System.out.println();

        int s = 1;
        char t = Integer.toString(s).charAt(0);
        for (int n = 0; n < mas2d.length; n++) {
            for (int m = 0; m < mas2d[m].length; m++) {
                for (int y = 0; y < m; y++) {
                    mas2d[0][y] = t;
                    t++;
                }
                for (int x = 1; x < n; x++) {
                    mas2d[x][m - 1] = t;
                    t++;
                }
                for (int y = m - 2; y >= 0; y--) {
                    mas2d[n - 1][y] = t;
                    t++;
                }
                for (int x = n - 2; x > 0; x--) {
                    mas2d[x][0] = t;
                    t++;
                }

                int c = 1;
                int d = 1;



                }


            }
        }
    }


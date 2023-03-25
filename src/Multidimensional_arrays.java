public class Multidimensional_arrays {
    public static void main(String[] args) {
        /*int[] numbers = {1,2,3};
        int[][] matrice = {{1,2,3,4,5},
                           {4},
                           {7,8}};
        System.out.println(matrice[0][4]);

        String[][] strings = new String[2][3];
        strings[1][2] = "Привет";
        System.out.println(strings [0][1]);
        System.out.println(strings [1][2]);*/

        int[][] matrice = {{1,2,3,10,15,20},
                           {4,5,6,11},
                           {7,8,9,12,13,14,16,17,18,19}};

        for (int i=0; i < matrice.length; i++){
            for (int j=0; j < matrice[i].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();

        }

    }
}

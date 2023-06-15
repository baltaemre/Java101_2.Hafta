public class BLetter {
    public static void main(String[] args) {
        String[][] letter = new String[5][3];

        for (int i = 0; i < letter.length ; i++) {
            for (int j = 0; j < letter[0].length; j++) {
                if (i % 2 == 0)
                    letter[i][j] = "* ";
               else if (j % 2 == 0)
                    letter[i][j] = "* ";
               else
                   letter[i][j] = "  ";
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
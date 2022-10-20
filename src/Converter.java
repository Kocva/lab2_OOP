public class Converter {
    public int size;
    public int one_size;
    public int[] one_matrix;

    //Конструктор без аргументов
    public Converter() {
        size = 3;
        one_size = 8;
        one_matrix = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

    }
    //Конструктор с аргументами
    public Converter(int size_Constr, int one_size_Constr, int[] one_matrix_Constr) {
        size = size_Constr;
        one_size = one_size_Constr;
        one_matrix = one_matrix_Constr;
    }
    //Конструктор копирования
    public Converter (Converter converter) {
        this.size = converter.size;
        this.one_size = converter.one_size;
        this.one_matrix = converter.one_matrix;
    }

    private int line = 0;
    private int column = 0;
    private int x = 1;
    private int y = 0;
    private int dirChanges = 0;

    //метод
    void convertMatrix () {
        int counter = size;
        int[][] matrix = new int[size][size];
        if (size > 0) {
            for (int i = 0; i < size * size; i++) {
                if (i < one_size) {
                    matrix[line][column] = one_matrix[i];
                }
                else {
                    matrix[line][column] = 0;
                }
                if (--counter == 0) {
                    counter = size * (dirChanges % 2) +
                            size * ((dirChanges + 1) % 2) -
                            (dirChanges / 2 - 1) - 2;
                    int temp = x;
                    x = -y;
                    y = temp;
                    dirChanges++;
                }
                column += x;
                line += y;
            }
        }
        else {
            System.out.println("Размер матрицы не может быть <= 0!");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }

    }


}

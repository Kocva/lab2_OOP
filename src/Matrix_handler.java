import java.security.PublicKey;

 public class Matrix_handler {
    public int line;
    public int column;
    private int sum = 0;
    private int count = 0;
    private int[][] matrix;
    private String Str = "";
    private int j = 0;

     //Конструктор без аргументов
    public Matrix_handler () {
     line = 3;
     column = 3;
     matrix = new int[][] { {1, -2, 3}, {4, 5, -6}, {-7, 8, 9} };
    }
     //Конструктор с аргументами
    public Matrix_handler (int line_constr, int column_constr, int[][] matrix_constr) {
        line = line_constr;
        column = column_constr;
        matrix = matrix_constr;
    }
    //Конструктор копирования
     public Matrix_handler (Matrix_handler matrix_handler) {
        this.line = matrix_handler.line;
        this.column = matrix_handler.column;
        this.matrix = matrix_handler.matrix;
     }
     //метод 1
    void find_average () {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] < 0) {
                    sum += matrix[i][j];
                    count++;

                }
            }
        }
        int result = sum/count;
        System.out.println("Среднее арифметическое отрицательных чисел = " + result);
    }
     //метод 2
    void find_diagonal () {
        int size = line;
        for (int i = size-1; i >= 0; i--) {

            Str += String.valueOf(matrix[i][j]);
            Str += " ";
            j++;

        }

        System.out.println(Str);
    }

 }

public class Main {
    public static void main(String[] args) {
        System.out.println("Класс 1");
        System.out.println("конструктор 1");
        Converter converter1 = new Converter();
        converter1.convertMatrix();

        System.out.println("конструктор 2");
        int [] matrix = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        Converter converter2 = new Converter(3, 8, matrix);
        converter2.convertMatrix();
        System.out.println("конструктор 3");
        Converter converter3 = new Converter(converter2);
        converter3.convertMatrix();

        System.out.println("Класс 2");
        System.out.println("конструктор 1");
        Finder finder1 = new Finder();
        finder1.FindNumber();
        System.out.println("конструктор 2");
        String Str = "1 2 2 3 4 5 6 5 5 7 8";
        Finder finder2 = new Finder(Str);
        finder1.FindNumber();
        System.out.println("конструктор 3");
        Finder finder3 = new Finder(finder2);
        finder3.FindNumber();

        System.out.println("Класс 3");
        System.out.println("конструктор 1");
        Matrix_handler matrix_handler1 = new Matrix_handler();
        System.out.println("Нахождение среднего 1");
        matrix_handler1.find_average();
        System.out.println("Нахождение диагонали 1");
        matrix_handler1.find_diagonal();
        System.out.println("конструктор 2");
        System.out.println("Нахождение среднего 2");
        int[][] matrix2 = new int[][] { {1, -2, 3}, {4, 5, -6}, {-7, 8, 9} };
        Matrix_handler matrix_handler2 = new Matrix_handler(3, 3, matrix2);
        matrix_handler2.find_average();
        System.out.println("Нахождение диагонали 2");
        matrix_handler2.find_diagonal();
        System.out.println("конструктор 3");
        Matrix_handler matrix_handler3 = new Matrix_handler(matrix_handler2);
        System.out.println("Нахождение среднего 3");
        matrix_handler3.find_average();
        System.out.println("Нахождение диагонали 3");
        matrix_handler3.find_diagonal();
    }
}
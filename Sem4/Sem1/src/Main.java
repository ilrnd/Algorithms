//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
  //Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве
// заданное значение и возвращает его индекс. При этом, например:
//        если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        если вместо массива пришел null, метод вернет -3
//        придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
//        Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число
//        у пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю.
//        Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.


public class Main {
    public static int checkLength(int [] array, int min){
        if (array.length < min)
        {
            return -1;
        }
        return array.length;
    }

    public static int checkArray(int [] array, int min, int value){

        if (array == null)
            return -3;

        if (array.length < min)
            return -1;

        for (int i = 0; i < array.length; i++){
            if (array[i] == value)
                return i;
        }
        return -2;
    }

    public static void userMessage(int value, int [] array, int min){
        int bug = checkArray(array, min, value);
        if (bug == -2) {
            System.out.println("Element was not found");
            return;
        }
        if (bug == -1) {
            System.out.println("Length is incorrect");
            return;
        }
        if (bug == -3) {
            System.out.println("Array is NULL");
            return;
        }
        System.out.println("Index of element " + value + " = " + bug);
    }

    public void run() {
        int[][] array = new int[][]{
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 2}
        };
        System.out.println(this.sum2DArr(array));
    }

    public int sum2DArr(int[][] numArray) {
        int sum = 0;
        if (numArray.length == 0) {
            throw new RuntimeException("Двумерный массив пустой!");
        }
        if (numArray[0].length != numArray.length) {
            throw new RuntimeException("Двумерный массив не квадратный!");
        }
        for (int[] line: numArray) {
            for (int i = 0; i < numArray.length; i++) {
                if (line[i] != 0 && line[i] != 1) {
                    throw new RuntimeException("В массиве содержится число кроме 0, 1!");
                }
                sum += line[i];
            }
        }
        return sum;
    }

    public int sum2DArr2(int[][] numArray) {
        int sum = 0;
        if (numArray.length == 0) {
            return -1;//throw new RuntimeException("Двумерный массив пустой!");
        }
        if (numArray[0].length != numArray.length) {
            return -2;//throw new RuntimeException("Двумерный массив не квадратный!");
        }
        for (int[] line: numArray) {
            for (int i = 0; i < numArray.length; i++) {
                if (line[i] != 0 && line[i] != 1) {
                    return -3;//throw new RuntimeException("В массиве содержится число кроме 0, 1!");
                }
                sum += line[i];
            }
        }
        return sum;
    }

//    Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
//    Метод должен пройтись по каждому элементу и проверить что он не равен null.
//    А теперь реализуйте следующую логику:
//    Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//    Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

    public static void checkArr2(Integer[] arr){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                result.append(i);
                result.append(" ");
            }
        }
        if (!result.isEmpty())
            throw new RuntimeException("Null is detected on positions " + result);

    }



    public static void main(String[] args) {
//       int [] array = {1, 2, 3,4, 5};
//        int [] array = null;
//       int min = 6;
//       System.out.println(checkLength(array, min));
//        System.out.println(checkArray(array, min, 10));
//        userMessage(2, array, 6);
//        Main program = new Main();
//        program.run();

        Integer [] arr = new Integer[] {1, null, 3, null};
        checkArr2(arr);
    }
}
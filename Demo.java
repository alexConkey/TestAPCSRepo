import java.util.Random;

public class Demo {
    static void printLoop(int n) {
      for (int i = 1; i <= n; i++){
        for(int j = 1; j <= n + 1 - i; j++){
          System.out.print(i);

        }
      System.out.println();
      }
    }
    public static String arrToString(int[] arr){
      String str = "{";
      for (int i = 0; i < arr.length; i++){
        str += (Integer.toString(arr[i]));
        if(i != arr.length - 1){
          str += ", ";
        }
      }
      str += "}";
      return str;
    }

    public static String arrayDeepToString(int[][] arr){
      String[] newArr = new String[arr.length];
      for (int i = 0; i < arr.length; i++){
        newArr[i] = arrToString(arr[i]);
      }
      String str = "{";
      for (int i = 0; i < newArr.length; i++){
        str += (newArr[i]);
        if(i != newArr.length - 1){
          str += ", ";
        }
      }
      str += "}";
      return str;
    }


    public static int[][] create2DArray(int rows, int cols, int maxValue){
      int[][] arr = new int[rows][cols];
      for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols; j++){
          arr[i][j] = new Random().nextInt(maxValue + 1);
        }
      }
      return arr;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
      int[][] arr = new int[rows][];
      for (int i = 0; i < rows; i++){
        arr[i] = new int[new Random().nextInt(cols + 1)];
        for (int j = 0; j < arr[i].length; j++){
          arr[i][j] = new Random().nextInt(maxValue + 1);
        }
      }
      return arr;
    }

    public static void main(String[] args) {
      int[][] myNum = {{10, 20, 30, 40}, {1}};
      System.out.println(arrayDeepToString(myNum));
      System.out.println(arrayDeepToString(create2DArrayRandomized(4, 7, 5)));
    }
}

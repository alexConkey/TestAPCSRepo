
public class Demo {
    static void printLoop(int n) {
      for (int i = 1; i <= n; i++){
        for(int j = 1; j <= n + 1 - i; j++){
          System.out.print(i);

        }
      System.out.println();
      }
    }
    public static void main(String[] args) {
      printLoop(Integer.parseInt(args[0]));
    }
}

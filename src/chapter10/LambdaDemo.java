package chapter10;

public class LambdaDemo {
  public static void main(String[] args) {
//    Object o = new Object() {
//      int max(int i, int j) {
//        return i > j ? i : j;
//      }
//    };
//    o.max(1,2);
    MyFunction f = new MyFunction() {
      @Override
      public int max(int i, int j) {
        return i > j? i : j;
      }
    };
    int res = f.max(1,2);
    System.out.println(res);

    MyFunction f1 = (a,b) -> a > b ? a : b ;
    int res1 = f1.max(10,20);
    System.out.println(res1);
  }
}

@FunctionalInterface
interface MyFunction{
  public abstract int max(int i, int j);
}

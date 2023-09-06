import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      String str = "abcdefghijklmnopqrstuvwxyz";
      StringReverser reverser = new StringReverser();
      var result = reverser.reverse(str);
      System.out.println(result);

        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<=n;i++){
          System.out.println("*\n");
        }


//      var list = new Linkedlist();
//      list.addLast(20);
//      list.addLast(3);
//      list.addLast(40);
//      list.addFirst(30);
//      list.addLast(22);
//      list.removeFirst();
//
//
//        System.out.println(list.indexOf(30));
//        System.out.println(list.contains(20));
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
    }

}
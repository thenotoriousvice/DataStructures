import java.util.Scanner;

public class Array2DSol {

    public class Solution{
        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] Args){
            int arr[][] = new int[6][6];
            for(int i=0;i<6;i++){
                String[] arrRowItems = sc.nextLine().split(" ");
                sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                for (int j=0;j<6;j++){
                    int arrItem=Integer.parseInt(arrRowItems[j]);
                    arr[i][j]=arrItem;
                }
            }

            /*
             1 1 1 0 0 0
             0 1 0 0 0 0
             1 1 1 0 0 0
             0 0 0 0 0 0
             0 0 0 0 0 0
             0 0 0 0 0 0
             */
            int maxSum=Integer.MIN_VALUE;
            for(int i=0 ; i<=3;i++){
                for(int j=0;j<=3;j++){
                    int currentSum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                                             arr[i+1][j+1]+
                                   arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    if(currentSum>maxSum)
                        maxSum=currentSum;
                }
            }
            System.out.println(maxSum);
        }
    }
}

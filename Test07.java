/**
 * 输入不小于 10 个数，再将这些数按从小到大的顺序输出。
 */
import java.util.*;
 public class Test07 {
    public static void main(String [] args) {
        try (Scanner read = new Scanner(System.in)) {
            int n;
            System.out.println("请输入数组元素个数："); 
            n = read.nextInt();  
            int [] arr=new int[n];
            System.out.println("*********请输入不小于10个数:***********");
            System.out.println("*********数字用空格隔开，回车确认。**********");
            try (Scanner n1 = new Scanner(System.in)) {
                for(int k=0;k<arr.length;k++){
                    arr[k]=n1.nextInt();
                }
            }
                for(int i=0;i<arr.length-1;i++){
                    for(int j=0;j<arr.length-1-i;j++){
                        if(arr[j]>arr[j+1]){
                            int t=0;
                            t=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=t;
                        }
                    }
                }
                for(int i =0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
        }
    }
}
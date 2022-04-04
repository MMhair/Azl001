/**
 * 用循环语句计算 1 + 1/2+ 1/3+ 1/4…的前 20 项之和
 */

public class Test05 {
    public static void main(String[] args) {
    double sum =0,a=1;
    for(int i=1;i<=20;i++){
        a=1.0/i;
        double number = 1;
        number*=a;
        sum=sum+number;
    }
    System.out.println("sum="+sum);
}
}


/**
 *用循环语句计算 1 + 1/2！+ 1/3！+ 1/4！…的前 20 项之和
 */
public class Test06 {
    public static void main(String [] args) {
        double sum =0;
        for(int i=1;i<=20;i++){
            double num=1;
            num=num*(1.0/i);
            sum=sum+num;
        }
        System.out.println("sum="+sum);
    }
}

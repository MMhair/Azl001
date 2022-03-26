/**
 * 测试递归
 */
public class Test04 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //当前时刻
        long result = factorial(1);
        long endTime = System.currentTimeMillis(); //当前时刻
        System.out.println(result);
        System.out.println("递归耗时："+(endTime-startTime));
    }
    //阶乘5!
    public static long factorial(long n) {
        if(n==5){
            return 5;
        }else{
            return n*factorial(n+1);
        }
    }

}
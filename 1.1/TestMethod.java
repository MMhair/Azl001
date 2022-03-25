/**
*测试方法的定义和调用
*/
public class TestMethod {
    public static void main(String[] args) {
        sayLoveU();
        sayLoveU();
        sayLoveU();
        add(10,20,30);

    }
    public static void sayLoveU(){
        System.out.println("I lOVE U!");
        System.out.println("520!");

    }
    public static int add(int a,int b,int c){
        int sum = a+b+c;
        System.out.println("sum = "+sum);
        return sum;
    }

}

/**
 * 设计程序实现输入日期及机票张数，计算出应付金额。假设北京至上海的机票全价为 1200
元/张，以 2017 年为例进行程序编写，所有的法定假日，机票无折扣；除法定假日之外
的周末，机票价格为 8 折；除法定假日及周末之外的工作日，机票价格为 6 折。（提示：
只需考虑月份及日期） 

 */

import java.util.Scanner;
import java.lang.System; 
class money{
    public static void main(String[] args){
        float a=(float) 0.6,b=(float) 0.8;
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("请输入要购得的机票数");
            int x = reader.nextInt();
            System.out.println("请输入日期(日数不足10请补0，如5月3日请输入503）");
            int h = reader.nextInt();
            if(judge.holiday(h)) System.out.println("需要的花费是："+x*1200);
            else {
                switch (judge.weekday(h)){
                    case 0:System.out.println("需要的花费是："+x*b*1200);break;
                    case 1:System.out.println("需要的花费是："+x*a*1200);break;
                    case 2:System.out.println("需要的花费是："+x*a*1200);break;
                    case 3:System.out.println("需要的花费是："+x*a*1200);break;
                    case 4:System.out.println("需要的花费是："+x*a*1200);break;
                    case 5:System.out.println("需要的花费是："+x*a*1200);break;
                    case 6:System.out.println("需要的花费是："+x*b*1200);break;            
                }
            }
        }
    }   
    public class judge{
        public static boolean holiday(int x){
            int[] hoday = {101,128,129,130,404,501,530,1001,1002,1002,1004};
            for(int i=0;i<11;i++)if(hoday[i]==x)return true;
            return false;
        }
        public static int weekday(int x){
            int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
            int a = x/100;
            int b = x%100;
            int c = 7;
            int d = 0;
            for(int j=0;j<a-1;j++)d=d+month[j]; 
            int days = d+b;     
            for(int i=0;i<days-1;i++)c++;
            return c%7;
        }
    }
}

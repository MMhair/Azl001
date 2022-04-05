import java.util.*;

/**
 * 设计程序实现输入日期及机票张数，计算出应付金额。假设北京至上海的机票全价为 1200
元/张，以 2017 年为例进行程序编写，所有的法定假日，机票无折扣；除法定假日之外
的周末，机票价格为 8 折；除法定假日及周末之外的工作日，机票价格为 6 折。（提示：
只需考虑月份及日期）
 */
public class Test08 {
    public static void main(String[] args) {
        String year = "2016";
        Calendar c= Calendar.getInstance();
        c.set(Integer.parseInt(year),0,1);
        Calendar c2= Calendar.getInstance();
        c2.set(Integer.parseInt(year)+1,0,1);
        int count = 0;
        while(c.compareTo(c2)<0){
            if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY||c.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
                System.out.println(c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH+1))+"-"+c.get(Calendar.DAY_OF_MONTH));
                count++;
            }
            c.add(Calendar.DATE,1);
        }
        System.out.println("共"+count+"条记录");
    }
}

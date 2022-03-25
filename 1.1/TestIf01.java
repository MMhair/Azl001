/**
 * 掷色子游戏
 * 1.如果三次的值大于15，手气不错
 *2.果三次的值在10-15之间，一般
 * 3.小于10，次
 */
public class TestIf01 {
    public static void main(String[] args) {
        int i = (int)(Math.random()*6+1);
        int j = (int)(Math.random()*6+1);
        int k = (int)(Math.random()*6+1);

        int count = i+j+k;
        System.out.println("第一次得分："+i);
        System.out.println("第二次得分："+j);
        System.out.println("第三次得分："+k);


        
        if(count>=15){
        System.out.println("nb!");
        }else if(count>=10&&count<15){
        System.out.println("good!");
        }else{
        System.out.println("svb!");
        }
        System.out.println("得分："+count);

    
    }
}
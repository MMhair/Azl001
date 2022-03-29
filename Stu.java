/**
 * 构建对象
 */
public class Stu {
    int id;
    int age;
    String name;
    public void study() {
        System.out.println("学习");
    }
    public void PlayFootball() {
        System.out.println("踢足球");
    }
    public static void main(String[] args) {
        Stu s1 = new Stu();
        System.out.println(s1.id);
        System.out.println(s1.name);
        s1.id=1001;
        s1.name="AZL";
        System.out.println(s1.id);
        System.out.println(s1.name);

        s1.PlayFootball();
        s1.study();
    }
}
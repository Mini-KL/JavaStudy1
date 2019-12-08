import java.util.Scanner;

public class Switchtest
{
    public static void main(String[] args) {
        /*int score = 20;
        switch(score){
            case 10:
                System.out.println("111");
                break;
            case 30:
                System.out.println("222");
                break;
            default:
                System.out.println("333");
                break;
        }*/

        Scanner scanner = new Scanner(System.in);
        String flag = "y";
        while (flag.equals("y")) {
            System.out.println("请输入学生信息：");
            int stu = scanner.nextInt();
            switch (stu){
                case 0:
                    System.out.println("123");
                    break;
                case 1:
                    System.out.println("456");
                    break;
                default:
                    System.out.println("学号不正确");
                    break;
            }
            System.out.println("是否继续？y/n");
            flag = scanner.next();
        }
    }
}

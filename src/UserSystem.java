import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UserSystem {
    static int num = 0;
    static Scanner scanner= new Scanner(System.in);
    static String[] name = {"小红","库里","小明",null};
    static int[] age = {12,15,18,0};
    static String[] state = {"正常","正常","正常",null};

    public static void main(String[] args) {
        String nameAdd,stateAdd;
        int ageAdd;


        do{
            switch(num){
                case 0:
                    showMenu();
                    break;
                case 1:
                    System.out.println("---------用户查找----------");
                    showUser();
                    System.out.println("输入0回主菜单");
                    num = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("---------用户添加----------");
                    System.out.println("请输入用户名：");
                    nameAdd = scanner.next();
                    System.out.println("请输入年龄：");
                    ageAdd = scanner.nextInt();
                    addUser(nameAdd,ageAdd);
                    System.out.println("输入0回主菜单");
                    num = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("---------用户删除----------");
                    System.out.println("输入用户名");
                    String delName = scanner.next();
                    delUser(delName);
                    System.out.println("输入0回主菜单");
                    num = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("---------用户冻结----------");
                    System.out.println("输入用户名");
                    String coldName = scanner.next();
                    int index = indexFind(coldName,name);
                    if(index!=-1 && (state[index] != "冻结")){
                        state[index] = "冻结";
                    }
                    else if(index == -1){
                        System.out.println("用户不存在");
                    }
                    else if(index!=-1 && (state[index] == "冻结")){
                        System.out.println("用户已冻结，勿重复操作");
                    }
                    System.out.println("输入0回主菜单");
                    num = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("---------用户解冻----------");
                    System.out.println("输入用户名");
                    String ucoldName = scanner.next();
                    int index2 = indexFind(ucoldName,name);
                    if(index2!=-1 && (state[index2] != "正常")){
                        state[index2] = "正常";
                    }else if(index2 == -1){
                        System.out.println("用户不存在");
                    }
                    else if(index2!=-1 && (state[index2] == "正常")){
                        System.out.println("用户解冻，勿重复操作");
                    }

                    System.out.println("输入0回主菜单");
                    num = scanner.nextInt();
                    break;

                default:
                    System.out.println("请输入正确的选择");
                    System.out.println("输入0回主菜单");
                    num = scanner.nextInt();
                    break;
            }

        }while(num != 6);
        System.out.println("系统退出");
    }

    static void showMenu(){
        System.out.println("---------用户管理系统---------");
        System.out.println("1.查找用户");
        System.out.println("2.添加用户");
        System.out.println("3.删除用户");
        System.out.println("4.冻结用户");
        System.out.println("5.解冻用户");
        System.out.println("请输入你的选择");
        num = scanner.nextInt();
    }
    static void showUser(){
        System.out.println("姓名\t\t"+"年龄\t\t"+"状态\t\t");
        for(int i = 0;i<name.length;i++){
            System.out.println(name[i]+"\t\t"+age[i]+"\t\t"+state[i]);
        }
    }

    static void addUser(String nameAdd,int ageAdd){
        int index = indexFind(nameAdd,name);
        if(index == -1){
            name = Arrays.copyOf(name,name.length+1);
            name[name.length-1] = nameAdd;
            age = Arrays.copyOf(age,name.length+1);
            age[name.length-1] = ageAdd;
            state = Arrays.copyOf(state,name.length+1);
            state[name.length-1] = "正常";
        }else{
            name[index] = nameAdd;
            age[index] = ageAdd;
            state[index] = "正常";
        }
    }

    static void delUser(String delName){
        int index = indexFind(delName,name);
        if(index !=-1){
            for(int i = index;i<name.length-1;i++){
                name[i] = name[i+1];
                age[i] = age[i+1];
                state[i] = state[i+1];
            }
        }else
        {
            System.out.println("用户不存在");
        }
    }

    static int indexFind(String value,String[] arry){
        for(int i = 0;i<arry.length;i++){
           if(value.equals(arry[i])){
                    return i;
                }
        }
        return -1;
    }
}


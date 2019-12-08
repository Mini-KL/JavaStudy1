public class Xunhuan {
    public static void main(String[] args) {
        int num =0 ;
        for(int i =0; i<=10;i++){
            if(num%2!=0){
                System.out.println(num);
            }
            num++;
        }

        while(num<=10){
            if(num%2!=0){
                System.out.println(num);
            }
        }

        do{
            if(num%2!=0){
                System.out.println(num);
            }
        }while (num<=10);
    }
}

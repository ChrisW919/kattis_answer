import java.util.Scanner;
import java.lang.Math;

public class almostperfect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int resultnum=1;
            int temp = sc.nextInt();
            int check = (int)Math.floor(Math.sqrt(temp));
            for(int i=2;i<=check;i++){
                if(temp%i==0){
                    if(i!=temp/i){
                        resultnum = resultnum+i+temp/i;
                    }else{
                        resultnum = resultnum+i;
                    }
                }
            }
            if(resultnum == temp){
                System.out.println(temp+" perfect");
            }else if(temp+2>=resultnum&&temp-2<=resultnum){
                System.out.println(temp+" almost perfect");
            }else{
                System.out.println(temp+" not perfect");
            }
        }
    }
}
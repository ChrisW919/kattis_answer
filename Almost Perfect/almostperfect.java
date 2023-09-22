import java.util.Scanner;

public class almostperfect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int resultnum=1;
            int temp = sc.nextInt();
            int check=0;
            for(int j=1;j<temp;j++){
                if(j*j>temp){
                    check = j-1;
                    break;
                }
            }
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
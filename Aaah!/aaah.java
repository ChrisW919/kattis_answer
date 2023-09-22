import java.util.Scanner;

class aaah{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String temp2 = sc.nextLine();
        if(temp.length()>=temp2.length()){
            System.out.print("go");
        }else{
            System.out.print("no");
        }
    }
    
}
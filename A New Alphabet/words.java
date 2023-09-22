import java.util.Scanner;
import java.lang.String;

public class words {
    public static void main(String[] args) {

        String [] alpha = {"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\/[]","[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{","`/","2"};
        
        Scanner Moj= new Scanner(System.in);
        
        String input= Moj.nextLine();
        
        input = input.toLowerCase();
        
        String temp ="";
        
        for(int i = 0; i < input.length() ; i++){
        	char a = input.charAt(i);
        	int b = (int) a - 97;
        	if (b >=0 && b<26){
        		temp += alpha[b];
                }else{
        		temp += a;
        	}
        }
        System.out.print(temp);
    }
    
}

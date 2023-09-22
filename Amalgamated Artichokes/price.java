import java.util.*;
import java.util.Scanner;

public class price{
    private int input1;
    private int input2;
    private int input3;
    private int input4;
    private int input5;
    private int input6;
    private List<Double> Alist = new ArrayList<> ();
    
    public void setdata(String Adata){
        int ptr2 = Adata.indexOf(" ");
        int ptr1 = ptr2;
        
        input1 = Integer.parseInt(Adata.substring(0,ptr2));
        ptr2 = Adata.indexOf(" ", ++ptr2);
        input2 = Integer.parseInt(Adata.substring(++ptr1,ptr2));
        ptr1 = ptr2;
        ptr2 = Adata.indexOf(" ", ++ptr2);
        input3 = Integer.parseInt(Adata.substring(++ptr1,ptr2));
        ptr1 = ptr2;
        ptr2 = Adata.indexOf(" ", ++ptr2);
        input4 = Integer.parseInt(Adata.substring(++ptr1,ptr2));
        ptr1 = ptr2;
        ptr2 = Adata.indexOf(" ", ++ptr2);
        input5 = Integer.parseInt(Adata.substring(++ptr1,ptr2));
        ptr1 = ptr2;
        ptr2 = Adata.indexOf(" ", ++ptr2);
        input6 = Integer.parseInt(Adata.substring(++ptr1,Adata.length()));
        
        price.this.calculation();
        
        }
    
    public void calculation(){
        for(int i = 1;i <= input6 ; i++){
            double temp = input1 *(Math.sin(input2*i + input3) + Math.cos(input4*i + input5)+2);
            Alist.add(temp);
        }
    }
    
public double findDiff(){
        double diff = 0;
        double max = Alist.get(0);
        double min = 4*input1;
        for(int i = 1;i < input6 ; i++){
            
            if(Alist.get(i) > max){
                    max = Alist.get(i);
                    min = 4*input1;
                    continue;
            }
            min = Alist.get(i);
            
            if((max - min)>diff){
                diff = max - min;
            }
        }
        return diff;
}
    
        public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
    
        price Aprice = new price();
    
        String AB = scan.nextLine();
    
        Aprice.setdata(AB);
        
        System.out.print(Aprice.findDiff());
    
        }
}
        

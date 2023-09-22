import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trip {
    private List<Double> Alist = new ArrayList<> ();
    private int num ;
    
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            double sum = 0;
            int input = scan.nextInt();
            
            if(input == 0){break;}
            
            for(int i = 0 ;i<input ;i++){
                double anum = scan.nextDouble();
                Alist.add(anum);
                sum += anum;
            }
        
            double avg = (Math.round(sum/Alist.size()*100)+0.00)/100;
            double sum2 = 0;
            
            
            if (avg != Math.ceil(sum/Alist.size()*100)/100)
            for(double i:Alist){
                if(i<avg)
                    sum2 += avg-i;
            }else{
            for(double i:Alist)
                if(i>avg)
                    sum2 += i-avg;
            }
            
            System.out.println("$"+String.format("%.2f", sum2));

            Alist.clear();
        }
    }
            
    public static void main(String[] args) {
        Trip Atrip =new Trip();
        Scanner scan = new Scanner(System.in);
        Atrip.getInput();
    }
    
}

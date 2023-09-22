#include <iostream>
using namespace std;

int main(){
    string input;
    int ww,sum=0;
    int h,w,n;
    
    bool perf=true;
    
    cin>> h >> w >>n;
    
    
    for(int i = 0; i<n ; i++){
        cin >> ww;
        sum += ww;
        
        if(h == 0){
            perf = false;
            break;}
        
        if(sum < w){}
        else if(sum == w){
            sum = 0;
        }
        else{
            perf = false;
            break;
            }
    }
    cout<< ((perf)?"Yes":"No");
     
}
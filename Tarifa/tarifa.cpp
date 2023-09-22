#include <iostream>
using namespace std;
int main(){
    int a,b,c,count=0,sum=0;
    
    std::ios::sync_with_stdio(false);
    std::cin >> a;
    std::cin >> b;
    
    for(int i= 0;i<b;i++){
        std::ios::sync_with_stdio(false);
        std::cin>>c;
        sum+=c;
    }
    
    std::ios::sync_with_stdio(false);
    std::cout<<(b+1)*a-sum;
}
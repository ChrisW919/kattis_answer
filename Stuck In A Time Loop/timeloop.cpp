#include <iostream>
using namespace std;

int main(){
    int a;
    std::ios::sync_with_stdio(false);
    std::cin>>a;
    
    for(int i=1;i<=a;i++){
        std::ios::sync_with_stdio(false);
        std::cout<<i<<" Abracadabra"<<endl;
    }
    
}
#include <iostream> 
using  namespace std;

int main(){
    int a,b,c;
    std::ios::sync_with_stdio(false);
    std::cin >> a;
    
    for(int i =0; i<a;i++){
            int sum = 0;
            std::ios::sync_with_stdio(false);
            std::cin >> b;
            for(int j =0; j<b;j++){
                std::ios::sync_with_stdio(false);
                std::cin >> c;
                sum += c;
            }
            std::ios::sync_with_stdio(false);
            std::cout<<sum-b+1<<endl;
    }
}
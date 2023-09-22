#include <iostream>
using namespace std;

int main(){
    int a;
    std::ios::sync_with_stdio(false);
    std::cin>>a;
    
    switch(a%2){
    case 0:
        std::ios::sync_with_stdio(false);
        std::cout<<"Bob";
        break;
    case 1:
        std::ios::sync_with_stdio(false);
        std::cout<<"Alice";
    }
}
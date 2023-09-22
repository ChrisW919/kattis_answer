#include <iostream>
#include <regex>
#include <string>

using namespace std;

class text_m {
    string ms;

public:
    text_m(string ms) : ms(ms) {}
    string ntt();
};

string text_m::ntt() {
    regex regex("\\b[1-9]\\d\\b");
    std::smatch match;
    while(std::regex_search(ms, match, regex)) {
        int temp_num = stoi(match.str());
        string temp_text = "";
        if(temp_num / 10 == 1) {
            switch(temp_num % 10) {
                case 0:{
                    temp_text = "ten";
                    break;
                }
                case 1:{
                    temp_text = "eleven";
                    break;
                }
                case 2:{
                    temp_text = "twelve";
                    break;
                }
                case 3:{
                    temp_text = "thirteen";
                    break;
                }
                case 4:{
                    temp_text = "fourteen";
                    break;
                }
                case 5:{
                    temp_text = "fifteen";
                    break;
                }
                case 6:{
                    temp_text = "sixteen";
                    break;
                }
                case 7:{
                    temp_text = "seventeen";
                    break;
                }
                case 8:{
                    temp_text = "eighteen";
                    break;
                }
                case 9:{
                    temp_text = "nineteen";
                    break;
                }
            }
        } else {
            switch(temp_num / 10) {
                case 2:{
                    temp_text.append("twenty-");
                    break;
                }
                case 3:{
                    temp_text = "thirty-";
                    break;
                }
                case 4:{
                    temp_text = "forty-";
                    break;
                }
                case 5:{
                    temp_text = "fifty-";
                    break;
                }
                case 6:{
                    temp_text = "sixty-";
                    break;
                }
                case 7:{
                    temp_text = "seventy-";
                    break;
                }
                case 8:{
                    temp_text = "eighty-";
                    break;
                }
                case 9:{
                    temp_text = "ninety-";
                    break;
                }
            }
            switch(temp_num % 10) {
                case 0:{
                    temp_text.pop_back();
                    break;
                }
                case 1:{
                    temp_text.append("one");
                    break;
                }
                case 2:{
                    temp_text.append("two");
                    break;
                }
                case 3:{
                    temp_text.append("three");
                    break;
                }
                case 4:{
                    temp_text.append("four");
                    break;
                }
                case 5:{
                    temp_text.append("five");
                    break;
                }
                case 6:{
                    temp_text.append("six");
                    break;
                }
                case 7:{
                    temp_text.append("seven");
                    break;
                }
                case 8:{
                    temp_text.append("eight");
                    break;
                }
                case 9:{
                    temp_text.append("nine");
                    break;
                }
            }
        }
        ms.replace(match.position(), match.length(), temp_text);
    }

    std::regex regex2("\\b\\d\\b");
    std::smatch match2;
    while(std::regex_search(ms, match2, regex2)) {
        int temp_num = stoi(match2.str());
        string temp_text = "";
        switch(temp_num) {
            case 0:{
                temp_text = "zero";
                break;
            }
            case 1:{
                temp_text = "one";
                break;
           }
            case 2:{
                temp_text = "two";
                break;
            }
            case 3:{
                temp_text = "three";
                break;
            }
            case 4:{
                temp_text = "four";
                break;
            }
            case 5:{
                temp_text = "five";
                break;
            }
            case 6:{
                temp_text = "six";
                break;
            }
            case 7:{
                temp_text = "seven";
                break;
            }
            case 8:{
                temp_text = "eight";
                break;
            }
            case 9:{
                temp_text = "nine";
                break;
            }
        }
        ms.replace(match2.position(), match2.length(), temp_text);
    }
    return ms;
}

int main() {
    string s;
    while(std::getline(std::cin, s)){
        string res = text_m(s).ntt();
        std::cout << res << std::endl;
    }
    return 0;
}
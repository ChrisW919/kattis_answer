#include <iostream>
#include <string>
#include <map>
#include <stdio.h>
using namespace std;

int main()
{
	int a, b, c, d;
	int def = 0;

	string opcode;

	std::ios::sync_with_stdio(false);
	std::cin >> a;
	std::cin >> b;

	map<int, int> mapNum;

	for (int i = 1; i <= b; i++)
	{
		std::ios::sync_with_stdio(false);
		std::cin >> opcode;
		std::cin >> c;

		if (opcode == "SET")
		{
			std::ios::sync_with_stdio(false);
			std::cin >> d;

			mapNum[c] = d;
		}
		else if (opcode == "PRINT")
		{
			if (mapNum.count(c))
			{
				cout << mapNum[c] << endl;
			}
			else
			{
				cout << def << endl;
			}
		}
		else if (opcode == "RESTART")
		{
			def = c;
			mapNum.clear();
		}
	}
}
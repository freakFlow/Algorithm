#include <iostream>

using namespace std;

int cmd;
int dir = 0;

int main(void)
{
	for (int i = 0; i < 10; i++)
	{
		cin >> cmd;
		dir = (dir + cmd) % 4;
	}

	switch (dir)
	{
	case 0:
		cout << 'N';
		break;
	case 1:
		cout << 'E';
		break;
	case 2:
		cout << 'S';
		break;
	case 3:
		cout << 'W';
		break;
	}

	return 0;
}
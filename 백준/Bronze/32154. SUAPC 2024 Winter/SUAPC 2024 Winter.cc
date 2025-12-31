#include <iostream>

using namespace std;

int N;
int result[10] = { 0b1101011111111, 0b1100111110101, 0b1100111110101, 0b1100011110111, 0b1100011110101,
0b1100011110101, 0b1100011110101, 0b1100011110101, 0b1100011110101, 0b1100011100111 };


int main(void)
{
	cin >> N;
	
	if (N < 2) cout << 11 << endl;
	else if (N < 5) cout << 9 << endl;
	else cout << 8 << endl;

	for (int i = 0; i < 13; i++)
	{
		if (result[N - 1] & (1 << i)) cout << char('A' + i) << ' ';
	}

	return 0;
}
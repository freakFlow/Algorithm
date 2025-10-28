#include <iostream>

using namespace std;

int T;
string a, b;
int hamming;

int main(void)
{
	cin >> T;

	for (int t = 0; t < T; t++)
	{
		hamming = 0;
		cin >> a >> b;
		for (int i = 0; i < a.length(); i++)
		{
			if (a[i] != b[i])
			{
				hamming++;
			}
		}

		cout << "Hamming distance is " << hamming << "." << endl;
	}

	return 0;
}
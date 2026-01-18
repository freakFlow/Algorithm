#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int T;
string str, crypto;
char rule[26];

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> T;
	cin.ignore();

	for (int t = 0; t < T; t++)
	{
		getline(cin, str);
		getline(cin, crypto);

		int idx = 0;
		for (char ch : crypto)
		{
			rule[idx++] = ch;
		}

		for (char ch : str)
		{
			if (ch == ' ') cout << ' ';
			else cout << rule[ch - 'A'];
		}
		cout << endl;
	}
	
	return 0;
}
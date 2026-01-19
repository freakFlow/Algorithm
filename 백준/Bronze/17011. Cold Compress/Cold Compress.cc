#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int N;
string str;
char ch;
int cnt;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N;

	for (int n = 0; n < N; n++)
	{
		cin >> str;

		ch = str.at(0);
		cnt = 1;

		for (int i = 1; i < str.length(); i++)
		{
			if (str.at(i) == ch)
			{
				cnt++;
			}
			else
			{
				cout << cnt << ' ' << ch << ' ';
				ch = str.at(i);
				cnt = 1;
			}
		}

		cout << cnt << ' ' << ch << '\n';
	}
	
	return 0;
}
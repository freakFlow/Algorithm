#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

string str;
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	getline(cin, str);

	for (char ch : str)
	{
		switch (ch)
		{
		case 'A':
		case 'a':
		case 'b':
		case 'D':
		case 'd':
		case 'e':
		case 'g':
		case 'O':
		case 'o':
		case 'P':
		case 'p':
		case 'Q':
		case 'q':
		case 'R':
		case '@':
			ans++;
			break;
		case 'B':
			ans+=2;
			break;
		}
	}

	cout << ans;
	
	return 0;
}
#include <iostream>
#include <string>

using namespace std;

int T, K;
string num;
int ans;

int main(void)
{
	cin >> T;

	for (int t = 0; t < T; t++)
	{
		cin >> K >> num;
		
		cout << K << ' ';

		int base = 1;
		ans = 0;
		for (int i = num.length()-1; i >= 0; i--)
		{
			int digit = num.at(i) - '0';
			if (digit > 7)
			{
				ans = 0;
				break;
			}
			ans += base * digit;
			base *= 8;
		}

		cout << ans << ' ';
		
		base = 1;
		ans = 0;
		for (int i = num.length() - 1; i >= 0; i--)
		{
			int digit = num.at(i) - '0';
			ans += base * digit;
			base *= 10;
		}

		cout << ans << ' ';

		base = 1;
		ans = 0;
		for (int i = num.length() - 1; i >= 0; i--)
		{
			int digit = num.at(i) - '0';
			ans += base * digit;
			base *= 16;
		}

		cout << ans << endl;
	}

	return 0;
}
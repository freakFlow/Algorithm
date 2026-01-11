#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int N, K;
int ans;

int Reverse(int num);

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N >> K;

	for (int k = 1; k <= K; k++)
	{
		int num = Reverse(N * k);
		if (num > ans) ans = num;
	}

	cout << ans;
	
	return 0;
}

int Reverse(int num)
{
	string str = to_string(num);

	int res = 0;
	for (int i = 0; i < str.length(); i++)
	{
		res += (str.at(i) - '0') * pow(10, i);
	}

	return res;
}
#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int N, M;
char arr[50][50];
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N >> M;

	for (int n = 0; n < N; n++)
	{
		for (int m = 0; m < M; m++)
		{
			cin >> arr[n][m];
		}
	}

	char now;
	for (int n = 0; n < N; n++)
	{
		now = '|';
		for (int m = 0; m < M; m++)
		{
			if (arr[n][m] == '-')
			{
				if (now == '|') ans++;
				now = '-';
			}
			else
			{
				now = '|';
			}
		}
	}

	for (int m = 0; m < M; m++)
	{
		now = '-';
		for (int n = 0; n < N; n++)
		{
			if (arr[n][m] == '|')
			{
				if (now == '-') ans++;
				now = '|';
			}
			else
			{
				now = '-';
			}
		}
	}

	cout << ans;
	
	return 0;
}
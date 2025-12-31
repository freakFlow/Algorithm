#include <iostream>

using namespace std;

int N;
char mirror[100][100];
char answer[100][100];
int anger;

int main(void)
{
	cin >> N;

	for (int r = 0; r < N; r++)
	{
		for (int c = 0; c < N; c++)
		{
			cin >> mirror[r][c];
			answer[r][c] = mirror[r][c];
		}
	}

	cin >> anger;

	if (anger == 2)
	{
		for (int r = 0; r < N; r++)
		{
			for (int c = 0; c < N; c++)
			{
				answer[r][c] = mirror[r][N - 1 - c];
			}
		}
	}
	else if (anger == 3)
	{
		for (int r = 0; r < N; r++)
		{
			for (int c = 0; c < N; c++)
			{
				answer[r][c] = mirror[N - 1 - r][c];
			}
		}
	}

	for (int r = 0; r < N; r++)
	{
		for (int c = 0; c < N; c++)
		{
			cout << answer[r][c];
		}
		cout << endl;
	}

	return 0;
}
#include <iostream>

using namespace std;

int A, B, C;
int start_time, end_time;
int cars[101];
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> A >> B >> C;

	for (int i = 0; i < 3; i++)
	{
		cin >> start_time >> end_time;

		for (int time = start_time; time < end_time; time++)
		{
			cars[time]++;
		}
	}

	for (int i = 1; i <= 100; i++)
	{
		switch (cars[i])
		{
		case 1:
			ans += A;
			break;
		case 2:
			ans += B * 2;
			break;
		case 3:
			ans += C * 3;
			break;
		}
	}

	cout << ans;
	
	return 0;
}
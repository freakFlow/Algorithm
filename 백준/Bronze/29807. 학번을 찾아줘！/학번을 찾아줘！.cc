#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int T;
int score[5] = { 0 };
int ans;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> T;

	for (int t = 0; t < T; t++)
	{
		cin >> score[t];
	}

	if (score[0] > score[2]) ans += (score[0] - score[2]) * 508;
	else ans += (score[2] - score[0]) * 108;

	if (score[1] > score[3]) ans += (score[1] - score[3]) * 212;
	else ans += (score[3] - score[1]) * 305;

	ans += score[4] * 707;

	ans *= 4763;

	cout << ans;
	
	return 0;
}
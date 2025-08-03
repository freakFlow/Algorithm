#include <iostream>

using namespace std;

int A, B, K, X;
int ans;

int main(void)
{
	cin >> A >> B >> K >> X;

	ans = min(K + X, B) - max(K - X, A) + 1;
	
	if (ans > 0) cout << ans;
	else cout << "IMPOSSIBLE";

	return 0;
}
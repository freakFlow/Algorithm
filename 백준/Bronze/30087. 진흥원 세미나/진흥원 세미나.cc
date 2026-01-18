#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int N;
string semina;

int main(void)
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	cin >> N;

	for (int n = 0; n < N; n++)
	{
		cin >> semina;

		if (semina == "Algorithm") cout << "204\n";
		else if (semina == "DataAnalysis") cout << "207\n";
		else if (semina == "ArtificialIntelligence") cout << "302\n";
		else if (semina == "CyberSecurity") cout << "B101\n";
		else if (semina == "Network") cout << "303\n";
		else if (semina == "Startup") cout << "501\n";
		else if (semina == "TestStrategy") cout << "105\n";
	}
	
	return 0;
}
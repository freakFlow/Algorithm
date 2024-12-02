#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

string str;
char ch;
int ans;

int main() {
    cin >> str;

    ch = 'A';
    ans = 0;
    for(int i=0; i<str.length(); i++){
        int diff = abs(ch - str[i]);
        ans += min(diff, 26 - diff);
        ch = str[i];
    }

    cout << ans;
    
    return 0;
}
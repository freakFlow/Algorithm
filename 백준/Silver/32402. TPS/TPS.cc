#include <iostream>
#include <string>
using namespace std;

int dx[] = {0, 1, 0, -1};
int dy[] = {1, 0, -1, 0};

int main() {
    int N;
    string input;

    int x, y, dir;
    x = y = dir = 0;

    cin >> N;

    for(int n=0; n<N; n++){
        cin >> input;

        if(input == "W"){
            x += dx[dir];
            y += dy[dir];
        }else if(input == "A"){
            x += dx[(dir + 3) % 4];
            y += dy[(dir + 3) % 4];
        }else if(input == "S"){
            x += dx[(dir + 2) % 4];
            y += dy[(dir + 2) % 4];
        }else if(input == "D"){
            x += dx[(dir + 1) % 4];
            y += dy[(dir + 1) % 4];
        }else if(input == "MR"){
            dir = (dir + 1) % 4;
        }else if(input == "ML"){
            dir = (dir + 3) % 4;
        }

        cout << x << ' ' << y << ' ' << x - dx[dir] << ' ' << y - dy[dir] << endl; 
    }

    return 0;
}
#include <iostream>

int N;

int main() {
    std::cin >> N;

    if(N % 2 == 0) std::cout << "Duck";
    else std::cout << "Goose";
    
    return 0;
}
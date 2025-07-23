#include <iostream>
#include <vector>
using namespace std;
// using a simple recursion we could solve this problem in O(2n) because anny fibonacci number depends on previous two fibo num. therefore this problem is repeatedly breaks down the problem until we hit the base case
// we can also use iterative approch to solve this problen with a more efficient complexity O(n)
// but i am using a memoization approach to solve this problem because in previous solution we have more redundent calculation which is going on agian and again

int nthFibo(int n, vector<int>& memo) {
    if (n <= 1) return n;

    if (memo[n] != -1) return memo[n];

    memo[n] = nthFibo(n - 1, memo) + nthFibo(n - 2, memo);
    return memo[n];
}

int fibonacciNum(int n) {
    vector<int> memo(n + 1, -1); // memo initialized with -1
    return nthFibo(n, memo);
}

int main() {
    int n;
    cout << "Enter the value of n: ";
    cin >> n;

    int ans = fibonacciNum(n);
    cout << "Fibonacci(" << n << ") = " << ans << endl;

    return 0;
}

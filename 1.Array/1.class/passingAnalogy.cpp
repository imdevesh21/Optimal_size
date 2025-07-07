#include <bits/stdc++.h>

using namespace std;

// // Pass by value
// int update(int x){ 
//   x += 10;
//   return x;
// }
// int main(){
//   int num = 5;
//   cout<< "Original value: " << num << endl;
//   cout << "Updated value: " << update(num) << endl;
//   return 0;
// }


// Pass by reference

void update(int &x){
  x += 10;
}
int main(){
  int num = 10;
  update(num);
  cout<<num;
}

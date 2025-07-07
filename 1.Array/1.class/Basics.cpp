#include <bits/stdc++.h>

using namespace std;

int main(){
  int arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  // array element insertion && meanwhile we're showing how to traverse an array
  for(int i=0; i<10; i++){
    cout<<arr[i]<<" "<<endl;
  }
  // accessing first element in the array
  cout<<arr[0]; 

  // update in an array
  arr[5] = 10;
  cout<<arr[5];
  return 0;
}

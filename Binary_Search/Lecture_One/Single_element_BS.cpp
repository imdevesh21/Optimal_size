#include <bits/stdc++.h>

using namespace std;

int singleDuplicate(vector<int> &nums){
  int n = nums.size();

  if(n == 1) return nums[0];
  if(nums[0] != nums[1]) return nums[0];
  if(nums[n-1] != nums[n-2]) return nums[n-1];

  int low = 1, high = n-2;
  while(low <= high){
    int mid = low + (high - low)/2;

    // if arr of mid is a single element
    if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid - 1]){
      return nums[mid];
    }

    // if terms are even, odd we're in the left
    if((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])){
      // eliminate the left half
      low = mid + 1;
    } else {
      // we're in the right half
      high = mid - 1;
    }
  }
  return -1;
}

int main(){
  vector<int> nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
  int ans = singleDuplicate(nums);
  cout<<"The single element is : "<< ans <<"\n";
  return 0;
}

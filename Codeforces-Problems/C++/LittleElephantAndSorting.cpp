#include<bits/stdc++.h>

using namespace std;
int main(){
	 int size; cin >> size;
	vector<int>vec;
	int left;cin >> left;
	long long result=0;
	for(int i=1; i< size; i++){
		int right; cin >> right; 
		if(right< left){
			result+=(left-right);
		}
		left=right;
	}
	cout << result << endl;
	


}

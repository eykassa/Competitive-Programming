#include<bits/stdc++.h>
using namespace std;

int main(){
	int n, k;
	cin >> n >> k;
	int ans=0;
	int cur=1;
	while(n>k){
		//cout << n << " "<< ans << " " << cur<< endl;
		ans=max(ans,cur+k);
		n-=(n+k-1)/k;
		cur++;
	}
	ans=max(ans,cur+n);
	cout << ans<<endl;;


}

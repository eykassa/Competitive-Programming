#include<bits/stdc++.h>

using namespace std;

int main(){
	int n; cin >> n;
	int mn=INT_MAX;
	int pos;
	int count=0;
	for(int i=1; i<= n; i++){
		int next; cin >> next;
		if(next < mn){
			count=1;
			mn=next;
			pos=i;
		}	
		else if(next==mn){
			count++;
		}
	}
	if(count> 1)
		cout << "Still Rozdil" << endl;
	else
		cout << pos << endl;
}

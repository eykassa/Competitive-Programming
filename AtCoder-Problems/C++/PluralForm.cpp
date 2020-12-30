#include<bits/stdc++.h>
 
using namespace std;
 
int main(){
	 string w; cin >> w;
	 if(w[w.length()-1]=='s'){
		w.push_back('e');
		w.push_back('s');
	}
	else {
		w.push_back('s');
	}
	cout << w;
}

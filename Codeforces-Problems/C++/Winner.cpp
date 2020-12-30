#include<bits/stdc++.h>
using namespace std;

int main(){
	int size; cin >> size;
	map<string,int> mp;
	string winner;
	int winnerScore=INT_MIN;
	while(size--){
		string name; cin >> name;
		int score; cin >> score;
		if(mp.find(name)==mp.end()){
			mp.insert(make_pair(name,score));
		}
		else{
			mp[name]+=score;
		}
		if(mp[name]>winnerScore){
			winner=name;
			winnerScore=mp[name];
		}

	}
	cout << winner << endl;

}

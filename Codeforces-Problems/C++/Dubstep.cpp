#include<bits/stdc++.h>

using namespace std;

int main(){
 	string word; cin >> word;
	string result="";
	string current="";
	string check="WUB";
	bool flag=false;

	for(int i=0; i<word.length(); i++){
		if(word.substr(i,3) =="WUB"){
			flag=true;
			i+=2;
			continue;
		}
		if(flag&&result.size()){
			result+=" ";
		}
		flag=false;
		result+=word[i];
		
	}	
	cout << result << endl;


}

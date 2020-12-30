#include<bits/stdc++.h>

using namespace std;

int main(){
	int t; cin >> t;
	while(t--){
		string next; cin >> next;
		vector<char> vec;
		bool done =true;
		for(char ch: next){
			if(ch=='('){
				vec.push_back(ch);
			}
			else if(ch==')'){
				if(vec.size()==0){
					done=false;
					break;
				}
				else if(vec.back()=='(' || vec.back()=='?'){
					vec.pop_back();
				}
				else{
					done=false;
					break;
				}
			}
			else if(ch=='?'){
				if(vec.size()==0){
					vec.push_back(ch);
				}
				else if(vec.back()=='('|| vec.back()=='?'){
					vec.pop_back();
				}
				else{
					vec.push_back(ch);
				}
			}
		}
		


	}


}

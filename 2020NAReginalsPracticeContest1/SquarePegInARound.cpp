#include<bits/stdc++.h>

using namespace std;

int main(){

	int n,m,k;
	cin >> n >> m >> k;
	vector<int> vec;
	for(int i=0; i< n; i++){
		int next; cin >> next;
	  	vec.push_back(next);	
	}
	sort(vec.begin(),vec.end());
	vector<int> vec2; 
	for(int i=0; i<m; i++){
		int next; cin >> next;
		vec2.push_back(next);
	}
	for(int i=0; i< k; i++){
		int next; cin >> next;
		int diagonal=sqrt((next*next)+(next*next));
		vec2.push_back(diagonal/2);
	}
	sort(vec2.begin(), vec2.end());
	
	int i=0, j=0;
	int result=0;
	while(i<vec.size() && j< vec2.size()){
		if(vec2[j]<vec[i]){
			result++;
			j++;
			i++;
		}
		else{
			i++;
		}
	
	}
	cout << result << endl;
	

}

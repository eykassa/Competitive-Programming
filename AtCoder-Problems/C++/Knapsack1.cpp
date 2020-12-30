#include <bits/stdc++.h>
 
using namespace std;
 
int main(){
 
	int size; cin >> size;
	
	int weight; cin >> weight;
 
	vector<long>w;
	vector<long>v;
	w.push_back(0);
	v.push_back(0);
	for(int i=0; i<size; i++){
	int a; cin >> a;
	int b; cin >> b;
	w.push_back(a);
	v.push_back(b);
	}
	long dp[size+1][weight+1];
	for(int i=0; i<=size;i++){
		for(int j=0; j<=weight; j++){
			dp[i][j]=0;
		}
 
	}
	for(int i=0; i<=size; i++){
		
		for(int j=0; j<=weight; j++){
		  if(i==0 ||j==0){
			dp[i][j]=0;
		   }
		   else {
			if(w.at(i) > j){
			 dp[i][j]=dp[i-1][j];
			}
		       
			else{
			if(j-w.at(i) <0){
			 dp[i][j]=max(v.at(i),dp[i-1][j]);
			}
			else{
			dp[i][j]= max(v.at(i)+ dp[i-1][j-w.at(i)] , dp[i-1][j]);
			}
			}
			
			
		   	} 
			
			
		}
	
	}
 
 
	cout << dp[size][weight];
 
 
 
}

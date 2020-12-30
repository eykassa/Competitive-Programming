#include <bits/stdc++.h>
 
using namespace std;
 
 
 
 
 
 
int main(){
	int size; cin >> size; 
	int jump; cin >> jump;
	int array[size];
	int value[size];
	for(int i=0; i<size; i++){
		int next; cin >> next;
		value[i]=next;
	}
 
	for(int i=0; i<size; i++){
		array[i]=INT_MAX;
	}
	array[0]=0;
	for(int i=0; i<size; i++){
		for(int j=1; j<=jump && j+i < size; j++){
		 array[i+j]=min( array[i+j], array[i]+ abs(value[i]-value[i+j]));
 
		}
 
	}
 
 
	cout << array[size-1];
 
}

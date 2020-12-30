#include <bits/stdc++.h>
  
 
using namespace std;
 
int main(){
        int size; cin >> size;
        int array[size][3];
        for(int i=0; i<size; i++){
                for(int j=0; j<3; j++){
                int next; cin >> next;
                array[i][j]=next;
                }
 
        }
        int dp [size][3];
        for(int i=0; i< size; i++){
                for(int j=0; j<3; j++){
                dp[i][j]=-INT_MIN;
                }
 
        }
        dp[0][0]=array[0][0];
        dp[0][1]=array[0][1];
        dp[0][2]=array[0][2];
        for(int i=0; i<size; i++){
 
                for(int j=0; j<3; j++){
 
                    for(int k=0; k<3;k ++){
                        if(k!=j){
                        dp[i+1][k]= max( dp[i+1][k], array[i+1][k]+dp[i][j]);
                        }
                        }
                }
 
        }
 
        if(size==1){
        int big=dp[0][0];
        for(int i=0; i<3; i++){
                big=max(big,dp[0][i]);
        }
        cout << big;
        }
        else{
        int big=dp[size-1][0];
        for(int i=0; i<3; i++){
        big=max(big,dp[size-1][i]);
        }
        cout << big;
        }
 
}

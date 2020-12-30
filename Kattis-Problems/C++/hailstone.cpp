#include<bits/stdc++.h>
  
using namespace std;


long solve(long num){

        if(num==1){
                return num+1;
        }
        else if(num%2==0){
        return num+solve(num/2);
        }
        else{
        return num+solve((num*3)+1);
        }

}




int main(){
        long num; cin >> num;
        cout << solve(num)-1;




}

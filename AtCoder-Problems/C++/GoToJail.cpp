#include<bits/stdc++.h>
  
using namespace std;
 
int main(){
        int s; cin >> s;
        int result=0;
        bool done=false;
        while(s--){ 
                int f,s; 
                cin >> f >> s;
                if(f==s){
                        result++;
                }
                else{
                        result=0;
                }
                if(result>=3){
                        done=true;
                }
        }
        if(result>=3 || done){
                cout << "Yes";
        }
        else{
                cout << "No";
        }
}

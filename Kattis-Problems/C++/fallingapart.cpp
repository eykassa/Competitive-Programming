#include<bits/stdc++.h>

using namespace std;

int main(){
    int t; cin >> t;
    vector<int> vec;
    while(t--){
        int next; cin >> next;
        vec.push_back(next);
    }   
    sort(vec.begin(), vec.end());
    int a=0;
    int b=0;
    bool n=true;
    for(int i=vec.size()-1; i>=0; i--){
        if(n){
            a+=vec[i];
        }
        else{
            b+=vec[i];
        }
        n=!n;
    }
    cout << a << " " << b;


}

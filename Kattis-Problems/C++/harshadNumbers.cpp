#include<bits/stdc++.h>

using namespace std;

int main(){
    long long n; cin >> n;
    
    while(true){
        long long next=n;
        long long sum=0;
        while(next>0){
            sum+=next%10;
            next/=10;
        }
        if(n%sum==0){
            cout << n << endl;
            return 0;
        }
        n++;
    }

}

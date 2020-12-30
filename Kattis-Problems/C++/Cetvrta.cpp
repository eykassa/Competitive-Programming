#include<bits/stdc++.h>
using namespace std;

int main(){
    int a, aa, b, bb, c,cc;
    cin>> a>> aa>> b>> bb>> c>>cc;
    int l, r;
    l=a ^b^c;
    r=aa ^ bb ^cc;
    cout << l << " "<< r;
   
}

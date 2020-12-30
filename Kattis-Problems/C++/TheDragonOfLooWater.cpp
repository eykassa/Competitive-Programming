#include <bits/stdc++.h>


using namespace std;
int main(){
    int s,n;
    while(cin >> s >> n){
    if(s==0 && n==0){
    return 0;
        }
    vector<int>vec2;
    for(int i=0; i<s; i++){
        int next;
        cin >> next;
        vec2.push_back(next);
    }

    vector<int>vec;
    for(int j=0; j<n; j++){
        int next; cin >> next;
        vec.push_back(next);
    }
    sort(vec.begin(),vec.end());
    sort(vec2.begin(),vec2.end());
    int index=0;
    int result=0;
    bool done=true;
    for(int i=0; i<vec2.size(); i++){
         int value=vec2.at(i);
         while(index<vec.size() && vec.at(index) < value){
        index++;
        }
        if(index >=vec.size()){
        cout << "Loowater is doomed!\n";
        done=false;
        break;} 
        result+=vec.at(index);
        index++;
    }
    if(done){
    cout << result << "\n";
    }
    }

}

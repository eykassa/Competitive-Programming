#include <bits/stdc++.h>
  
using namespace std;
 
 
 
 
 
 
int main(){
        int size; cin >> size;
 
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
                if( (i+1) < size){
                        array[i+1]=min(array[i+1], array[i]+abs(value[i]-value[i+1]));
                }
                if((i+2) < size){
                        array[i+2]=min(array[i+2],array[i]+abs(value[i]-value[i+2]));
                }
 
        }
 
 
        cout << array[size-1];
 
}

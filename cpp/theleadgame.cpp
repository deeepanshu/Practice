#include<bits/stdc++.h>
using namespace std;
int main(){
  int n;
  int highestScore = 0;
  int player = 1;
  int cs1 = 0, cs2 = 0;
  cin>>n;
  for(int i=0; i<n;i++){
      int s1,s2;
      cin>>s1>>s2;
      cs1 += s1;
      cs2 += s2;

      int currentLead = 0;
      int currentLeadPlayer = 1;
      if(cs1>=cs2){
        currentLead = cs1 - cs2;
      }
      else{
        currentLead = cs2 - cs1;
        currentLeadPlayer = 2;
      }
      if(currentLead>highestScore){
        highestScore = currentLead;
        player = currentLeadPlayer;
      }
  }
  cout<<player<<" "<<highestScore<<endl;

  return 0;
}

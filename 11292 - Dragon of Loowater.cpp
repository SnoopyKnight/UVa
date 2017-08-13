#include<iostream>
#include<cstdio>
#include<algorithm>
using namespace std;

const int MAXN = 20000 + 5;
int A[MAXN],B[MAXN];

int main()
{
    int m,n,i;
    while(scanf("%d%d",&n,&m) == 2 &&n &&m){
        for(i = 0 ;i < n ; i++) scanf("%d",&A[i]);
        for(i = 0 ;i < m ; i++) scanf("%d",&B[i]);
        sort(A,A+n);
        sort(B,B+m);
        int cur = 0;
        int cost = 0;
        for(int i=0 ; i<m ; i++){
            if ( B[i] >= A[cur])
                cost += B[i];
            if(++cur == n)
                break;
        }
        if(cur < n)
            printf("Loowater is doomed!\n");
        else
            printf("%d\n",cost);
    }
    return 0;
}

#include<iostream>

int uniquePaths(int m, int n)
    {
        int **arry;
        arry=new int*[m];
        for(int i=0;i!=m;i++)
            {
                arry[i]=new int[n];
            }
        arry[0][0]=1;
        for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                    {
                        if(i>0&&j>0) arry[i][j]=arry[i-1][j]+arry[i][j-1];
                        else if(i==0&&j>0) arry[i][j]=arry[i][j-1];
                        else if(i>0&&j==0) arry[i][j]=arry[i-1][j];
                    }
            }
        int res=arry[m-1][n-1];
        for(int i=0;i!=m;i++)
            {
                delete[] arry[i];
            }
        delete[] arry;
        return res;
    }
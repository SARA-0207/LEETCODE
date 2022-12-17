void sortColors(int* nums, int numsSize){
    /*another method
    int i,cz=0,co=0;
    for(int i=0; i<numsSize; i++)
    {
        if(nums[i]==0) ++cz;
        if(nums[i]==1) ++co;
     }
     for(i=0; i<cz; i++)
     {
         nums[i]=0;
     }
     for(i=cz; i<cz+co; i++)
     {
         nums[i]=1;
     }
     for(i=co+cz; i<numsSize; i++)
     {
         nums[i]=2;
     }*/
     int i=0,cz=0,ti=numsSize-1;
    //for(i=0; i<=ti; i++)
    while(i<=ti)
     {
         if(nums[i]==0)
         {
             swap(&nums[i++],&nums[cz++]);
             
         }

         else if(nums[i]==1)
         {
                i++;
         }
         else if(nums[i]==2)
         {
             swap(&nums[i],&nums[ti--]);
         }

     }

}
void swap(int * p1,int * p2)
{
    int temp = *p1;
    *p1 = *p2;
    *p2 = temp;
}

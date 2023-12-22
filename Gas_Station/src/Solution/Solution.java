package Solution;
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // int position = 0,sum=0, total=0;
        // for (int index =0; index<gas.length;index++){
        //     sum+= gas[index]-cost[index];
        //     if (sum<0){
        //         total+=sum;
        //         sum=0;
        //         position = index +1;
        //     }

        // }
        // total +=sum;
        // return total>0?position:-1;
        // }
        int sum1=0,sum2=0;
        for(int i=0;i<gas.length;i++){
            sum1+=gas[i];
            sum2+=cost[i]; 
        }
        if(sum1-sum2<0) return -1;
        
        int index=0;
        int ans=0;
        for (int i=0;i<gas.length;i++){
            
            index+=gas[i]-cost[i];
           
                if(index<0){
                    index=0;
                    ans=i+1;
                }
            }

         
        return ans;
        }
    
    
}
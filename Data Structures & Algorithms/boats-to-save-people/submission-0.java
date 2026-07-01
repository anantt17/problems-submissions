class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
       int res = 0;
       int n = people.length;

            int li = 0;
            int ri = n - 1;

            while(li<=ri){
                int left = people[li];
                int right = people[ri];

                        int sum = left+right;
                    if(sum == limit || sum<limit){
                        res++;
                        li++;
                        ri--;
                    }

                    else{
                        ri--;
                        res++;
                    }
                    
                }
            



       return res; 
    }
}
class Solution {
      public int[] topKFrequent(int[] nums, int k) {
            // count frequency for each number
            Map<Integer,Integer> count = new HashMap<>();
            for(int num : nums){
                if(count.containsKey(num)){
                    count.put(num,count.get(num)+1);
                }else{
                    count.put(num,1);
                }
            }


            // bucket where key frequency and value is list of numbers
            List<Integer>[] bucket = new List[nums.length+1];
            for(Integer key : count.keySet()){
                int frequency = count.get(key);
                if(bucket[frequency]==null){
                    bucket[frequency] = new ArrayList<>();
                }
                bucket[frequency].add(key);
            }
            // get top k element
            int[] result = new int[k];
            int index = 0;
            for(int i = bucket.length-1;i>=0 && index < k;i--){
                if(bucket[i]!=null){
                    for(int value : bucket[i]){
                        result[index]=value;
                        index++;
                        if (index == k){
                            break;
                        }
                    }
                }

            }
            return result;

        }

}

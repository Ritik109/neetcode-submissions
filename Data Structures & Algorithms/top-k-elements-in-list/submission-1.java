class Solution {
    public int[] topKFrequent(int[] nums, int k) {
           // calculate frequencey for each element
            Map<Integer,Integer> frequency = new HashMap<>();
            for(Integer num : nums){
                if(frequency.containsKey(num)){
                    frequency.put(num,frequency.get(num)+1);
                }
                else{
                    frequency.put(num,1);
                }
            }

            // priority queue
            Comparator<Integer> comparator = Comparator.comparingInt(frequency::get);

        Queue<Integer> maxFrequentElement = new PriorityQueue<>( comparator);

        for(Integer freq : frequency.keySet()){
            maxFrequentElement.add(freq);
            if(maxFrequentElement.size()>k){
                maxFrequentElement.poll();
            }
        }
        int[] result = new int[k];
        int i=0;
        for(Integer num : maxFrequentElement){
            result[i]=num;
            i++;
        }
        return result;
    }
}

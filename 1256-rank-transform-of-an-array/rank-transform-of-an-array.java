class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int []sorted=arr.clone();  //clonign that arrays in sortes array
        Arrays.sort(sorted);  //nxt sorting the sorted arrqy which contains the element in the sameas in arr
        HashMap<Integer,Integer>map=new HashMap<>(); //creating hashmap store a valus and their rank
        int rank=1;  //initialze the rank is 1

        for(int i=0;i<arr.length;i++){ 
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}
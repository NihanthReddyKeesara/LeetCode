class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s=new HashSet<>();
        Set<Integer> s1=new HashSet<>();
        for(int num:nums1){
            s.add(num);
        }

        for(int i=0;i<nums2.length;i++){
            if(s.contains(nums2[i])){
                s1.add(nums2[i]);
            }
        }
        int[] res=new int[s1.size()];
        int index=0;
        for(int num:s1){
            res[index]=num;
            index++;
        }
        return res;
    }
}
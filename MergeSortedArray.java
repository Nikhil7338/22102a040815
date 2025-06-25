class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=nums1.length;
        int x=0;
        for(int i=m;i<l;i++){
            nums1[i]=nums2[x];
            x++;
        }
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                if(nums1[j]>nums1[j+1]){
                    int temp=nums1[j];
                    nums1[j]=nums1[j+1];
                    nums1[j+1]=temp;
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}

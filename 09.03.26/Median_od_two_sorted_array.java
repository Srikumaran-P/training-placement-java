class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // First check which is the smaller array
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }

        // Find the lengths of the arrays
        int x = nums1.length;
        int y = nums2.length;

        // Assign the start and end pointers
        int start = 0;
        int end = x;

        while (start <= end){
            // Calculate the number of elements from both the arrays
            int partX = (start+end)/2;
            int partY = (x+y+1)/2 - partX;

            // Now calculate the left and right elements of both the arrays
            int xLeft = partX == 0 ? Integer.MIN_VALUE : nums1[partX - 1];
            int xRight = partX == x ? Integer.MAX_VALUE : nums1[partX];
            int yLeft = partY == 0 ? Integer.MIN_VALUE : nums2[partY -1];
            int yRight = partY == y ? Integer.MAX_VALUE : nums2[partY];

            // Now check if the condition is satisfied
            if (xLeft <= yRight && yLeft <= xRight){
                // Now check if it's odd or even
                if((x+y)%2 == 0){
                    return ((double) Math.max(xLeft, yLeft) + Math.min(xRight, yRight))/2;
                }
                else {
                    return (double) Math.max(xLeft, yLeft);
                }
            }
            // Now if the condition doesn't satisfy update the pointers
            else if(xLeft > yRight){
                end = partX -1;
            }else{
                start = partX +1;
            }
        }
        return 0;
    }
}

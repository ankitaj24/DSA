package arrays;

class Max_Product_SubArray {
    public static int maxProduct(int[] nums) {
        if(nums.length==1)
        return nums[0];
        int pro=1;
        int max_pro=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
            System.out.print(pro+" ");
            max_pro=Math.max(max_pro, pro);
            if(pro==0) {            	
            	pro=1;
            }
        }
        System.out.println("\n"+max_pro);
        pro=1;
        for(int i=nums.length-1;i>=0;i--) {
        	pro*=nums[i];
        	System.out.print(pro+" ");
        	max_pro=Math.max(max_pro, pro);
        	if(pro==0)
        		pro=1;
        }
        return max_pro;
    }
    public static void main(String args[]) {
    	int arr[]= {4,-2,3,-4,3,-6};
    	//int arr[]= {3,-2,4,-2,0,6,-2,4,0,4,-2,-5};
    	System.out.println("\n"+maxProduct(arr));
    }
}

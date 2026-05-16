public class subset{
    static boolean targetsum(int[] arr,int index, int target) {
        if(target==0) return true;
        if(index==0) return arr[index]==target;
        boolean take=false;
        if(arr[index]<=target)
            take=targetsum(arr, index-1, target-arr[index]);
        boolean nottake=targetsum(arr, index-1, target);
        return take||nottake;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3};
        System.out.println(targetsum(arr,arr.length-1, 7));
    }
}

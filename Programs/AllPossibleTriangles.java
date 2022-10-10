//this program finds all the possible number of triangles that can be formed with the given number of edges

import java.util.Arrays;
public class FormATriangle
{
    public static void main(String[] args) {
        int []arr = {2,2,3,4};
        int ans = allTriangles(arr);
        System.out.println(ans);
    }

    public static boolean isTriangle(int a,int b,int c) {
        if( a + b <= c) return false;
        if( b + c <= a) return false;
        if( a + c <= b) return false;
        return true;
    }
    public static int allTriangles(int []nums) {
        Arrays.sort(nums);
        int i=0,j=2,sum = 0 ;

        if(nums.length < 3) return 0;

        while(j < nums.length) {
            if(isTriangle(nums[i], nums[i+1],nums[j])) {
                sum++;
            }
            i++;j++;
        }
        return sum;
    }
}

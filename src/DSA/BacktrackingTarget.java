package DSA;

import java.util.ArrayList;
public class BacktrackingTarget {
    static void generate(int []arr, int index ,ArrayList<Integer>current,int target){
         if(target==0){
             System.out.println(current);
             return;
         }
         if(index==arr.length || target<0){
             return;
         }
         current.add(arr[index]);
         generate(arr,index,current,target-arr[index]);

         current.remove(current.size() - 1);
         generate(arr,index+1,current,target);


    }
    public static void main(String[] args) {
        int []arr={2,3,6,7};
        generate(arr,0,new ArrayList<>(),7);


    }

}

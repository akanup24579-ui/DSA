package DSA;
import java.util.HashMap;

public class SingleNUmber {
    public static void main(String[] args) {
        int []arr={7};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                System.out.println(key);
            }
        }

    }
}

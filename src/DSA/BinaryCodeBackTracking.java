package DSA;

public class BinaryCodeBackTracking {
    static void generate(String Current){
        System.out.println("enetring "+Current);
        if(Current.length()==3){
            System.out.println(Current);
            return;

        }
        generate(Current+"0");
        generate(Current+"1");
        System.out.println("Returning from:"+Current);

    }
    public static void main(String[] args) {
        generate("");
    }
}

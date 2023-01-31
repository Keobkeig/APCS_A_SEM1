public class Test {
    static int five;
    int[] intArray;
    public static void main(String[] args) {
        five = 5;
        double three = 3;
        String greeting = "Good morning folks";
        //does five, the varible, have the properties public and static since it wasn't mentioned unlike 3, which is given the property final
        System.out.println(greeting.substring(2,7).substring(3));    
        System.out.println(adders(five));
        System.out.println(five);
        Test thisOne = new Test();
        thisOne.intArray = new int[5];
        System.out.println(thisOne.intArray);
    }

    public static int adders(int num) {
        return num += 5;
    } 

}

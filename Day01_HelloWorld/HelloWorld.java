package Day01_HelloWorld;

public class HelloWorld {
    public static void main(String[] Args){
        //this is basic java code
        System.out.println("Hello-World");

        //for loop
        int[] numbers= {1,2,3,4,5,6};
        for (int i=0;i < numbers.length;i++) {
            System.out.println("Element at index" + i + ":" + numbers[i]);
        }

        //enhanced for loop
        for (int num : numbers){
            System.out.println("Elements :" +num);
        }
    }
}

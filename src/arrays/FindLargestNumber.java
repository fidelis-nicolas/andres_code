package arrays;

public class FindLargestNumber {
    public static void main(String[] args) {
        int number [] = {45, 8, 90, 98, 99, 87, 78};

        int largest = number[0];

        for(int i=0; i< number.length; i++){
            if(number[i] > largest){
                largest = number[i];
            }
        }
        System.out.println(largest);
    }
}

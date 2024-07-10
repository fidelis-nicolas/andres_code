package arrays;

public class MultiArray {
    public static void main(String[] args) {
        //Assignment find the largest and lowest number in the given array
        int [][] numbers = {{1,25,7,89, 98,65}, {8,4,90, 65, 66, 87}, {34, 7, 89, 78, 54}};
        System.out.println(numbers[1][4]);
        System.out.println(numbers[2][3]);

        for(int i = 0; i< numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}

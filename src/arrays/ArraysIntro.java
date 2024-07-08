package arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // A collection of elements of the same data type
        int studentScore [] = {10,67, 56, 78, 90};
        System.out.println(studentScore[3]);

        int size = studentScore.length;
        int i = 0;
        System.out.println("Student Scores: ");
        while(i<size){
            System.out.println(studentScore[i]);
            i++;
        }

        System.out.println(Arrays.toString(studentScore));
        studentScore[3] = 54;
        System.out.println(Arrays.toString(studentScore));

        String studentNames[] = new String[5];
        studentNames[0] = "Andres";
        studentNames[2] = "John";
        studentNames[4] = "Bob";
        studentNames[3] = "Fidelis";
        studentNames[1] = "Sam";


        System.out.println(studentNames.length);
        System.out.println(studentNames[0]);

        System.out.println("Student Names: ");
        for(int j =0; j< studentNames.length; j++){
            System.out.println(studentNames[j] + ": " + studentScore[j]);
        }


    }
}

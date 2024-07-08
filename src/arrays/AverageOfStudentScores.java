package arrays;

public class AverageOfStudentScores {
    public static void main(String[] args) {
        int studentScores [] = {10,49,48, 78, 90, 56, 54, 32, 58, 87, 36};

        double total = 0;
        for(int i = 0; i<studentScores.length; i++){
            total += studentScores[i];
        }
        System.out.println(total/ studentScores.length);
    }
}

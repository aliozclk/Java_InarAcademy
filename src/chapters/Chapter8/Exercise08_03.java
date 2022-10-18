package chapters.Chapter8;

public class Exercise08_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[] studentScores = new int[answers.length];

        for (int student = 0; student < answers.length; student++) {
            studentScores[student] = getScore(answers,keys,student);
        }
        for (int i = 0; i < studentScores.length ; i++) {
            displayStudentsIncreasingOrder(studentScores);
        }

    }

    public static int getScore(char[][] answers , char[] keys , int student){
        int correctCount = 0;
        for (int j = 0; j < answers[student].length; j++) {
            if (answers[student][j] == keys[j])
                correctCount++;
        }
        return correctCount;
    }

    public static void displayStudentsIncreasingOrder(int[] scores){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int j = 0; j < scores.length; j++) {
                if(scores[j] < min ){
                    min = scores[j];
                    minIndex = j ;
            }
        }

        System.out.println((minIndex+1) + ". Student's score is " + min);
        scores[minIndex] = Integer.MAX_VALUE;
    }
}

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner choice=new Scanner(System.in);

        System.out.println("""
                Hello! Choose from the options below to play some games\s
                1. Quiz
                2. Sudoku Solver""");
        int n=choice.nextInt();
        switch(n){
            case 1:
                Quiz.TakeTest();
                break;
            case 2:
                SudokuSolver.main();
                break;


        }

    }



}


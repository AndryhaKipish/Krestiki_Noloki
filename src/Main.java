import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] game = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };


        while (true) {
            printGame(game);
            input(game, 'X');
            winnercheacker(game, 'X');
            printGame(game);
            input(game, '0');
            winnercheacker(game, '0');


        }

    }


    public static void printGame(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void input(char[][] game, char choice) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ряд:");
            String inputcolonm = scanner.nextLine();
            int number1 = Integer.parseInt(inputcolonm);
            int index1 = number1 - 1;
            System.out.println("Введите колонку:");
            String inputindex = scanner.nextLine();
            int number2 = Integer.parseInt(inputindex);
            int index2 = number2 - 1;
            if (game[index1][index2] != '-') {
                System.out.println("Занято");
                printGame(game);
            } else {
                game[index1][index2] = choice;
                break;
            }
        }
    }


    public static void winnercheacker(char[][] game, char player) {
        if (game[0][0] == game[0][1] && game[0][2] == game[0][1] && game[0][0] != '-' ||
                game[1][0] == game[1][1] && game[1][2] == game[1][1] && game[1][0] != '-' ||
                game[2][0] == game[2][1] && game[2][2] == game[2][1] && game[2][0] != '-' ||
                game[0][0] == game[1][0] && game[2][0] == game[1][0] && game[0][0] != '-' ||
                game[0][1] == game[1][1] && game[1][1] == game[2][1] && game[0][1] != '-' ||
                game[0][2] == game[1][2] && game[2][2] == game[1][2] && game[0][2] != '-' ||
                game[0][0] == game[1][1] && game[2][2] == game[1][1] && game[0][0] != '-' ||
                game[0][2] == game[1][1] && game[2][0] == game[1][1] && game[0][2] != '-') {
            System.out.println("победа" + ' ' + player);
            fillgame(game);
        }
    }

    public static void fillgame(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '-';
            }
        }
    }

}
























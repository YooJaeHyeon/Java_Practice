/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kr.ac.gwnu.com.bowling;

public class App {

    public static void main(String[] args) {
        Player player = new Player("유재현");
        BowlingGame bowlingGame = new BowlingGame(player);
        bowlingGame.startGame();
    }
}

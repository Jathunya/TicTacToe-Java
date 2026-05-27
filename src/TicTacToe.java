import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TicTacToe {
  int boardWidth = 600;
    int boardHeight = 650; 
    
    JFrame frame = new JFrame("Tic-Tac-Toe");
    JLabel textLabel = new JLabel();
    JPanel textPanel = new JPanel();
    JPanel boardPanel = new JPanel();

    JButton[][] board = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentPlayer = playerX;

    boolean gameOver = false;
    int turns = 0;
}

import java.util.Scanner;

public class Player
{
  private String name = ""; 
  private int points;

  public Player() {
    points = 0;
    System.out.print("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();

    name = newName;
    System.out.println("Welcome to the game " + name);
  }

  public Player(String inputName) {
    points = 0;
    name = inputName;
  }
  public int getPoints()
  {
    return points;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String x)
  {
    name = x;
  }
  public void setPoints(int x)
  {
    points = x;
  }
}
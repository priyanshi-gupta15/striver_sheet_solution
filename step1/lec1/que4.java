package step1.lec1;
// switch statement
public class que4 {
  public static void main(String[] args) {
    String day = "Monday";
    switch (day) {
      case "Monday" -> System.out.println("Start of the work week.");
      case "Tuesday" -> System.out.println("Second day of the work week.");
      case "Wednesday" -> System.out.println("Midweek day.");
      case "Thursday" -> System.out.println("Almost the weekend.");
      case "Friday" -> System.out.println("Last day of the work week.");
      case "Saturday", "Sunday" -> System.out.println("Weekend!");
      default -> System.out.println("Invalid day.");
    }
  }
  
}

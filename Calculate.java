public class Calculate {
  public static void main(String[] arg){
     System.out.println("Calculate...");
     long first = Long.valueOf(arg[0]);
     long second = Long.valueOf(arg[1]);
     switch (arg[2]){
     case "+":
       System.out.println("Addition " + (first + second));
       break;
     case "-":
       System.out.println("Subtraction " + (first - second));
       break;
     case "*":
       System.out.println("Multiplication " + (first * second));
       break;
     case "/":
       System.out.println("Division " + (first / second));
       break;
     case "^":
       System.out.println("To the power of " + (Math.pow(first,second)));
       break;
     default:
       System.out.println("Not operation");
       break;

     }
  }
}

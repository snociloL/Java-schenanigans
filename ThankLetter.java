// Abstract class
abstract class ThankLetter {
    // Abstract method (does not have a body)
    public abstract void Thank();
    // Regular method
    public void Thankyou() {
      System.out.println("Thank You!! Enjoy Your Meal!");
    }
  }
  
  // Subclass (inherit from ThankLetter)
  class See extends ThankLetter {
    public void Thank() {
      // The body of Thank() is provided here
      System.out.println("Siuuuuuu Lay arrrr!!");
    }
  }
  

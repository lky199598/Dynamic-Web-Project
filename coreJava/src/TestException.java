
public class TestException {
  public static void A() throws Exception
  {
	 throw new Exception();
  }
  public static void main(String[] args) throws Exception {
	System.out.println("Before");
	A();
	System.out.println("After");
}
}

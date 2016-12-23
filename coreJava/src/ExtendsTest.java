class E {
	private String a = "a";

	public void visit() {
		System.out.println(a);
		System.out.println(getClass());
	}
}

class F extends E {

	private String a = "b";

	public void bb() {
		visit();
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		F f = new F();
		f.bb();
	}
}

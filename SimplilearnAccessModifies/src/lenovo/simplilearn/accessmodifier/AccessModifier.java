package lenovo.simplilearn.accessmodifier;

public class AccessModifier {

	public static int publicVar = 10;

	private static int privateVar = 20;

	protected static int protectedVar = 30;

	static int defaultVar = 40;

	public static void main(String[] args) {

		System.out.println("Public Var: " + publicVar);

		System.out.println("Protected Var: " + protectedVar);

		System.out.println("Default Var: " + defaultVar);

		System.out.println("Private Var: " + privateVar);
	}
}

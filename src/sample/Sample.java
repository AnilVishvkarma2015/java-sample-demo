package sample;

public class Sample {

	public static void main(String ar[]) {
		System.out.println("This is the first sample statement!");
		cloneCommand();
		pushCommand();
	}

	public static void cloneCommand() {
		System.out.println("git clone repo_url is the command to clone the repository!");
	}

	public static void pushCommand() {
		System.out.println("git push origin repo_url is the command to push the repository!");
	}
}

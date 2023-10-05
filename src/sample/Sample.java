package sample;

public class Sample {

	public static void main(String ar[]) {
		System.out.println("This is the first statement!");
		cloneCommand();
		pushCommand();
	}

	public static void cloneCommand() {
		System.out.println("git clone repo_url is the command to clone the repo in current branch ! use the same command going farward");
	}

	public static void pushCommand() {
		System.out.println("git push remote repo_url is the command to push the repo!");
	}
}

import java.util.Scanner;
class JavaProgram {

	static int wrong = 1;
	static String title;

	public static void main(String args[]) {
		System.out.println("Hello World!");
	}

	public int getWrong() {
		return JavaProgram.wrong;
	}

	public void setWrong(int newValue) {
		JavaProgram.wrong = newValue;
	}

}

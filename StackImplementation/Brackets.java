package StackImplementation;

/*Program for checking is brackets sequence is valid
 * Checks if every opening bracket has a closing bracket
 * */
public class Brackets {
	private String brackets;

	public Brackets(String s) {
		brackets = s;

	}

	public boolean isEmpty() {
		return this.brackets.length() == 0;
	}

	public boolean validate() {
		boolean isValid = true;
		String previous, current;

		Stack bracketStack = new Stack(this.brackets.length());

		for (int i = 0; i < this.brackets.length(); i++) {

			current = makeString(this.brackets.charAt(i));
			if (current.equals("(") || current.equals("{") || current.equals("[")) {
				bracketStack.push(current);
			} else if (current.equals(")") || current.equals("}") || current.equals("]")) {
				if (bracketStack.isEmpty()) {
					isValid = false;
				} else {
					previous = bracketStack.peek();
					if ((previous.equals("(") && current.equals(")")) || previous.equals("{") && current.equals("}")
							|| previous.equals("[") && current.equals("]")) {
						bracketStack.pop();
					}
				}

			}

		}

		if (!bracketStack.isEmpty()) {
			isValid = false;
		}
		return isValid;
	}

	public String getBrackets() {
		return brackets;
	}

	public static void main(String[] args) {

		Brackets testBrackets = new Brackets("{(()}");
		testBrackets.displayResult();

		Brackets testBrackets2 = new Brackets("{(())}");
		testBrackets2.displayResult();
	}

	public String makeString(char c) {
		return String.valueOf(c);
	}

	public void displayResult() {
		if (this.validate()) {
			System.out.println(this.getBrackets() + " is valid");
		} else {
			System.out.println(this.getBrackets() + " is invalid");
		}

	}

}

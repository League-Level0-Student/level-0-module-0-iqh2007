package strings_and_dialogs;

import java.util.function.Predicate;

public class runer {
public static void main(String[] args) {
	
	lambdaTester((s)-> {
		
		return s.length() > 5;
				});

}
private static void lambdaTester(Predicate<String> p) {
	// TODO Auto-generated method stub
	p.test("word");

}


}

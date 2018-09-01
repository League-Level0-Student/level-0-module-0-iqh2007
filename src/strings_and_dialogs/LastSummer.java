package strings_and_dialogs;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("What is your name?");
String activity = JOptionPane.showInputDialog("I know what you did last summer," + name);
}
}

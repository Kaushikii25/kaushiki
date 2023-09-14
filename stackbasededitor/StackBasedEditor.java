package stackbasededitor;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;
import javax.swing.JTextArea;
public class StackBasedEditor extends Frame {
 private Stack<String> characters;
 private TextField textField;
 private Button insertButton;
 private Button deleteButton;
 private JTextArea textArea;
 public StackBasedEditor() {
 super("Stack Based Editor");
 characters = new Stack<>();
 textField = new TextField();
 insertButton = new Button("Insert");
 deleteButton = new Button("Delete");
 textArea = new JTextArea();
 textArea.setEditable(false);
 textArea.setColumns(20);
 textArea.setRows(10);
 textArea.setAlignmentX(30);
 textArea.setAlignmentY(80);
 insertButton.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e) {
 insertCharacter();
 }
 });
 deleteButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 deleteCharacter();
 }
 });
 Panel panel = new Panel();
 panel.add(textField);
 panel.add(insertButton);
 panel.add(deleteButton);
 panel.add(textArea);
 textField.setPreferredSize(new Dimension(200, 20));
 textArea.setEditable(false);
 add(panel);
 pack();
 setLocationRelativeTo(null);
 setVisible(true);
 }
 private void insertCharacter() {
 String c = textField.getText();
 textField.setText("");
 characters.push(c);
 System.out.println(characters);
 displayCharacters();
}
 private void deleteCharacter() {
 if (!characters.isEmpty()) {
 characters.pop();
 displayCharacters();
 }
 }
 private void displayCharacters() {
 textArea.setText("");
 for (String character : characters) {
 textArea.append(character + "\n");
 }
 }
 public static void main(String[] args) {
 new StackBasedEditor();
 }
}
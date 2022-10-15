package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
JOptionPane.showMessageDialog(null, "this is RIDDLE MANIA! we will start with some easy riddles, but it will get harder, and the points will go up! GET READY! And by the way, if you get an answer wrong, you will LOSE POINTS!");
String veryEasy= JOptionPane.showInputDialog("what has a head and a tail but no body? this answer should only be ONE WORD!");
if (veryEasy.equalsIgnoreCase("coin")){
	JOptionPane.showMessageDialog(null, "good! you got it right! time for the next question! it will be HARDER!");
	score+=1;
}
else {
	JOptionPane.showMessageDialog(null, "*ha ha* you got it WRONG! the answer was 'coin'! well, better luck on the next riddle!");
score-=1;
}
String easy= JOptionPane.showInputDialog("Brothers and sisters I have none but this man's father is my father's son. Who is the man? the answer should have TWO WORDS!");

if (easy.equalsIgnoreCase("my son")){
	JOptionPane.showMessageDialog(null, "amazing! you got two in a row right! good going!");
score+=2;
}
else {
	JOptionPane.showMessageDialog(null, "WRONG! the real answer was 'my son'! if you can't answer this riddle, what will you do when the HARD RIDDLES come?");
score-=2;
}
String good= JOptionPane.showInputDialog("What is greater than God,\n"
		+ "more evil than the devil,\n"
		+ "the poor have it,\n"
		+ "the rich need it,\n"
		+ "and if you eat it, you'll die? the answer has ONE WORD!");

if (good.equalsIgnoreCase("nothing")){
	JOptionPane.showMessageDialog(null, "wow! you are on fire today!");
score+=4;
}
else {
	JOptionPane.showMessageDialog(null, "WHAT HAS GOTTEN INTO YOU? THE ANSWER WAS 'nothing'! YOU GOT IT WRONG! MINUS POINTS FOR YOU!");
score-=4;
}
String hard= JOptionPane.showInputDialog("Who makes it, has no need of it.\n"
		+ "Who buys it, has no use for it.\n"
		+ "Who uses it can neither see nor feel it.\n"
		+ "What is it? the answer has ONE WORD!");

if (hard.equalsIgnoreCase("coffin")){
	JOptionPane.showMessageDialog(null, "today is your lucky day! you got the hardest riddle correctly! congrats!");
score+=8;
}
else {
	JOptionPane.showMessageDialog(null, "HA HA! I KNEW YOU WOUDN'T GET THIS RIGHT! WELL, TOO BAD!");
score-=8;
}

JOptionPane.showMessageDialog(null, "nice effort! your score is:" + score+". goodbye for now!");




// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}


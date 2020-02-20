package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	
String answer=JOptionPane.showInputDialog(null,"Are you old enough to vote?");	
int useranswer=Integer.parseInt(answer);
if(useranswer>=18){
JOptionPane.showMessageDialog(null, "How old are you?");	
}
else {
JOptionPane.showMessageDialog(null,"You're not old enough to vote");	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

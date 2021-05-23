package AdventureGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    ChoiceHandler cHandler=new ChoiceHandler();
    Board b= new Board();
    VisibilityManager vm=new VisibilityManager(b);
    Story story = new Story(this, b, vm);

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public static void main(String[]args){

        new Game();
    }

    public Game(){

        b.createBoard(cHandler);
        story.defaultSetup();
        vm.showTitleSCreen();
    }

    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            switch(yourChoice){
                case "start": vm.titleToTown(); story.townGate(); break;
                case "c1": story.selectPosition(nextPosition1); break;
                case "c2": story.selectPosition(nextPosition2);break;
                case "c3": story.selectPosition(nextPosition3);break;
                case "c4": story.selectPosition(nextPosition4);break;
            }

        }

    }
}

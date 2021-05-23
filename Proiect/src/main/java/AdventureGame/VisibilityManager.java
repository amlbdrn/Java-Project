package AdventureGame;

public class VisibilityManager {

    Board b;
    public VisibilityManager(Board bo){

        b= bo;
    }

    public void showTitleSCreen(){

        b.titleNamePanel.setVisible(true);
        b.startButtonPanel.setVisible(true);

        b.mainTextPanel.setVisible(false);
        b.choiceButtonPanel.setVisible(false);
        b.playerPanel.setVisible(false);
    }

    public void titleToTown(){

        b.titleNamePanel.setVisible(false);
        b.startButtonPanel.setVisible(false);

        b.mainTextPanel.setVisible(true);
        b.choiceButtonPanel.setVisible(true);
        b.playerPanel.setVisible(true);

    }
}

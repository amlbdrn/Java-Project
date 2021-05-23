package AdventureGame;

public class Story {

    Game game;
    Board b;
    VisibilityManager vm;
    Player player = new Player();
    Monster monster;
    int silverRing;

    public Story(Game g, Board bo, VisibilityManager vManager){

        game=g;
        b=bo;
        vm=vManager;
    }

    public void defaultSetup(){

        player.hp=100;
        b.hpNumberLabel.setText(""+player.hp);

        player.currentWeapon = new Knife();
        b.weaponNameLable.setText(player.currentWeapon.name);

        silverRing = 0;
    }

    public void selectPosition(String nextPosition){

        switch(nextPosition){
            case "townGate": townGate(); break;
            case "talkGuard": talkGuard(); break;
            case "attackGuard": attackGuard(); break;
            case "crossRoad": crossRoad(); break;
            case "north": north(); break;
            case "east": east(); break;
            case "west": west(); break;
            case "fight": fight(); break;
            case "playerAttack": playerAttack(); break;
            case "monsterAttack": monsterAttack(); break;
            case "win": win(); break;
            case "lose": lose(); break;
            case "ending": ending(); break;
            case "toTitle": toTitle(); break;
        }


    }

    public void townGate(){

        b.mainTextArea.setText("You are at the gate of the town. \nA guard is standing in front of you. \nWhat do you do?");
        b.c1.setText("Talk to the guard");
        b.c2.setText("Attack the guard");
        b.c3.setText("Leave");
        b.c4.setText("");

        game.nextPosition1 = "talkGuard";
        game.nextPosition2 = "attackGuard";
        game.nextPosition3 = "crossRoad";
        game.nextPosition4 = "";
    }

    public void talkGuard(){

        if (silverRing == 0) {
            b.mainTextArea.setText("Guard: Hello stranger! I have never seen you around. \nI can't let strangers enter the town!");
            b.c1.setText(">");
            b.c2.setText("");
            b.c3.setText("");
            b.c4.setText("");

            game.nextPosition1 = "townGate";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(silverRing==1){
            ending();
        }

    }

    public void attackGuard(){

        b.mainTextArea.setText("Guard: HEY! Don't be stupid!! \n\nThe guard attacked you back and knocked you out. You can't fight the guard so you give up and go further. \n(You receive 10 damage)");
        player.hp= player.hp-10;
        b.hpNumberLabel.setText("" + player.hp);
        b.c1.setText(">");
        b.c2.setText("");
        b.c3.setText("");
        b.c4.setText("");

        game.nextPosition1 = "townGate";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void crossRoad(){

        b.mainTextArea.setText("You are at a crossroad. \nWhich way do you go?");
        b.c1.setText("Go north");
        b.c2.setText("Go east");
        b.c3.setText("Go south(to the town)");
        b.c4.setText("Go west");

        game.nextPosition1 = "north";
        game.nextPosition2 = "east";
        game.nextPosition3 = "townGate";
        game.nextPosition4 = "west";

    }

    public void north(){

        b.mainTextArea.setText("You found a river and you drank some water.\n\n(Your HP recovered by 5)");
        player.hp= player.hp+5;
        b.hpNumberLabel.setText("" + player.hp);
        b.c1.setText("Go south(to the town).");
        b.c2.setText("");
        b.c3.setText("");
        b.c4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void east(){

        b.mainTextArea.setText("You found a farm! The farmer invites you to eat and gives you a sword to protect yourself. \n\n(Your HP recovered by 5)\n(You obtained a SWORD)");
        player.hp= player.hp+5;
        b.hpNumberLabel.setText("" + player.hp);
        player.currentWeapon = new Sword();
        b.weaponNameLable.setText(player.currentWeapon.name);
        b.c1.setText("Go west.");
        b.c2.setText("");
        b.c3.setText("");
        b.c4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void west(){

        int i = new java.util.Random().nextInt(100);
        if(i<90) {
            monster = new Goblin();
        }
        else{
            monster = new Orc();
        }

        b.mainTextArea.setText("You walked into a forest and encountered a "+monster.name+"!");
        b.c1.setText("Fight");
        b.c2.setText("Run");
        b.c3.setText("");
        b.c4.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void fight(){

        b.mainTextArea.setText(monster.name+ ":" + monster.hp + "\n\nWhat do you do?");
        b.c1.setText("Attack");
        b.c2.setText("Run");
        b.c3.setText("");
        b.c4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void playerAttack(){

        int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage);

        b.mainTextArea.setText("You attacked the "+ monster.name +"and gave " + playerDamage + " damage.");

        monster.hp = monster.hp - playerDamage;

        b.c1.setText(">");
        b.c2.setText("");
        b.c3.setText("");
        b.c4.setText("");

        if(monster.hp>0){

            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(monster.hp<1){

            game.nextPosition1 = "win";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }

    public void monsterAttack(){

        int monsterDamage = new java.util.Random().nextInt(monster.attack);

        b.mainTextArea.setText(monster.attackMessage+"\nYou received " + monsterDamage + " damage!" );
        player.hp = player.hp - monsterDamage;
        b.hpNumberLabel.setText("" + player.hp);

        b.c1.setText(">");
        b.c2.setText("");
        b.c3.setText("");
        b.c4.setText("");

        if(player.hp>0){

            game.nextPosition1 = "fight";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(player.hp<1){

            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }

    public void win(){

        b.mainTextArea.setText("You have defeated the " +monster.name+"!\n The monster dropped a ring!\n\n(You obtained a silver ring)");

        silverRing=1;

        b.c1.setText("Go east.");
        b.c2.setText("");
        b.c3.setText("");
        b.c4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void lose(){

        b.mainTextArea.setText("You are dead. :( \n\nGAME OVER!");

        b.c1.setText("To title screen.");
        b.c2.setText("");
        b.c3.setText("");
        b.c4.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void ending(){
        b.mainTextArea.setText("Guard: Oh, you killed the goblin? Thank you, you are a hero!\nWelcome to our town!\n\nTHE END");

        b.c1.setVisible(false);
        b.c2.setVisible(false);
        b.c3.setVisible(false);
        b.c4.setVisible(false);
    }

    public void toTitle(){

        defaultSetup();
        vm.showTitleSCreen();
    }



}

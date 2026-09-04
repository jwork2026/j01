package example;

public class Scene {

    SpiderWeb spiderWeb;
    Human oldman;
    Monster snake;
    Monster scorpion;

    public Scene() {
        spiderWeb = new SpiderWeb();
        oldman = new Human("老爷爷");
        snake = new Monster("蛇精", 200, 10, 20, 2);
        scorpion = new Monster("蝎子精", 500, 50, 50, 2);
    }

    public void play() {
        spiderWeb.open();

        snake.speakTo(oldman, "老人家...");
        oldman.speakTo(snake, "what?...");

        snake.speakTo(oldman, "老人家...");
        scorpion.speakTo(oldman, "这是我们...");
        snake.speakTo(oldman, "Come on...");

        oldman.speakTo(snake, "fxxk...");
        oldman.attack(snake);

        scorpion.bePissed();
        scorpion.move();
        scorpion.speakTo(oldman, "wanna die?");

        scorpion.attack(oldman);
        snake.speakTo(scorpion, "dear...");
        scorpion.rolleyes();

        spiderWeb.close();

    }

    public static void main(String[] args) {
        new Scene().play();
    }

}

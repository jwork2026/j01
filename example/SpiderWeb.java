package example;

public class SpiderWeb extends Being {

    SpiderWeb() {
        super("蜘蛛网");
    }

    public void open() {
        System.out.println(this.name + " open. ");
    };

    public void close() {
        System.out.println(this.name + " close. ");
    };
}

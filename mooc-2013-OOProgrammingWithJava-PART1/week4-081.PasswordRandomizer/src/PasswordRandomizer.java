import java.util.Random;

public class PasswordRandomizer {
    private String pass;
    private int length;
    private Random random;
    private int i;
    private int x;

    public PasswordRandomizer(int length) {
        pass = "";
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        this.i = 0;
        this.pass = "";
        while(this.i < this.length){
            this.x = random.nextInt(26);
            this.pass += "abcdefghijklmnopqrstuvwxyz".charAt(x);
            this.i++;
        }
        return this.pass;
    }
}

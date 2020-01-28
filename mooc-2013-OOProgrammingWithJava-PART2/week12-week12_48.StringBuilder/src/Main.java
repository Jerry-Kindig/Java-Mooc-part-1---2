
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n ");
        int x = 1;
        for(int i: t){
            sb.append(i);
            if(x != t.length){
                sb.append(", ");
            }
            if(x != 1 && x % 4 == 0 && x != t.length){
                sb.append("\n ");
            }
            x++;
        }
        sb.append("\n}");
        return sb.toString();
    }
}

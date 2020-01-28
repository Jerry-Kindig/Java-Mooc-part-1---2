public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i=1; i<=100; i++){
            Thing t = new Thing("Brick", i);
            Suitcase s = new Suitcase(i+1);
            
            s.addThing(t);
            container.addSuitcase(s);
   
        }
    }
}
            
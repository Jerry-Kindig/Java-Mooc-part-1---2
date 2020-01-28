package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        if(weight >= 0){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        final Thing thing = (Thing) obj;
        return this.getName().equals(thing.getName());
    }
    
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

}

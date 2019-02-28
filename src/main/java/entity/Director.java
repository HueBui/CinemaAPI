package entity;

public class Director {
    private int iddirector;
    private String namedirector;

    private Director(){}
    private static Director instance;
    public static Director getInstance(){
        if(instance!=null){
            return new Director();
        }
        return instance;
    }

    public int getIddirector() {
        return iddirector;
    }

    public void setIddirector(int iddirector) {
        this.iddirector = iddirector;
    }

    public String getNamedirector() {
        return namedirector;
    }

    public void setNamedirector(String namedirector) {
        this.namedirector = namedirector;
    }

    public static void setInstance(Director instance) {
        Director.instance = instance;
    }

    @Override
    public String toString() {
        return "Director{" +
                "iddirector=" + iddirector +
                ", namedirector='" + namedirector + '\'' +
                '}';
    }
}

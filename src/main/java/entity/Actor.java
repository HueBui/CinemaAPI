package entity;

public class Actor {
    private int idactor;
    private String name;

    private static Actor instance;

    private Actor() {
    }

    public  static Actor getInstance(){
        if(instance!=null){
            return new Actor();
        }
        return  instance;
    }

    public int getIdactor() {
        return idactor;
    }

    public void setIdactor(int idactor) {
        this.idactor = idactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "idactor=" + idactor +
                ", name='" + name + '\'' +
                '}';
    }
}

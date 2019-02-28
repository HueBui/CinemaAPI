package entity;

public class Cinema {
    private int idcinema;
    private String namecinema;
    private String address;

    private Cinema(){}
    private static Cinema instance;
    public static Cinema getInstance(){
        if(instance!=null){
            return new Cinema();
        }
        return instance;
    }

    public int getIdcinema() {
        return idcinema;
    }

    public void setIdcinema(int idcinema) {
        this.idcinema = idcinema;
    }

    public String getNamecinema() {
        return namecinema;
    }

    public void setNamecinema(String namecinema) {
        this.namecinema = namecinema;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void setInstance(Cinema instance) {
        Cinema.instance = instance;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "idcinema=" + idcinema +
                ", namecinema='" + namecinema + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

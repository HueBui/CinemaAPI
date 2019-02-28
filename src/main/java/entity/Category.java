package entity;

public class Category {
    private int idcategory;
    private String type;

    private Category(){}
    private static Category instance;
    private static Category getInstance(){
        if(instance!=null){
            return new Category();
        }
        return instance;
    }

    public int getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(int idcategory) {
        this.idcategory = idcategory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void setInstance(Category instance) {
        Category.instance = instance;
    }

    @Override
    public String toString() {
        return "Category{" +
                "idcategory=" + idcategory +
                ", type='" + type + '\'' +
                '}';
    }
}

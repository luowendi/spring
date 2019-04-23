package luo.demo.pojo;

public class Blog {

     private int id;

     private String name;

     private String telephonenumber;

     private String address;

     private int price;

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

}

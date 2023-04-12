package serial;

import java.io.Serializable;

public class Human implements Serializable {

    transient long serialVersionUID = 2;

    private String name;
    private String phone;
    private boolean isIphone;

    private String motherName;

    public Human(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", isIphone=" + isIphone +
                '}';
    }
}

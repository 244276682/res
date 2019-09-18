package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Class {
    private String name;
    private int num;

    public Class(String name, int num) {
        this.name = name;
        this.num = num;
        System.out.print("nihao");
    }
    public Class(){
        System.out.println("hhh");
    }

    public String getName() {
        return name;
    }

    @Value("132")
    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import serial.Human;

public class JsonTest {

    public static void main(String[] args) {
        Human olda = new Human("Olda", "088789878");

        Gson gson = new Gson();
        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();

        String s = gson2.toJson(olda);
        System.out.println(s);

        Human human = gson2.fromJson(s, Human.class);
        System.out.println("human = " + human);


    }
}

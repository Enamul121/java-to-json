package main.java;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertObjectToJson {

    public static void main(String[] args){
        User user = createUserData();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();

        String json = gson.toJson(user);
        System.out.println(json);
    }

    private static User createUserData(){
        User user = new User();
        user.setName("Test");
        user.setAge(30);
        user.setDescription("Note Test");

        return user;
    }
}
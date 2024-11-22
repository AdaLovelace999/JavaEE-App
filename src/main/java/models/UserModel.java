package models;

import entities.User;
import java.util.ArrayList;
import java.util.List;


public class UserModel {
    private static final UserModel userModelInstance = new UserModel();
    private final List<User> userModels;

    public static UserModel getInstance() {
        return userModelInstance;
    }

    private UserModel() {
        userModels = new ArrayList<>();
    }

    public void add(User user) {
        userModels.add(user);
    }
    public void delete(User user) {
        userModels.remove(user);
    }
    public void update(User user){
        int index = userModels.indexOf(user);
        userModels.set(index, user);
    }
    public List<User> listUsers(){
        return userModels;
    }
    public User find(int id){
        List<User> userList = UserModel.getInstance().listUsers();
        User user = null;
        for (User u : userList){
             if (u.getId() == id)
                 user = u;
        }
        return user;
    }
}

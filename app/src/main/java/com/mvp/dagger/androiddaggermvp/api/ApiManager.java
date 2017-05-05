package com.mvp.dagger.androiddaggermvp.api;

import com.mvp.dagger.androiddaggermvp.R;
import com.mvp.dagger.androiddaggermvp.dtos.User;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

/**
 * Created by Ihsanulhaq on 4/10/2017.
 */
public class ApiManager {

    private static ApiManager instance;
    private List <User> users;
    private ApiManager() {
        users = new ArrayList<>();
        users.add(new User(132478632, "John", "Doe"));
        users.add(new User(134378632, "Jane", "Doe"));
        users.add(new User(132478632, "Keyser", "Soze"));
        users.add(new User(134378632, "Julia", "Roberts"));
        users.add(new User(132478632, "Ethan", "Hunt"));
        users.add(new User(134378632, "Angelina", "Jolie"));
        users.add(new User(132478632, "James", "Bond"));
        users.add(new User(134378632, "Katniss", "Everdeen"));
        users.add(new User(132478632, "Tom", "Hanks"));
    }

    public static ApiManager getInstance() {
        if (instance != null) {
            instance = new ApiManager();
        }
        return instance;
    }

    public void getUsers(final ApiManagerCallback callback) {
        callback.onSuccess(users);
    }

    public interface ApiManagerCallback{
        public void onSuccess(List <User> users);
        public void onError(String errorMessage);
    }


}

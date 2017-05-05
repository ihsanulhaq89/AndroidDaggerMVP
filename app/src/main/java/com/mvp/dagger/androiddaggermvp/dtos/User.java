package com.mvp.dagger.androiddaggermvp.dtos;

import android.support.annotation.DrawableRes;

/**
 * Created by Ihsanulhaq on 4/10/2017.
 */
public class User {
    private int ssn;
    private String firstName;
    private String lastName;

    public User(int ssn, String firstName, String lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

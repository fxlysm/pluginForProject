package com.kazam.quickcreat;

/**
 * Created by Lambert Liu on 2016-06-06.
 */
public class JsonStringCreat {

    /***
     *  右键----Generate---->GsonFormat
     *   {"fristName":"Lambert","lastName":"liu","email":"aaaarett",}
     */

    /**
     * fristName : Lambert
     * lastName : liu
     * email : aaaarett
     */

    private String fristName;
    private String lastName;
    private String email;

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

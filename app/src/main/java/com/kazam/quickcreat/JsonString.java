package com.kazam.quickcreat;

import java.util.List;

/**
 * Created by Lambert Liu on 2016-06-06.
 */
public class JsonString {


    /**
     * fristName : alice
     * lastName : pan
     * email : aaaa
     */

    private List<PeopleBean> people;

    public List<PeopleBean> getPeople() {
        return people;
    }

    public void setPeople(List<PeopleBean> people) {
        this.people = people;
    }

    public static class PeopleBean {
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


//    右键----Generate---->GsonFormat
//    {
//        "people":[
//        {"fristName":"alice","lastName":"pan","email":"aaaa"},
//        {"fristName":"janny","lastName":"zhang","email":"bbbb"},
//        {"fristName":"qrant","lastName":"qiu","email":"cccc"}
//        ]
//    }

//
//    {"people": [
//        {
//            "fristName": "alice",
//                "lastName": "pan",
//                "email": "aaaa"
//        },
//        {
//            "fristName": "janny",
//                "lastName": "zhang",
//                "email": "bbbb"
//        },
//        {
//            "fristName": "qrant",
//                "lastName": "qiu",
//                "email": "cccc"
//        }
//        ]}



}

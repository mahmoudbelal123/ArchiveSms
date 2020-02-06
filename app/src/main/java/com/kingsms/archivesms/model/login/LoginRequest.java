package com.kingsms.archivesms.model.login;

import com.google.gson.annotations.SerializedName;

public class LoginRequest {
    @SerializedName("phone")
    private String phone;


    public String getFirebase_token() {
        return firebase_token;
    }

    public void setFirebase_token(String firebase_token) {
        this.firebase_token = firebase_token;
    }

    @SerializedName("firebase_token")
    private String firebase_token;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}

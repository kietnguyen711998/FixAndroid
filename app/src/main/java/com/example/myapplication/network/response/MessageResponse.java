package com.example.myapplication.network.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = false)
@Data
public class MessageResponse {
    @SerializedName("message")
    @Expose
    private String message;
}

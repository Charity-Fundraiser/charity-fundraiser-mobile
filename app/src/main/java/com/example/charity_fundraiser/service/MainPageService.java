package com.example.charity_fundraiser.service;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainPageService {

    public JSONArray getFundraiserData () throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "Fundraiser for Bob");
        jsonObject.put("final_amount","30000");
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jsonObject);
        return jsonArray;
    }

}
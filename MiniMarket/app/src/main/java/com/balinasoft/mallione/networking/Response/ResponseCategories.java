package com.balinasoft.mallione.networking.Response;

import com.balinasoft.mallione.models.Category;

import java.util.ArrayList;

/**
 * Created by Microsoft on 31.05.2016.
 */
public class ResponseCategories extends BaseResponse {
    public ArrayList<Category> getResult() {
        return result;
    }

    public void setResult(ArrayList<Category> result) {
        this.result = result;
    }

    ArrayList<Category> result;
}

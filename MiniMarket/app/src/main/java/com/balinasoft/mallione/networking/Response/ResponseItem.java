package com.balinasoft.mallione.networking.Response;

import com.balinasoft.mallione.models.ProductItems.FullProductItem;

/**
 * Created by Microsoft on 31.05.2016.
 */
public class ResponseItem extends BaseResponse {
    public FullProductItem getResult() {
        return result;
    }

    public void setResult(FullProductItem result) {
        this.result = result;
    }

    FullProductItem result;
}

package com.example.magic_shop;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class DeliveryAddressPlusRequest extends StringRequest {

    final static private String URL = "http://210.117.175.207:8976/deliveryAddressPlus.php";
    private final Map<String, String> map;

    public DeliveryAddressPlusRequest(String userID, String deliveryAddressName, String recipient,
                                      String phoneNumber, String address, String addressDetail, String deliveryRequest,
                                      String isDefaultDeliveryAddress, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, URL, listener, errorListener);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("deliveryAddressName", deliveryAddressName);
        map.put("recipient", recipient);
        map.put("phoneNumber", phoneNumber);
        map.put("address", address);
        map.put("addressDetail", addressDetail);
        map.put("deliveryRequest", deliveryRequest);
        map.put("defaultDeliveryAddress", isDefaultDeliveryAddress);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}

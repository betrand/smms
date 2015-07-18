package com.uptitek.call.mobile.users;

import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author bu_000
 */
public class UsersService {

    public static List postAndGetFromCallService(String tag) {

        try {
            String user = "5267768822ee624d48fce15ec5ca79cbd602cb7f4c2157a516556991f22ef8c7b5ef7b18d1ff41c59370efb0858651d44a936c11b7b144c48fe04df3c6a3e8da";
            String client = "59a94a0ac0f75200d1477d0f158a23d7feb08a2db16d21233b36fc8fda1a958c1be52b439f7957733bd65950cdfa7918b2f76a480ed01bb6e4edf4614eb8a708";
            String resource = "users/list/";
            //String API = "http://localhost/calls/api/";
            String API = "http://calls.uptitek.com/calls/api/";
            ConnectionRequest req = new ConnectionRequest();
            req.setUrl(API + resource + client + "/" + user);
            System.out.println("Url: " + req.getUrl());
            req.setPost(false);
            //req.addArgument("tagmode", "any");
            //req.addArgument("tags", tag);
            //req.addArgument("format", "json");
            req.setContentType("application/json");
            req.addRequestHeader("Accept", "application/json");

            NetworkManager.getInstance().addToQueueAndWait(req);
            System.out.println("Req Returned ");
            byte[] data = req.getResponseData();
            System.out.println("Byte Data Returned");
            if (data == null) {
                System.out.println("Byte Data Returned Null");
                throw new IOException("Network Err");
            }
            System.out.println("Returned Valid Byte Data ");
            JSONParser parser = new JSONParser();
            System.out.println("Created parser");
            Map response = parser.parseJSON(new InputStreamReader(new ByteArrayInputStream(data), "UTF-8"));
            System.out.println("res" + response.values());
            List items = null;
            for (Object key : response.keySet()) {
                items = (List) response.get(key);
                //System.out.println("Dealing with: " + response.get(key));
            }
            //List items = (List) response.get("accountStatus");
            System.out.println("Retrieved Items " + items);
            return items;
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
        return null;
    }

}

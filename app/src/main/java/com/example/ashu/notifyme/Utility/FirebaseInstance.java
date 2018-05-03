package com.example.ashu.notifyme.Utility;

import android.util.Log;

import com.example.ashu.notifyme.Helper;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstance extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        String refreshedToken= FirebaseInstanceId.getInstance().getToken();
        Log.d("My Token",""+refreshedToken);
        Helper.firebaseToken=refreshedToken;
    }
}

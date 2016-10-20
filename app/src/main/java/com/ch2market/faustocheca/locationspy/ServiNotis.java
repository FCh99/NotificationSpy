package com.ch2market.faustocheca.locationspy;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/*
 * Created by faustocheca on 17/10/16.
 */

public class ServiNotis extends NotificationListenerService {



    public ServiNotis() {
    }


    //  ?????   Hace falta ???
    @Override
    public void onListenerConnected() {
        super.onListenerConnected();
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        super.onNotificationPosted(sbn);
        Notification notification = sbn.getNotification();
        Bundle bundle = notification.extras;
        String notificationString = bundle2string (bundle);



        Intent intent = new Intent(this, LastActivity.class);
        intent.putExtra("noti",notificationString);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


    }



    private String bundle2string(Bundle bundle) {
        String string;
        string = "Inicio Bundle {";

        for (String key:bundle.keySet()) {
            string+=""+key+"==>"+bundle.get(key)+";";

        }
        string += " }FIN Bundle";

        return string;





    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        super.onNotificationRemoved(sbn);
    }
}



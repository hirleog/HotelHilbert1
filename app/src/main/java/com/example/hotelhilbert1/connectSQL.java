package com.example.hotelhilbert1;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectSQL {

    Connection con;

    @SuppressLint("NewApi")
    public Connection connectClass() {
        String ip = "192.168.15.5", port = "1433", db = "HotelHilbert", username = "guihirle", password = "481516";

        StrictMode.ThreadPolicy a = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(a);
        String ConnectURL = null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectURL = "jdbc:jtds:sqlserver://" + ip + ":" + port + ";" + ";databasename=" + db + ";user=" + username + ";"+"password=" + password + ";";
            con = DriverManager.getConnection(ConnectURL);
        } catch (Exception e) {
            Log.e("Erros is", e.getMessage());
        }
        return con;
    }
}

package com.example.submissiondicoding;

import android.os.Parcel;
import android.os.Parcelable;

public class Gadget  {

    private String proname;
    private String proby;
    private String prodate;
    private String prodes;
    private String prophoto;
    private String proharga;

    public String getProharga() {
        return proharga;
    }

    public void setProharga(String proharga) {
        this.proharga = proharga;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProby() {
        return proby;
    }

    public void setProby(String proby) {
        this.proby = proby;
    }

    public String getProdate() {
        return prodate;
    }

    public void setProdate(String prodate) {
        this.prodate = prodate;
    }

    public String getProdes() {
        return prodes;
    }

    public void setProdes(String prodes) {
        this.prodes = prodes;
    }

    public String getProphoto() {
        return prophoto;
    }

    public void setProphoto(String prophoto) {
        this.prophoto = prophoto;
    }
}

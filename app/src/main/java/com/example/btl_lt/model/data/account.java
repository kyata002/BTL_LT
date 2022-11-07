package com.example.btl_lt.model.data;

public class account {
    String sTENDN,sMKDN,sEMAIL;

    public account() {
    }

    public account(String sTENDN, String sMKDN, String sEMAIL) {
        this.sTENDN = sTENDN;
        this.sMKDN = sMKDN;
        this.sEMAIL = sEMAIL;
    }

    public String getsTENDN() {
        return sTENDN;
    }

    public void setsTENDN(String sTENDN) {
        this.sTENDN = sTENDN;
    }

    public String getsMKDN() {
        return sMKDN;
    }

    public void setsMKDN(String sMKDN) {
        this.sMKDN = sMKDN;
    }

    public String getsEMAIL() {
        return sEMAIL;
    }

    public void setsEMAIL(String sEMAIL) {
        this.sEMAIL = sEMAIL;
    }
}

package com.example.btl_lt.model.data;

public class novel {
    String sTenTruyen,sImage,sNoiDung;

    public novel() {
    }

    public novel(String sTenTruyen, String sImage, String sNoiDung) {
        this.sTenTruyen = sTenTruyen;
        this.sImage = sImage;
        this.sNoiDung = sNoiDung;
    }

    public String getsTenTruyen() {
        return sTenTruyen;
    }

    public void setsTenTruyen(String sTenTruyen) {
        this.sTenTruyen = sTenTruyen;
    }

    public String getsImage() {
        return sImage;
    }

    public void setsImage(String sImage) {
        this.sImage = sImage;
    }

    public String getsNoiDung() {
        return sNoiDung;
    }

    public void setsNoiDung(String sNoiDung) {
        this.sNoiDung = sNoiDung;
    }
}

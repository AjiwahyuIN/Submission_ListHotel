package com.aji.submission;

import android.os.Parcel;
import android.os.Parcelable;

public class Hotel implements Parcelable {
    private String nama;
    private String detail;
    private String deskripsi;
    private int photo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.detail);
        dest.writeString(this.deskripsi);
        dest.writeInt(this.photo);
    }

    public Hotel() {
    }

    protected Hotel(Parcel in) {
        this.nama = in.readString();
        this.detail = in.readString();
        this.deskripsi = in.readString();
        this.photo = in.readInt();
    }

    public static final Parcelable.Creator<Hotel> CREATOR = new Parcelable.Creator<Hotel>() {
        @Override
        public Hotel createFromParcel(Parcel source) {
            return new Hotel(source);
        }

        @Override
        public Hotel[] newArray(int size) {
            return new Hotel[size];
        }
    };
}

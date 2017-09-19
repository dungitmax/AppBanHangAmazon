package com.ltd.tandung.amazon_app.Model;

/**
 * Created by MrLinh on 9/17/2017.
 */

public class DemoProduct {
    private String ten;
    private String hang;
    private String ktmh;
    private String rom;
    private String ram;
    private String pin;
    private char des;

    public DemoProduct() {
    }

    public DemoProduct(String ten, String hang, String ktmh, String rom, String ram, String pin, char des) {
        this.ten = ten;
        this.hang = hang;
        this.ktmh = ktmh;
        this.rom = rom;
        this.ram = ram;
        this.pin = pin;
        this.des = des;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getKtmh() {
        return ktmh;
    }

    public void setKtmh(String ktmh) {
        this.ktmh = ktmh;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public char getDes() {
        return des;
    }

    public void setDes(char des) {
        this.des = des;
    }
}



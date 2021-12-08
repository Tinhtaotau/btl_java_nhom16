/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdtt;

/**
 *
 * @author Admin
 */
public class TinhTrangHang {
    String maH, tenH;
    int soLgBanDau, soLgDung, soLgConLai;

    public TinhTrangHang() {
    }

    public TinhTrangHang(String maH, String tenH, int soLgBanDau, int soLgDung, int soLgConLai) {
        this.maH = maH;
        this.tenH = tenH;
        this.soLgBanDau = soLgBanDau;
        this.soLgDung = soLgDung;
        this.soLgConLai = soLgConLai;
    }

    public String getMaH() {
        return maH;
    }

    public void setMaH(String maH) {
        this.maH = maH;
    }

    public String getTenH() {
        return tenH;
    }

    public void setTenH(String tenH) {
        this.tenH = tenH;
    }

    public int getSoLgBanDau() {
        return soLgBanDau;
    }

    public void setSoLgBanDau(int soLgBanDau) {
        this.soLgBanDau = soLgBanDau;
    }

    public int getSoLgDung() {
        return soLgDung;
    }

    public void setSoLgDung(int soLgDung) {
        this.soLgDung = soLgDung;
    }

    public int getSoLgConLai() {
        return soLgConLai;
    }

    public void setSoLgConLai(int soLgConLai) {
        this.soLgConLai = soLgConLai;
    }
    
    public int tinh(){
        return soLgConLai = soLgBanDau-soLgDung;
    }
}

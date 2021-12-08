/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdtt;

/**
 *
 * @author bvc
 */
public class HocVien {
    String maHV,tenHV,gioiTinh,ngaySinh,SDt,diaChi,maCLB;

    public HocVien(String maHV, String tenHV, String gioiTinh, String ngaySinh, String SDt, String diaChi, String maCLB) {
        this.maHV = maHV;
        this.tenHV = tenHV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.SDt = SDt;
        this.diaChi = diaChi;
        this.maCLB = maCLB;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSDt() {
        return SDt;
    }

    public void setSDt(String SDt) {
        this.SDt = SDt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public void setMaCLB(String maCLB) {
        this.maCLB = maCLB;
    }
    
}

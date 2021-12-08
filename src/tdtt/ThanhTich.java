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
public class ThanhTich {
    String maTT,maHV,maCLB,giai,kiThi,nam;

    public ThanhTich(String maTT, String maHV, String maCLB, String giai, String kiThi, String nam) {
        this.maTT = maTT;
        this.maHV = maHV;
        this.maCLB = maCLB;
        this.giai = giai;
        this.kiThi = kiThi;
        this.nam = nam;
    }

    public String getMaTT() {
        return maTT;
    }

    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }

    

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public void setMaCLB(String maCLB) {
        this.maCLB = maCLB;
    }

    public String getGiai() {
        return giai;
    }

    public void setGiai(String giai) {
        this.giai = giai;
    }

    public String getKiThi() {
        return kiThi;
    }

    public void setKiThi(String kiThi) {
        this.kiThi = kiThi;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }
    
}

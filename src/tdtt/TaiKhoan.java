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
public class TaiKhoan {
    String MaNV;
    String tenDN;
    String mK;

    public TaiKhoan(String MaNV, String tenDN, String mK) {
        this.MaNV = MaNV;
        this.tenDN = tenDN;
        this.mK = mK;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getmK() {
        return mK;
    }

    public void setmK(String mK) {
        this.mK = mK;
    }
    
}

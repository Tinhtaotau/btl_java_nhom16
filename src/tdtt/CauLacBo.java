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
public class CauLacBo {
    String maCLB,tenCLB,maNV;

    public CauLacBo(String maCLB, String tenCLB, String maNV) {
        this.maCLB = maCLB;
        this.tenCLB = tenCLB;
        this.maNV = maNV;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public void setMaCLB(String maCLB) {
        this.maCLB = maCLB;
    }

    public String getTenCLB() {
        return tenCLB;
    }

    public void setTenCLB(String tenCLB) {
        this.tenCLB = tenCLB;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }
    
}

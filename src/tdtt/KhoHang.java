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
public class KhoHang {
    private String maH, tenH, maNV;
    private int soLg;

    public KhoHang() {
    }

    public KhoHang(String maH, String tenH, String maNV, int soLg) {
        this.maH = maH;
        this.tenH = tenH;
        this.maNV = maNV;
        this.soLg = soLg;
    }

    public String getMaH() {
        return maH;
    }

    public void setMaH(String maH) throws Exception{
        if(maH.trim().equals(""))
            throw new Exception("Mã hàng không được trống!");
        this.maH = maH;
    }

    public String getTenH() {
        return tenH;
    }

    public void setTenH(String tenH) throws Exception{
        if(tenH.trim().equals(""))
            throw new Exception("Tên hàng không được trống!");
        this.tenH = tenH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) throws Exception{
        if(maNV.trim().equals(""))
            throw new Exception("Mã nhân viên không được trống!");
        this.maNV = maNV;
    }

    public int getSoLg() {
        return soLg;
    }

    public void setSoLg(int soLg) {
        this.soLg = soLg;
    }

    
    
    
}

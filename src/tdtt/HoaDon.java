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
public class HoaDon {
    private String MaHD, NgayLap, MaNV, TenSanTap, TenKH;
    private int TGThue;
    private float DonGia,thanhTien;

    public HoaDon() {
    }

    public HoaDon(String MaHD, String NgayLap, String MaNV, String TenSanTap, String TenKH, int TGThue, float DonGia, float thanhTien) {
        this.MaHD = MaHD;
        this.NgayLap = NgayLap;
        this.MaNV = MaNV;
        this.TenSanTap = TenSanTap;
        this.TenKH = TenKH;
        this.TGThue = TGThue;
        this.DonGia = DonGia;
        this.thanhTien = thanhTien;
    }


    

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) throws Exception{
        if(MaHD.trim().equals(""))
            throw new Exception("Mã hóa đơn không được trống!");
        this.MaHD = MaHD;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) throws Exception{
        if(NgayLap.trim().equals(""))
            throw new Exception("Ngày lập không được trống!");
        this.NgayLap = NgayLap;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) throws Exception{
        if(MaNV.trim().equals(""))
            throw new Exception("Mã nhân viên không được trống!");
        this.MaNV = MaNV;
    }

    public String getTenSanTap() {
        return TenSanTap;
    }

    public void setTenSanTap(String TenSanTap) throws Exception{
        if(TenSanTap.trim().equals(""))
            throw new Exception("Tên sân tập không được trống!");
        this.TenSanTap = TenSanTap;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) throws Exception{
        if(TenKH.trim().equals(""))
            throw new Exception("Tên khách hàng không được trống!");
        this.TenKH = TenKH;
    }

    public int getTGThue() {
        return TGThue;
    }

    public void setTGThue(int TGThue) {
        this.TGThue = TGThue;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    
    public float TongTien(){
        return TGThue*DonGia;
    }
    
}

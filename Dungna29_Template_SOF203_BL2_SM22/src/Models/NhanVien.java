/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Dungna89
 */
public class NhanVien {
  private String id;
  private String ma;
  private String ten;
  private String tenDem;
  private String ho;
  private String gioiTinh;
  private String ngaySinh;
  private String diaChi;
  private String soDienThoai;

  public NhanVien() {
  }

  public NhanVien(String id, String ma, String ten, String tenDem, String ho, String gioiTinh, String ngaySinh, String diaChi, String soDienThoai) {
    this.id = id;
    this.ma = ma;
    this.ten = ten;
    this.tenDem = tenDem;
    this.ho = ho;
    this.gioiTinh = gioiTinh;
    this.ngaySinh = ngaySinh;
    this.diaChi = diaChi;
    this.soDienThoai = soDienThoai;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMa() {
    return ma;
  }

  public void setMa(String ma) {
    this.ma = ma;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public String getTenDem() {
    return tenDem;
  }

  public void setTenDem(String tenDem) {
    this.tenDem = tenDem;
  }

  public String getHo() {
    return ho;
  }

  public void setHo(String ho) {
    this.ho = ho;
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

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getSoDienThoai() {
    return soDienThoai;
  }

  public void setSoDienThoai(String soDienThoai) {
    this.soDienThoai = soDienThoai;
  }

  @Override
  public String toString() {
    return "NhanVien{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", tenDem=" + tenDem + ", ho=" + ho + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + '}';
  }
  
}

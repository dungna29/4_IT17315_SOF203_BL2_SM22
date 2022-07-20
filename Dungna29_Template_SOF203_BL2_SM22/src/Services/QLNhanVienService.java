/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.ChucVu;
import Repositories.ChucVuRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dungna89
 */
public class QLNhanVienService {

  private List<ChucVu> _lstChucVus;
  private ChucVuRepository _ChucVuRepository;

  public QLNhanVienService() {
    _lstChucVus = new ArrayList<>();
    _ChucVuRepository = new ChucVuRepository();
    //Khi mà form load thì sẽ load data từ DB
    if (!_ChucVuRepository.GetAll().isEmpty()) {
      _lstChucVus = _ChucVuRepository.GetAll();
    }
  }

  //Phương thức lấy dữ liệu
  public List<ChucVu> GetAll() {
    return _lstChucVus;
  }
  public List<ChucVu> GetAll(String input) {//Phương thức nạp chồng kết hợp tìm kiếm gần đúng
    if (input == null) {
      return _lstChucVus;
    }
    List<ChucVu> tempChucVus = new ArrayList<>();
    for (ChucVu x : _lstChucVus) {
      if (x.getMa().toLowerCase().contains(input.toLowerCase()) || x.getTen().toLowerCase().contains(input.toLowerCase())) {
        tempChucVus.add(x);
      }
    }
    return tempChucVus;
  }

  //Phương thức chọc vào DB đổ lại dữ liệu ra List
  private void GetAllFromDB() {
    if (!_ChucVuRepository.GetAll().isEmpty()) {
      _lstChucVus = _ChucVuRepository.GetAll();
    }
  }

  public String Add(ChucVu cv) {
    if (_ChucVuRepository.Add(cv)) {
      GetAllFromDB();//Mỗi lần thêm thành công thì cần truy vấn lại vào CSDl
      return "Thêm thành công";
    }
    return "Không thêm được";
  }

  public String Delete(ChucVu cv) {
    if (_ChucVuRepository.Delete(cv)) {
      GetAllFromDB();//Mỗi lần xóa thành công thì cần truy vấn lại vào CSDl
      return "Xóa thành công";
    }
    return "Xóa thêm được";
  }

  public String Update(ChucVu cv) {
    if (_ChucVuRepository.Update(cv)) {
      GetAllFromDB();//Mỗi lần sửa thành công thì cần truy vấn lại vào CSDl
      return "Sửa thành công";
    }
    return "Sửa thêm được";
  }
  //Các chức năng mà giao diện cần

}

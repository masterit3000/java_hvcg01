/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.model.dao;

import demojdbcmvc.model.IDAO;
import demojdbcmvc.model.entity.SinhVien;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SinhVienDAO implements IDAO<SinhVien, Integer> {

    @Override
    public List<SinhVien> getAll() {
        return null;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien addNew(SinhVien sv) {
        return sv;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien updateByMa(SinhVien sv) {
        return sv;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteByMa(SinhVien sv) {
        return true;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien findByMa(Integer ma) {

        return null;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

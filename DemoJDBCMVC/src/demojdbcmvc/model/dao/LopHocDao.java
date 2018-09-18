/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.model.dao;

import demojdbcmvc.model.IDAO;
import demojdbcmvc.model.entity.LopHoc;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LopHocDao implements  IDAO<LopHoc, Integer>{

    @Override
    public List<LopHoc> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LopHoc addNew(LopHoc sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LopHoc updateByMa(LopHoc sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteByMa(LopHoc sv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LopHoc findByMa(Integer ma) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

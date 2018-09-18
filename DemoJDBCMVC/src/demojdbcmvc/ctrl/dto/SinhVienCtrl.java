/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.ctrl.dto;

import demojdbcmvc.model.IDAO;
import demojdbcmvc.model.dao.SinhVienDAO;
import demojdbcmvc.model.entity.SinhVien;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SinhVienCtrl implements IController<SinhVienDTO, Integer> {

    private IDAO<SinhVien, Integer> dao;
    IMapper<SinhVienDTO, SinhVien> svmap;

    public SinhVienCtrl() {
        dao = new SinhVienDAO();
        svmap = new SinhVienMapperrrrrr();
    }

    @Override
    public SinhVienDTO themMoi(SinhVienDTO t) {

//        chuyen DTO -> entity. goi dao them moi
        SinhVien sventity = svmap.dTOtoEntity(t);
        SinhVien addNew = dao.addNew(sventity);
        if (addNew != null) {
            SinhVienDTO entityToDTO = svmap.entityToDTO(addNew);
            return entityToDTO;
        }
        return null;
    }

    @Override
    public SinhVienDTO capNhat(SinhVienDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SinhVienDTO> hienTatCa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

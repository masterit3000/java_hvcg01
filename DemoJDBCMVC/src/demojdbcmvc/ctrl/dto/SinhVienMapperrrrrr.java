/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.ctrl.dto;

import demojdbcmvc.model.entity.SinhVien;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SinhVienMapperrrrrr implements IMapper<SinhVienDTO, SinhVien> {

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public SinhVien dTOtoEntity(SinhVienDTO d) {
        SinhVien sv = new SinhVien();
        sv.setMa(d.getMa());
        sv.setTen(d.getTen());
        try {
            sv.setNgaysinh(format.parse(d.getNgaysinh()));

            //con j chuyen not
        } catch (ParseException ex) {
            Logger.getLogger(SinhVienMapperrrrrr.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sv;
    }

    @Override
    public SinhVienDTO entityToDTO(SinhVien d) {
        //code sau
        return null;
    }

}

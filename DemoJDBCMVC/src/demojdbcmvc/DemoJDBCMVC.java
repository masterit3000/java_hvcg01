/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc;

import demojdbcmvc.ctrl.dto.IController;
import demojdbcmvc.ctrl.dto.Result;
import demojdbcmvc.ctrl.dto.SinhVienCtrl;
import demojdbcmvc.ctrl.dto.SinhVienDTO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoJDBCMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

//        IController<SinhVienDTO, Integer> controller = new SinhVienCtrl();
            IController<SinhVienDTO, Integer> controller
                    = (IController<SinhVienDTO, Integer>) Class.forName("demojdbcmvc.ctrl.dto.SinhVienCtrl").newInstance();

            SinhVienDTO themMoi = controller.themMoi(new SinhVienDTO(2, "aaa", "4/4/1990", 1));
            
            Result<SinhVienDTO> result = new Result<>();
            result.setCode(1);
            result.setData(themMoi);//tra ve cho view , cho client
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoJDBCMVC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DemoJDBCMVC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DemoJDBCMVC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

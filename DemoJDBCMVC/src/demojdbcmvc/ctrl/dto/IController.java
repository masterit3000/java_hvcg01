/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.ctrl.dto;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IController<T, K> {

    public T themMoi(T t);

    public T capNhat(T t);

    public List<T> hienTatCa();

}

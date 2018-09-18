/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.model;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface IDAO<T, K> {  //T se la cac class SinhVien, LopHOc

    public List<T> getAll();

    public T addNew(T sv);

    public T updateByMa(T sv);

    public boolean deleteByMa(T sv);

    public T findByMa(K ma);

}

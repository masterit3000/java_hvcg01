/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbcmvc.ctrl.dto;

/**
 *
 * @author Admin
 */
public interface IMapper<D, E> {

    E dTOtoEntity(D d);

    D entityToDTO(E d);

}

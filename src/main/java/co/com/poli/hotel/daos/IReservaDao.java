/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.hotel.daos;

import co.com.poli.hotel.models.Reserva;

/**
 *
 * @author sala305
 */
public interface IReservaDao {
    
    public boolean insertar(Reserva reserva);
    public boolean existe(Reserva reserva);
    
}

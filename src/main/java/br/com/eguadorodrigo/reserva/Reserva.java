package br.com.eguadorodrigo.reserva;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import br.com.eguadorodrigo.cliente.Cliente;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Reserva extends PanacheEntity {
    
    @ManyToOne(fetch = FetchType.LAZY)
    public Cliente cliente;
    
}

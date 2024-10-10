package persistencia;

import java.util.logging.Level;
import java.util.logging.Logger;
import logica.cancha;
import logica.cliente;
import logica.horario;
import logica.reserva;
import logica.torneo;
import logica.usuario;
import persistencia.exceptions.NonexistentEntityException;

public class controladoraPersistencia {
    canchaJpaController canchaJpa = new canchaJpaController();
    clienteJpaController clienteJpa = new clienteJpaController();
    horarioJpaController horarioJpa = new horarioJpaController();
    reservaJpaController reservaJpa = new reservaJpaController();
    torneoJpaController torneoJpa = new torneoJpaController();
    usuarioJpaController usuarioJpa = new usuarioJpaController();
    
    //CRUD Usuario
    
    public void crearUsuario (usuario usuarioo) {
        usuarioJpa.create(usuarioo);
    }
    
    public void eliminarUsuario(int id) {
        try {
            usuarioJpa.destroy(id);   
        } catch (NonexistentEntityException e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
   
    }

    public void modificarUsuario(usuario usuarioo) {
        try {
            usuarioJpa.edit(usuarioo);
        } catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    
    }
    
    //CRUD Torneo
    public void crearTorneo(torneo torneo) {
        torneoJpa.create(torneo);
    }

    public void eliminarTorneo(int id) {
        try {
            torneoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void modificarTorneo(torneo torneo) {
        try {
            torneoJpa.edit(torneo);
        } catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    //CRUD Cliente
    public void crearCliente(cliente cliente) {
      clienteJpa.create(cliente);
    }
    
    public void modificarCliente(cliente cliente){
        try { 
            clienteJpa.edit(cliente);
    } catch (Exception ex){
        Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public void eliminarCliente(int id) {
       try {
           clienteJpa.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    }   
    
    //CRUD Cancha
    public void crearCancha(cancha cancha) {
      canchaJpa.create(cancha);
    }
    
    public void modificarCancha(cancha cancha){
        try { 
            canchaJpa.edit(cancha);
    } catch (Exception ex){
        Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    public void eliminarCancha(int id) {
       try {
           canchaJpa.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
       }
    } 
    
    
    //CRUD Horario
    public void crearHorario(horario horario) {
      horarioJpa.create(horario);
    }

    public void eliminarHorario(int id) {
          try {
            horarioJpa.destroy(id);   
        } catch (NonexistentEntityException e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
      }

    public void modificarHorario(horario horario) {
        try {
                  horarioJpa.edit(horario);
              } catch (Exception e) {
                  Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
              }
          }
    
    
    //CRUD Reserva
    public void crearReserva(reserva reserva) {
        reservaJpa.create(reserva);
    }

    public void eliminarReserva(int id) {
           try {
            reservaJpa.destroy(id);   
        } catch (NonexistentEntityException e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }

 
    public void modificarReserva(reserva reserva) {
    try {
            reservaJpa.edit(reserva);
        } catch (Exception e) {
            Logger.getLogger(controladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}

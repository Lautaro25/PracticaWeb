package logica;

import persistencia.controladoraPersistencia;


public class controladoraLogica {
        
    controladoraPersistencia controlPersis = new controladoraPersistencia();
    
    
    //CRUD Usuario
    public void crearUsuario(usuario usuarioo){
        controlPersis.crearUsuario(usuarioo);
    }
    
    public void eliminarUsuario(int id){
        controlPersis.eliminarUsuario(id);
    }
    
    public void modificarUsuario(usuario usuarioo){
        controlPersis.modificarUsuario(usuarioo);    
    }
    
    
    //CRUD Torneo    
    public void crearToreno(torneo torneo){
        controlPersis.crearTorneo(torneo);
    }
    
    public void eliminarTorneo(int id){
        controlPersis.eliminarTorneo(id);
    }
    
    public void modificarTorneo(torneo torneo){
        controlPersis.modificarTorneo(torneo);    
    }

    //CRUD Cliente
    public void crearCliente(cliente cliente){
        controlPersis.crearCliente(cliente);
    }
    
    public void modificarCliente(cliente cliente){
        controlPersis.modificarCliente(cliente);
    }
    
    public void eliminarCliente(int id){
        controlPersis.eliminarCliente(id);
    }  
    
    //CRUD Cancha
    public void crearCancha(cancha cancha){
        controlPersis.crearCancha(cancha);
    }
    
    public void modificarCancha(cancha cancha){
        controlPersis.modificarCancha(cancha);
    }
    
     public void eliminarCancha(int id){
        controlPersis.eliminarCancha(id);
    }
     
    //CRUD Horario     
      public void crearHorario(horario horario){
        controlPersis.crearHorario(horario);
    }
    
    public void eliminarHorario(int id){
        controlPersis.eliminarHorario(id);
    }
    
    public void modificarHorario(horario horario){
        controlPersis.modificarHorario(horario);    
    }
    
    //CRUD Reserva
      public void crearReserva(reserva reserva){
        controlPersis.crearReserva(reserva);
    }
    
    public void eliminarReserva(int id){
        controlPersis.eliminarReserva(id);
    }
    
    public void modificarReserva(reserva reserva){
        controlPersis.modificarReserva(reserva);    
    }
}


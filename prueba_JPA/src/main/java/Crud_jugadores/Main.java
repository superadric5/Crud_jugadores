package Crud_jugadores;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad-equipos");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        // CREAMOS UN EQUIPO Y LO INSERTAMOS EN LA BASE DE DATOS
//        Equipo equipo = new Equipo("Real Madrid", "Santiago Bernabeu");
//        em.persist(equipo);


        // CREAMOS UN JUGADOR CON UN EQUIPO DE NUESTRA BASE DE DATOS
//        Equipo equipo = em.find(Equipo.class, 1); //esto realiza una busqueda en la tabla equipo que tenga como primary key 1
//        Jugador jug =new Jugador("Ronaldo", (float)187, (float)87, equipo);
//        em.persist(jug);


        //ACTUALIZAMOS JUGADOR
//        Jugador jugador = em.find(Jugador.class, 1);
//        jugador.setNombre("ElBicho");
//        em.merge(jugador);


        //ELIMINAMOS JUGADOR
//        Jugador jugador = em.find(Jugador.class, 1);
//        em.remove(jugador);






        // MOSTRAMOS LA TABLA Jugadores
//        List<Jugador> jugadores = em.createQuery("select j from Jugador j").getResultList();
//        for (Jugador jugador1 : jugadores) {
//            System.out.println(jugador1.toString());
//        }


        //MOSTRAR TODOS LOS EQUIPOS
//        ArrayList<Equipo> equipos = (ArrayList<Equipo>) em.createQuery("select e from Equipo e", Equipo.class).getResultList();
//        for (Equipo e : equipos) {
//            System.out.println(e.toString());
//        }
        tx.commit();
    }
}

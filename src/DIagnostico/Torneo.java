package DIagnostico;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Torneo implements Partidos {

    //metodo para recibir datos
    static Scanner sc = new Scanner(System.in);


    @Override
    public void juegarPartidos(LinkedList<Equipos> equipos) {
        //preguntar si quiere partidos aleatorios o personalizados y validar que sea una opcion valida y que no sea un numero diferente a 1 o 2
        System.out.println("Desea partidos aleatorios o personalizados?");
        System.out.println("1. Aleatorios");
        System.out.println("2. Personalizados");
        int opcion = sc.nextInt();

        if (opcion != 1 && opcion != 2) System.out.println("Error, por favor ingrese una opcion valida");
        else {
            //si elige aleatorios
            if (opcion == 1) {
                //se crea un objeto random
                Random random = new Random();
                //se crean dos variables para los equipos que van a jugar
                int equipo1 = random.nextInt(equipos.size());
                int equipo2 = random.nextInt(equipos.size());
                //se verifica que los equipos no sean el mismo
                while (equipo1 == equipo2) {
                    equipo2 = random.nextInt(equipos.size());
                }
                //se crean dos variables para los goles de cada equipo
                int goles1 = random.nextInt(5);
                int goles2 = random.nextInt(5);
                //se verifica quien gano y se le suman los puntos
                if (goles1 > goles2) {
                    equipos.get(equipo1).setPartidosJugados(equipos.get(equipo1).getPartidosJugados() + 1);
                    equipos.get(equipo1).setPartidosGanados(equipos.get(equipo1).getPartidosGanados() + 1);
                    equipos.get(equipo1).setGolesFavor(equipos.get(equipo1).getGolesFavor() + goles1);
                    equipos.get(equipo1).setGolesContra(equipos.get(equipo1).getGolesContra() + goles2);
                    equipos.get(equipo1).setPuntos(equipos.get(equipo1).getPuntos() + 3);
                    equipos.get(equipo2).setPartidosJugados(equipos.get(equipo2).getPartidosJugados() + 1);
                    equipos.get(equipo2).setPartidosPerdidos(equipos.get(equipo2).getPartidosPerdidos() + 1);
                    equipos.get(equipo2).setGolesFavor(equipos.get(equipo2).getGolesFavor() + goles2);
                    equipos.get(equipo2).setGolesContra(equipos.get(equipo2).getGolesContra() + goles1);
                } else if (goles1 < goles2) {
                    equipos.get(equipo2).setPartidosJugados(equipos.get(equipo2).getPartidosJugados() + 1);
                    equipos.get(equipo2).setPartidosGanados(equipos.get(equipo2).getPartidosGanados() + 1);
                    equipos.get(equipo2).setGolesFavor(equipos.get(equipo2).getGolesFavor() + goles2);
                    equipos.get(equipo2).setGolesContra(equipos.get(equipo2).getGolesContra() + goles1);
                    equipos.get(equipo2).setPuntos(equipos.get(equipo2).getPuntos() + 3);
                    equipos.get(equipo1).setPartidosJugados(equipos.get(equipo1).getPartidosJugados() + 1);
                    equipos.get(equipo1).setPartidosPerdidos(equipos.get(equipo1).getPartidosPerdidos() + 1);
                    equipos.get(equipo1).setGolesFavor(equipos.get(equipo1).getGolesFavor() + goles1);
                    equipos.get(equipo1).setGolesContra(equipos.get(equipo1).getGolesContra() + goles2);
                } else {
                    equipos.get(equipo1).setPartidosJugados(equipos.get(equipo1).getPartidosJugados() + 1);
                    equipos.get(equipo1).setPartidosEmpatados(equipos.get(equipo1).getPartidosEmpatados() + 1);
                    equipos.get(equipo1).setGolesFavor(equipos.get(equipo1).getGolesFavor() + goles1);
                    equipos.get(equipo1).setGolesContra(equipos.get(equipo1).getGolesContra() + goles2);
                    equipos.get(equipo1).setPuntos(equipos.get(equipo1).getPuntos() + 1);
                    equipos.get(equipo2).setPartidosJugados(equipos.get(equipo2).getPartidosJugados() + 1);
                    equipos.get(equipo2).setPartidosEmpatados(equipos.get(equipo2).getPartidosEmpatados() + 1);
                    equipos.get(equipo2).setGolesFavor(equipos.get(equipo2).getGolesFavor() + goles2);
                    equipos.get(equipo2).setGolesContra(equipos.get(equipo2).getGolesContra() + goles1);
                    equipos.get(equipo2).setPuntos(equipos.get(equipo2).getPuntos() + 1);
                }
            } else {
                //si elige personalizados
                //se pide el nombre del equipo 1
                System.out.println("Ingrese el nombre del equipo 1");
                String nombreEquipo1 = sc.next();
                //se verifica que el equipo exista
                boolean existe1 = false;
                int equipo1 = 0;
                for (int i = 0; i < equipos.size(); i++) {
                    if (equipos.get(i).getNombreEquipo().equals(nombreEquipo1)) {
                        existe1 = true;
                        equipo1 = i;
                    }
                }
                if (!existe1) {
                    System.out.println("El equipo no existe");
                } else {
                    //se pide el nombre del equipo 2
                    System.out.println("Ingrese el nombre del equipo 2");
                    String nombreEquipo2 = sc.next();
                    //se verifica que el equipo exista
                    boolean existe2 = false;
                    int equipo2 = 0;
                    for (int i = 0; i < equipos.size(); i++) {
                        if (equipos.get(i).getNombreEquipo().equals(nombreEquipo2)) {
                            existe2 = true;
                            equipo2 = i;
                        }
                    }
                    if (!existe2) {
                        System.out.println("El equipo no existe");
                    } else {
                        //se pide el numero de goles del equipo 1
                        System.out.println("Ingrese el numero de goles del equipo 1");
                        int goles1 = sc.nextInt();
                        //se pide el numero de goles del equipo 2
                        System.out.println("Ingrese el numero de goles del equipo 2");
                        int goles2 = sc.nextInt();
                        //se verifica quien gano y se le suman los puntos
                        if (goles1 > goles2) {
                            equipos.get(equipo1).setPartidosJugados(equipos.get(equipo1).getPartidosJugados() + 1);
                            equipos.get(equipo1).setPartidosGanados(equipos.get(equipo1).getPartidosGanados() + 1);
                            equipos.get(equipo1).setGolesFavor(equipos.get(equipo1).getGolesFavor() + goles1);
                            equipos.get(equipo1).setGolesContra(equipos.get(equipo1).getGolesContra() + goles2);
                            equipos.get(equipo1).setPuntos(equipos.get(equipo1).getPuntos() + 3);
                            equipos.get(equipo2).setPartidosJugados(equipos.get(equipo2).getPartidosJugados() + 1);
                            equipos.get(equipo2).setPartidosPerdidos(equipos.get(equipo2).getPartidosPerdidos() + 1);
                            equipos.get(equipo2).setGolesFavor(equipos.get(equipo2).getGolesFavor() + goles2);
                            equipos.get(equipo2).setGolesContra(equipos.get(equipo2).getGolesContra() + goles1);
                        } else if (goles1 < goles2) {
                            equipos.get(equipo2).setPartidosJugados(equipos.get(equipo2).getPartidosJugados() + 1);
                            equipos.get(equipo2).setPartidosGanados(equipos.get(equipo2).getPartidosGanados() + 1);
                            equipos.get(equipo2).setGolesFavor(equipos.get(equipo2).getGolesFavor() + goles2);
                            equipos.get(equipo2).setGolesContra(equipos.get(equipo2).getGolesContra() + goles1);
                            equipos.get(equipo2).setPuntos(equipos.get(equipo2).getPuntos() + 3);
                            equipos.get(equipo1).setPartidosJugados(equipos.get(equipo1).getPartidosJugados() + 1);
                            equipos.get(equipo1).setPartidosPerdidos(equipos.get(equipo1).getPartidosPerdidos() + 1);
                            equipos.get(equipo1).setGolesFavor(equipos.get(equipo1).getGolesFavor() + goles1);
                            equipos.get(equipo1).setGolesContra(equipos.get(equipo1).getGolesContra() + goles2);
                        } else {
                            equipos.get(equipo1).setPartidosJugados(equipos.get(equipo1).getPartidosJugados() + 1);
                            equipos.get(equipo1).setPartidosEmpatados(equipos.get(equipo1).getPartidosEmpatados() + 1);
                            equipos.get(equipo1).setGolesFavor(equipos.get(equipo1).getGolesFavor() + goles1);
                            equipos.get(equipo1).setGolesContra(equipos.get(equipo1).getGolesContra() + goles2);
                            equipos.get(equipo1).setPuntos(equipos.get(equipo1).getPuntos() + 1);
                            equipos.get(equipo2).setPartidosJugados(equipos.get(equipo2).getPartidosJugados() + 1);
                            equipos.get
                                    (equipo2).setPartidosEmpatados(equipos.get(equipo2).getPartidosEmpatados() + 1);
                            equipos.get(equipo2).setGolesFavor(equipos.get(equipo2).getGolesFavor() + goles2);
                            equipos.get(equipo2).setGolesContra(equipos.get(equipo2).getGolesContra() + goles1);
                            equipos.get(equipo2).setPuntos(equipos.get(equipo2).getPuntos() + 1);


                        }
                    }


                }
            }
        }
    }

    @Override
    public void mostrarResultados(LinkedList<Equipos> equipos) {
        //mostrar el resultado de todo el torneo en forma de tabla
        System.out.println("Nombre del equipo | Partidos jugados | Partidos ganados | Partidos empatados | Partidos perdidos | Goles a favor | Goles en contra | Puntos");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println(equipos.get(i).getNombreEquipo() + " | " + equipos.get(i).getPartidosJugados() + " | " + equipos.get(i).getPartidosGanados() + " | " + equipos.get(i).getPartidosEmpatados() + " | " + equipos.get(i).getPartidosPerdidos() + " | " + equipos.get(i).getGolesFavor() + " | " + equipos.get(i).getGolesContra() + " | " + equipos.get(i).getPuntos());
        }


    }

    @Override
    public void mostrarGanador(LinkedList<Equipos> equipos) {
        //muestra el ganador
        int mayor = 0;
        int equipo = 0;
        for (int i = 0; i < equipos.size(); i++) {
            if (equipos.get(i).getPuntos() > mayor) {
                mayor = equipos.get(i).getPuntos();
                equipo = i;
            }
        }
        System.out.println("El ganador es " + equipos.get(equipo).getNombreEquipo() + " con " + equipos.get(equipo).getPuntos() + " puntos");

    }

    //crear variables para agregar 7 jugadores por defecto a cada equipo
    public static void AgregarJugadoresAutomatico(LinkedList<Equipos> equipos, ArrayList<Jugador> jugadores) {
        //se le agregan 7 jugadores a cada equipo por defecto con nombres y apellidos aleatorios
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = 0; j < 7; j++) {
                String nombre = "Jugador" + j;
                String apellido = "Apellido" + j;
                String dorsal = "Dorsal" + j;
                String edad = "Edad" + j;
                personas persona = new personas(nombre, apellido, edad);
                Jugador jugador = new Jugador(dorsal, persona);
                jugadores.add(jugador);
                equipos.get(i).getJugadores().add(jugador);
            }
        }


    }


    public static void main(String[] args) {
        boolean menu = false;
        System.out.println("Bienvenido al torneo de Super 7");
        LinkedList<Equipos> equipos = new LinkedList<>();
        ArrayList<Jugador> jugadores = new ArrayList<>();

        //agregar 9 equipos por defecto con jugadores
        Equipos equipo1 = new Equipos("Catolicismo", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        Equipos equipo2 = new Equipos("Cristianismo", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        Equipos equipo3 = new Equipos("Judismo", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        Equipos equipo4 = new Equipos("Ateismo", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        Equipos equipo5 = new Equipos("Islaismo", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        Equipos equipo6 = new Equipos("Budaismo", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        Equipos equipo7 = new Equipos("Agnostico", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        Equipos equipo8 = new Equipos("Paganismo", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        Equipos equipo9 = new Equipos("Satanismo", 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        equipos.add(equipo5);
        equipos.add(equipo6);
        equipos.add(equipo7);
        equipos.add(equipo8);
        equipos.add(equipo9);

        //se les agregan jugadores a los equipos llamando a la funcion
        AgregarJugadoresAutomatico(equipos, jugadores);


        //menu con try cath para evitar errores
        while (!menu) {
            //solo el try cath
            try {
                //opciones del menu
                System.out.println("1. Agregar equipo");
                System.out.println("2. Agregar jugador");
                System.out.println("3. Jugar partido");
                System.out.println("4. Mostrar resultados");
                System.out.println("5. Mostrar ganador");
                System.out.println("6. Salir");
                System.out.println("Ingrese una opcion");

                //switch para las opciones
                switch (sc.nextInt()) {
                    case 1:
                        //agregar equipo
                        agregarEquipo(equipos);

                        break;
                    case 2:
                        //agregar jugador
                        agregarJugador(jugadores, equipos);

                        break;
                    case 3:
                        //jugar partido
                        Torneo torneo = new Torneo();
                        torneo.juegarPartidos(equipos);
                        break;
                    case 4:
                        //mostrar resultados
                        Torneo torneo1 = new Torneo();
                        torneo1.mostrarResultados(equipos);

                        break;
                    case 5:

                        //mostrar ganador
                        break;
                    case 6:
                        //salir
                        menu = true;
                        break;
                }

            } catch (Exception e) {
                System.out.println("Error, por favor ingrese un numero valido");


            }
        }
    }


    //funciones del menu

    //agregar equipo
    public static void agregarEquipo(LinkedList<Equipos> equipos) {
        //menu para agregar equipo o ver equipos, editar equipos y eliminar equipos validado
        System.out.println("Desea agregar equipo o ver equipos?");
        System.out.println("1. Agregar equipo");
        System.out.println("2. Ver equipos");
        System.out.println("3. editar equipo");
        System.out.println("4. eliminar equipo");
        int opcion = sc.nextInt();

        if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4)
            System.out.println("Error, por favor ingrese una opcion valida");
        else {
            //si elige agregar equipo
            if (opcion == 1) {
                //se pide el nombre del equipo
                System.out.println("Ingrese el nombre del equipo");
                String nombreEquipo = sc.next();
                //se crea el objeto equipo y se agrega a la lista de equipos
                Equipos equipo = new Equipos(nombreEquipo, 0, 0, 0, 0, 0, 0, 0, new LinkedList<Jugador>());
                equipos.add(equipo);
            } else if (opcion == 2) {
                //si elige ver equipos
                //se muestran todos los equipos
                for (int i = 0; i < equipos.size(); i++) {
                    System.out.println(equipos.get(i).getNombreEquipo());
                }
            } else if (opcion == 3) {
                //editar equipos
                //se pide el nombre del equipo
                System.out.println("Ingrese el nombre del equipo");
                String nombreEquipo = sc.next();
                //se verifica que el equipo exista
                boolean existe = false;
                int equipo = 0;
                for (int i = 0; i < equipos.size(); i++) {
                    if (equipos.get(i).getNombreEquipo().equals(nombreEquipo)) {
                        existe = true;
                        equipo = i;
                    }
                }
                if (!existe) {
                    System.out.println("El equipo no existe");
                } else {
                    //se pide el nuevo nombre del equipo
                    System.out.println("Ingrese el nuevo nombre del equipo");
                    String nuevoNombre = sc.next();
                    //se edita el nombre del equipo
                    equipos.get(equipo).setNombreEquipo(nuevoNombre);
                }
            } else {
                //eliminar equipos
                //se pide el nombre del equipo
                System.out.println("Ingrese el nombre del equipo");
                String nombreEquipo = sc.next();
                //se verifica que el equipo exista
                boolean existe = false;
                int equipo = 0;
                for (int i = 0; i < equipos.size(); i++) {
                    if (equipos.get(i).getNombreEquipo().equals(nombreEquipo)) {
                        existe = true;
                        equipo = i;
                    }
                    //eliminar equipo
                    if (existe) {
                        equipos.remove(equipo);
                    }
                }
            }
        }
    }

    //agregar jugadores
    public static void agregarJugador(ArrayList<Jugador> jugadores, LinkedList<Equipos> equipos) {
        //preguntar si agregar jugadores o ver todos los jugadores validado
        System.out.println("Desea agregar jugadores o ver todos los jugadores?");
        System.out.println("1. Agregar jugadores");
        System.out.println("2. Ver todos los jugadores");
        System.out.println("3. editar jugadores");
        System.out.println("4. eliminar jugadores");
        int opcion = sc.nextInt();
        if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4)
            System.out.println("Error, por favor ingrese una opcion valida");
        else {
            //si elige agregar jugadores
            if (opcion == 1) {
                //se pide el nombre del equipo
                System.out.println("Ingrese el nombre del equipo");
                String nombreEquipo = sc.next();
                //se verifica que el equipo exista
                boolean existe = false;
                int equipo = 0;
                for (int i = 0; i < equipos.size(); i++) {
                    if (equipos.get(i).getNombreEquipo().equals(nombreEquipo)) {
                        existe = true;
                        equipo = i;
                    }
                }
                if (!existe) {
                    System.out.println("El equipo no existe");
                } else {
                    //se pide el nombre del jugador
                    System.out.println("Ingrese el nombre del jugador");
                    String nombre = sc.next();
                    //se pide el apellido del jugador
                    System.out.println("Ingrese el apellido del jugador");
                    String apellido = sc.next();
                    //se pide el dorsal del jugador
                    System.out.println("Ingrese el dorsal del jugador");
                    String dorsal = sc.next();
                    //se pide la edad del jugador
                    System.out.println("Ingrese la edad del jugador");
                    String edad = sc.next();
                    //se crea el objeto jugador y se agrega a la lista de jugadores y al equipo
                    personas persona = new personas(nombre, apellido, edad);
                    Jugador jugador = new Jugador(dorsal, persona);
                    jugadores.add(jugador);
                    equipos.get(equipo).getJugadores().add(jugador);
                }
            } else if (opcion == 2) {
                //si elige ver todos los jugadores
                //se muestran todos los jugadores
                for (int i = 0; i < jugadores.size(); i++) {
                    System.out.println(jugadores.get(i).getPersona().getNombre() + " " + jugadores.get(i).getPersona().getApellido() + " " + jugadores.get(i).getDorsal() + " " + jugadores.get(i).getPersona().getEdad());
                }
            } else if (opcion == 3) {
                //editar jugadores
                // se pide el el dorsal y el nombre del equipo para editar el jugador
                System.out.println("Ingrese el dorsal del jugador");
                String dorsal = sc.next();
                System.out.println("Ingrese el nombre del equipo");
                String nombreEquipo = sc.next();
                //se verifica que el equipo exista
                boolean existe = false;
                int equipo = 0;
                for (int i = 0; i < equipos.size(); i++) {
                    if (equipos.get(i).getNombreEquipo().equals(nombreEquipo)) {
                        existe = true;
                        equipo = i;
                    }
                }
                if (!existe) {
                    System.out.println("El equipo no existe");
                } else {
                    //se pide el nombre del jugador
                    System.out.println("Ingrese el nombre del jugador");
                    String nombre = sc.next();
                    //se pide el apellido del jugador
                    System.out.println("Ingrese el apellido del jugador");
                    String apellido = sc.next();
                    //se pide la edad del jugador
                    System.out.println("Ingrese la edad del jugador");
                    String edad = sc.next();
                    //se busca el jugador y se edita
                    for (int i = 0; i < equipos.get(equipo).getJugadores().size(); i++) {
                        if (equipos.get(equipo).getJugadores().get(i).getDorsal().equals(dorsal)) {
                            equipos.get(equipo).getJugadores().get(i).getPersona().setNombre(nombre);
                            equipos.get(equipo).getJugadores().get(i).getPersona().setApellido(apellido);
                            equipos.get(equipo).getJugadores().get(i).getPersona().setEdad(edad);
                        }
                    }
                }
            } else {
                //eliminar jugadores
                //se pide el dorsal y el nombre del equipo para eliminar el jugador
                System.out.println("Ingrese el dorsal del jugador");
                String dorsal = sc.next();
                System.out.println("Ingrese el nombre del equipo");
                String nombreEquipo = sc.next();
                //se verifica que el equipo exista
                boolean existe = false;
                int equipo = 0;
                for (int i = 0; i < equipos.size(); i++) {
                    if (equipos.get(i).getNombreEquipo().equals(nombreEquipo)) {
                        existe = true;
                        equipo = i;
                    }
                }
                if (!existe) {
                    System.out.println("El equipo no existe");
                } else {
                    //se busca el jugador y se elimina
                    for (int i = 0; i < equipos.get(equipo).getJugadores().size(); i++) {
                        if (equipos.get(equipo).getJugadores().get(i).getDorsal().equals(dorsal)) {
                            equipos.get(equipo).getJugadores().remove(i);
                        }
                    }
                }


            }
        }


    }
}


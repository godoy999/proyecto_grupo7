package com.mycompany.progra1grupo42024;

import static com.mycompany.progra1grupo42024.Prueba.entrada;
import static com.mycompany.progra1grupo42024.torre.Torre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static Scanner entrada = new Scanner(System.in);
    public static boolean estado = false;
    public static char respuesta;
    public static int a, contador = 0;
    static ArrayList<Vehiculos> Carro1 = new ArrayList<Vehiculos>();
    static ArrayList<Vehiculos> Balsa1 = new ArrayList<Vehiculos>();
    static ArrayList<Vehiculos> Avion1 = new ArrayList<Vehiculos>();
    public static int numero, conteo, conteo1, conteo2;
    public static int[] numeros = new int[10];

    public static void faseUno() {
        do {
            int resultado;
            System.out.println("\n------------------------------");
            System.out.println("1.Ingresar Datos de Vehiculos");
            System.out.println("2.Mostrar Datos de los Vehiculos ");
            System.out.println("3. Crear una Torre Hanoi ");
            System.out.println("4.Regresar al menu Principal");
            System.out.print("Que Operacion desea:");
            try {
                resultado = entrada.nextInt();
                System.out.println("----------------------------------");

                switch (resultado) {
                    case 1:
                        ingresarVehiculo();
                        System.out.println("tesss");
                        break;
                    case 2:
                        mostrarDatos();
                        break;
                    case 3:
                        Torre();
                        break;

                    case 4: //regresamos al menu principal
                        Principal();
                    default:
                        System.out.println("El numero ingresado no se encuentra en el menu ");

                        estado = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion ");
                System.out.println("Mensaje: " + e.getMessage());
                entrada.next();
                estado = true;
            }

        } while (estado);
    }

    public static void ingresarVehiculo() {
        do {
            int car;
            System.out.println("\n------------------------------");
            System.out.println("1: Carro");
            System.out.println("2: Balsa");
            System.out.println("3: Avión");
            System.out.println("4: Desea Regresar al SubMenu");
            System.out.print("Ingrese una opción: ");

            car = entrada.nextInt();
            System.out.println("----------------------------------");
            try {

                switch (car) {
                    case 1:
                        System.out.println("La clase Carros");
                        IngresarCarro();
                        break;
                    case 2:
                        System.out.println("La balsa");
                        IngresarBalsa();
                        break;
                    case 3:
                        System.out.println("El avion");
                        IngresarAvion();
                        break;
                    case 4: //regresamos al menu principal
                        faseUno();
                        break;
                    default:
                        System.out.println("El numero ingresado no se encuentra en el menu ");
                        estado = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion");

                entrada.next();
                estado = true;
            }

        } while (estado);
    }

    public static void IngresarCarro() {
        String MarcaV;
        String ColorV, GasolinaC;
        int Id = 0;
        try {
            do {
                System.out.println("Ingrese 10 Vehiculos:");
                // Iterar para ingresar 10 números
                for (int i = conteo; i < 10; i++) {
                    System.out.print("Número Identificador de Carro [" + (i + 1) + "] es : ");
                    numero = entrada.nextInt();
                    conteo++;

                    // Verificar si el número ya ha sido ingresado antes
                    boolean repetido = false;
                    for (int j = 0; j < contador; j++) {

                        if (numeros[j] == numero) {
                            repetido = true;
                            break;
                        }
                    }

                    // Si el número no está repetido, se agrega al array
                    if (!repetido) {
                        numeros[contador] = numero;
                        contador++;
                        Id = numero;
                        entrada.nextLine();
                        System.out.print("\nDigite el color del Carro: ");
                        ColorV = entrada.nextLine();
                        System.out.print("Digite la Marca del Carro : ");
                        MarcaV = entrada.nextLine();
                        System.out.print("Digite el tipo de Gasolina que utiliza el Carro: ");
                        GasolinaC = entrada.nextLine();
                        Carro carro = new Carro(MarcaV, ColorV, Id, GasolinaC);

                        System.out.println("");
                        Carro1.add(carro);

                    } else {
                        System.out.println("El número ya ha sido ingresado. Ingrese otro número.");
                        i--; // Para que se pida nuevamente el mismo número

                    }
                    if (!repetido) {
                        System.out.print("Desea ingresar otro Carro ");
                        System.out.println("\ns = si  ");
                        System.out.println("n = no  ");
                        System.out.print("Seleccione una opción: ");
                        respuesta = entrada.next().charAt(0);
                        if (respuesta == 's' || respuesta == 'S') {
                            estado = true;
                        } else {
                            i--;
                            SegundaFase();
                        }
                    }

                }
            } while (estado && conteo < 10);
            if (conteo == 10) {
                System.out.println("El arreglo se ha completado con 10 posiciones");
            }
        } catch (Exception e) {
            System.out.print("Ha Ocurrido Una Excepción. ");
            System.out.print("\nFavor Ingrese Un Numero Entero. ");
            entrada.next();
        }
        SegundaFase();

    }

    public static void IngresarBalsa() {
        String MarcaV;
        String ColorV, ReMot;
        int Id = 0;
        try {
            do {

                System.out.println("Ingrese 10 Vehiculos:");
                // Iterar para ingresar 10 números
                for (int i = conteo; i < 10; i++) {
                    System.out.print("Número Identificador de Balsa [" + (i + 1) + "] es: ");
                    numero = entrada.nextInt();
                    conteo++;

                    // Verificar si el número ya ha sido ingresado antes
                    boolean repetido = false;
                    for (int j = 0; j < contador; j++) {
                        if (numeros[j] == numero) {
                            repetido = true;
                            break;
                        }
                    }

                    // Si el número no está repetido, se agrega al array
                    if (!repetido) {
                        numeros[contador] = numero;
                        contador++;
                        Id = numero;
                        entrada.nextLine();
                        System.out.print("\nDigite el color de la balsa: ");
                        ColorV = entrada.nextLine();
                        System.out.print("Digite la Marca de la balsa : ");
                        MarcaV = entrada.nextLine();
                        System.out.print("Digite si la balsa se mueve con remo o motor : ");
                        ReMot = entrada.nextLine();
                        Balsa balsa = new Balsa(MarcaV, ColorV, Id, ReMot);

                        System.out.println("");
                        Balsa1.add(balsa);

                    } else {
                        System.out.println("El número ya ha sido ingresado. Ingrese otro número.");
                        i--; // Para que se pida nuevamente el mismo número

                    }
                    if (!repetido) {
                        System.out.print("Desea ingresar otra balsa ");
                        System.out.println("\ns = si ");
                        System.out.println("n = no ");
                        System.out.print("Seleccione una opción: ");
                        respuesta = entrada.next().charAt(0);
                        if (respuesta == 's' || respuesta == 'S') {
                            estado = true;
                        } else {
                            SegundaFase();
                        }
                    }

                }

            } while (estado && conteo < 10);
            if (conteo == 10) {
                System.out.println("El arreglo se ha completado con 10 posiciones");
            }
        } catch (Exception e) {
            System.out.print("Ha Ocurrido Una Excepción. ");
            System.out.print("\nFavor Ingrese Un Numero Entero. ");
            entrada.next();
        }
        SegundaFase();

    }

    public static void IngresarAvion() {

        String MarcaV;
        String ColorV;
        int PasajerosA, Id;
        try {
            do {
                System.out.println("Ingrese 10 Vehiculos:");
                for (int i = conteo; i < 10; i++) {
                    System.out.print("Número Identificador de Avion [" + (i + 1) + "] es : ");
                    numero = entrada.nextInt();
                    conteo++;

                    // Verificar si el número ya ha sido ingresado antes
                    boolean repetido = false;
                    for (int j = 0; j < contador; j++) {
                        if (numeros[j] == numero) {
                            repetido = true;
                            break;
                        }
                    }

                    // Si el número no está repetido, se agrega al array
                    if (!repetido) {
                        numeros[contador] = numero;
                        contador++;
                        Id = numero;
                        entrada.nextLine();
                        System.out.print("\nDigite el color del Avion: ");
                        ColorV = entrada.nextLine();
                        System.out.print("Digite la Marca del Avion : ");
                        MarcaV = entrada.nextLine();
                        System.out.print("Digite la Cantidad de pasajeros (Numeros) : ");
                        PasajerosA = entrada.nextInt();
                        Avion avion = new Avion(MarcaV, ColorV, Id, PasajerosA);

                        System.out.println("");
                        Avion1.add(avion);

                    } else {
                        System.out.println("El número ya ha sido ingresado. Ingrese otro número.");
                        i--; // Para que se pida nuevamente el mismo número

                    }
                    if (!repetido) {
                        System.out.print("Desea ingresar otro Avion ");
                        System.out.println("\ns = si ");
                        System.out.println("n = no ");
                        System.out.print("Seleccione una opción: ");
                        respuesta = entrada.next().charAt(0);
                        if (respuesta == 's' || respuesta == 'S') {
                            estado = true;
                        } else {
                            SegundaFase();
                        }
                    }

                }

            } while (estado && conteo < 10);
            if (conteo == 10) {
                System.out.println("El arreglo se ha completado con 10 posiciones");
            }
        } catch (Exception e) {
            System.out.print("Ha Ocurrido Una Excepción. ");
            System.out.print("\nFavor Ingrese Un Numero Entero. ");
            entrada.next();
        }
        SegundaFase();
    }

    public static void mostrarDatos() {
        int re;

        if (Carro1.isEmpty()) {
            System.out.println("El ArrayList se encuentra vacio porque no encontro registro de Carro.");
        } else {
            System.out.println("El ArrayList contiene estos datos.");
            System.out.print("\nEstos son sus Vehiculos\n"
                    + "\nEstos son los Carros: " + Carro1.toString());
        }

        if (Balsa1.isEmpty()) {
            System.out.println("El ArrayList se encuentra vacio porque no encontro registro de Balsa.");
        } else {
            System.out.println("El ArrayList contiene estos datos.");
            System.out.println("\nEstas son las Balsas " + Balsa1.toString());
            System.out.println("");
        }

        if (Avion1.isEmpty()) {
            System.out.println("El ArrayList se encuentra vacio porque no encontro registro de Avion.");
        } else {
            System.out.println("El ArrayList contiene estos datos.");
            System.out.println("\nEstos son los Aviones " + Avion1.toString());
            System.out.println("");
        }

        do {
            System.out.println("A donde le gustaria Regresar ");
            System.out.println("1. Menu Principal ");
            System.out.println("2. Al SubMenu ");
            System.out.print("Que opcion desea: ");
            try {
                re = entrada.nextInt();
                switch (re) {
                    case 1:
                        Principal();
                        estado = true;
                        break;
                    case 2:
                        SegundaFase();
                        break;
                    default:
                        System.out.println("La opcion escogida no esta disponible");
                        System.out.println("");
                        estado = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Solo debe de ingresar 'Numeros Enteros'");
                System.out.println("Intentelo de nuevo.");
                entrada.next();
                estado = true;
            }
        } while (estado);
    }

    public static void main(String[] args) {

        Principal();
    }

    public static void Principal() {
        int dato;
        do {
            System.out.println("\n----------------------------------");
            System.out.println("1.Fase 1");
            System.out.println("2.Fase 2: 'Arreglos' ");
            System.out.println("3.Fase 3: -Base de Datos");
            System.out.println("4.Desea Salir del Menu");
            System.out.print("Que opcion desea: ");
            try {
                dato = entrada.nextInt();
                System.out.println("---------------------------------");

                switch (dato) {
                    case 1:
                        System.out.println("Primera fase ");
                        faseUno();
                        break;
                    case 2: // Fase 2
                        SegundaFase();
                        estado = true;
                        break;
                    case 3:
                        terceraFase();
                        estado = true;
                        break;
                    case 4:
                        System.out.println("Te esperamos Pronto!!");
                        System.exit(0);
                    default:
                        System.out.println("El numero ingresado no se encuentra en el menu ");
                        entrada.next();
                        estado = true;
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion");
                System.out.println("Por favor ingrese solo 'Numeros Enteros' ");
                entrada.next();
                estado = true;
            }

        } while (estado);
    }

    public static void SegundaFase() {
        do {
            int fase2;

            System.out.println("\n------------------------------");
            System.out.println("1:Desea Ingresar un Carro");
            System.out.println("2:Desea Ingresar una Balsa");
            System.out.println("3:Desea Ingresar un Avión");
            System.out.println("4:Desea regresar al Menu Principal");
            System.out.print("Ingrese una opción: ");
            if (conteo == 10) {
                System.out.println("5.Desea Ordenar el arreglo");
                System.out.println("6.Desea Mostrar el Arreglo");
            }
            try {
                fase2 = entrada.nextInt();
                System.out.println("---------------------------------");

                switch (fase2) {
                    case 1:
                        IngresarCarro();
                        break;
                    case 2:
                        System.out.println("La balsa");
                        IngresarBalsa();
                        break;
                    case 3:
                        System.out.println("El avion");
                        IngresarAvion();
                        break;
                    case 4:
                        System.out.println("En estos momentos esta regresando al Menu Principal");
                        Principal();
                        break;
                    case 5:
                        System.out.println("En Que forma desea ordenar el Arreglo ");
                        System.out.println("1. Descendente");
                        System.out.println("2. Ascendente");
                        System.out.print("¿Que opcion desea?: ");
                        try {
                            a = entrada.nextInt();
                            imprimirArreglo(numeros);
                        } catch (Exception e) {
                            System.out.println("Ha ocurrido una Excepcion");
                            System.out.println("Por favor ingrese solo 'Numeros Enteros' ");
                            entrada.next();
                            estado = true;
                        }
                        break;
                    case 6:
                        mostrarDatos();
                        break;
                    default:
                        System.out.println("El numero ingresado no se encuentra Disponible ");
                        System.out.println("Se regresara al menu Principal ");
                        Principal();

                }

            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion");
                System.out.println("Por favor ingrese solo 'Numeros Enteros' ");
                entrada.next();
                estado = true;
            }
        } while (estado);
    }

    public static void imprimirArreglo(int[] arre) {
        // Ordenado de forma Descendente
        switch (a) {
            case 1:
                // Ordenar el ArrayList de vehículos utilizando un comparador personalizado
                Collections.sort(Carro1, new Comparator<Vehiculos>() {
                    @Override
                    public int compare(Vehiculos v1, Vehiculos v2) {
                        // Extraer los identificadores de los vehículos
                        int id1 = getIdentificador(v1.toString());
                        int id2 = getIdentificador(v2.toString());
                        // Comparar los identificadores
                        return Integer.compare(id2, id1);

                    }

                    private int getIdentificador(String vehiculoString) {
                        int fin = vehiculoString.indexOf(":") + 1;
                        int inicio = vehiculoString.indexOf("\n", fin);
                        return Integer.parseInt(vehiculoString.substring(fin, inicio).trim());
                    }
                });

                System.out.println("\nArreglo de Carros después de ordenar de Forma Descendente:");
                for (Vehiculos vehiculo : Carro1) {
                    System.out.println(vehiculo);
                }
                Collections.sort(Balsa1, new Comparator<Vehiculos>() {
                    @Override
                    public int compare(Vehiculos v1, Vehiculos v2) {
                        // Extraer los identificadores de los vehículos
                        int id1 = getIdentificador(v1.toString());
                        int id2 = getIdentificador(v2.toString());
                        // Comparar los identificadores
                        return Integer.compare(id2, id1);

                    }

                    private int getIdentificador(String vehiculoString) {
                        int fin = vehiculoString.indexOf(":") + 1;
                        int inicio = vehiculoString.indexOf("\n", fin);
                        return Integer.parseInt(vehiculoString.substring(fin, inicio).trim());
                    }
                });

                System.out.println("\nArreglo de Balsas después de ordenar de Forma Descendente:");
                for (Vehiculos vehiculo : Balsa1) {
                    System.out.println(vehiculo);
                }
                Collections.sort(Avion1, new Comparator<Vehiculos>() {
                    @Override
                    public int compare(Vehiculos v1, Vehiculos v2) {
                        // Extraer los identificadores de los vehículos
                        int id1 = getIdentificador(v1.toString());
                        int id2 = getIdentificador(v2.toString());
                        // Comparar los identificadores
                        return Integer.compare(id2, id1);

                    }

                    private int getIdentificador(String vehiculoString) {
                        int fin = vehiculoString.indexOf(":") + 1;
                        int inicio = vehiculoString.indexOf("\n", fin);
                        return Integer.parseInt(vehiculoString.substring(fin, inicio).trim());
                    }
                });

                System.out.println("\nArreglo de Aviones después de ordenar de Forma Descendente:");
                for (Vehiculos vehiculo : Avion1) {
                    System.out.println(vehiculo);
                }

                SegundaFase();

            case 2:
                //Ordenar de Forma Ascendente
                Collections.sort(Carro1, new Comparator<Vehiculos>() {
                    @Override
                    public int compare(Vehiculos v1, Vehiculos v2) {
                        // Extraer los identificadores de los vehículos
                        int id1 = getIdentificador(v1.toString());
                        int id2 = getIdentificador(v2.toString());
                        // Comparar los identificadores
                        return Integer.compare(id1, id2);
                    }

                    private int getIdentificador(String vehiculoString) {
                        int inicio = vehiculoString.indexOf(":") + 1;
                        int fin = vehiculoString.indexOf("\n", inicio);
                        return Integer.parseInt(vehiculoString.substring(inicio, fin).trim());

                    }
                });

                System.out.println("\nArreglo de Carros después de ordenar de Forma Ascendente:");
                for (Vehiculos vehiculo : Carro1) {
                    System.out.println(vehiculo);
                }
                Collections.sort(Balsa1, new Comparator<Vehiculos>() {
                    @Override
                    public int compare(Vehiculos v1, Vehiculos v2) {
                        // Extraer los identificadores de los vehículos
                        int id1 = getIdentificador(v1.toString());
                        int id2 = getIdentificador(v2.toString());
                        // Comparar los identificadores
                        return Integer.compare(id1, id2);
                    }

                    private int getIdentificador(String vehiculoString) {
                        int inicio = vehiculoString.indexOf(":") + 1;
                        int fin = vehiculoString.indexOf("\n", inicio);
                        return Integer.parseInt(vehiculoString.substring(inicio, fin).trim());

                    }
                });

                System.out.println("\nArreglo de Balsas después de ordenar de Forma Ascendente:");
                for (Vehiculos vehiculo : Balsa1) {
                    System.out.println(vehiculo);
                }
                Collections.sort(Avion1, new Comparator<Vehiculos>() {
                    @Override
                    public int compare(Vehiculos v1, Vehiculos v2) {
                        // Extraer los identificadores de los vehículos
                        int id1 = getIdentificador(v1.toString());
                        int id2 = getIdentificador(v2.toString());
                        // Comparar los identificadores
                        return Integer.compare(id1, id2);
                    }

                    private int getIdentificador(String vehiculoString) {
                        int inicio = vehiculoString.indexOf(":") + 1;
                        int fin = vehiculoString.indexOf("\n", inicio);
                        return Integer.parseInt(vehiculoString.substring(inicio, fin).trim());

                    }
                });

                System.out.println("\nArreglo de Aviones después de ordenar de Forma Ascendente:");
                for (Vehiculos vehiculo : Avion1) {
                    System.out.println(vehiculo);
                }
                SegundaFase();
            default:
                System.out.println("La opcion que desea No esta Disponible!!!!!");
                SegundaFase();
                break;
        }
    }

    public static void terceraFase() {
        do {
            System.out.println("1. Desea trabajar con Carros ");
            System.out.println("2. Desea trabajar con Balsas");
            System.out.println("3. Desea trabajar con Aviones");
            System.out.println("4. Desea Regresar al menu principal");
            System.out.print("Que opcion desea:  ");
            try {
                a = entrada.nextInt();
                System.out.println("---------------------------------");

                switch (a) {
                    case 1:
                        trabajarCarro();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        System.out.println("En estos momentos esta regresando al Menu Principal");
                        Principal();
                        break;
                    default:
                        System.out.println("El numero ingresado no se encuentra Disponible ");
                        System.out.println("Intentelo de nuevo");

                }

            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion");
                System.out.println("Por favor ingrese solo 'Numeros Enteros' ");
                entrada.next();
                estado = true;
            }
        } while (estado);
    }

    public static void trabajarCarro() {
        do {
            System.out.println("1. Desea Insertar Carros ");
            System.out.println("2. Desea Consular Carros");
            System.out.println("3. Desea Actualizar Carros");
            System.out.println("4. Desea Eliminar Carro");
            System.out.println("5. Desea Regresar al sub Menu ");
            System.out.print("Que opcion desea:  ");
            try {
                a = entrada.nextInt();
                System.out.println("---------------------------------");

                switch (a) {
                    case 1:
                        InsertarCarro();
                        break;
                    case 2:
                      
                        break;
                    case 3:
                        System.out.println("sssss");
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        System.out.println("En estos momentos esta regresando al Menu Principal");
                        Principal();
                        break;
                    default:
                        System.out.println("El numero ingresado no se encuentra Disponible ");
                        System.out.println("Intentelo de nuevo");

                }

            } catch (Exception e) {
                System.out.println("Ha ocurrido una Excepcion");
                System.out.println("Por favor ingrese solo 'Numeros Enteros' ");
                entrada.next();
                estado = true;
                
            }
        } while (estado);
    }

    public static void InsertarCarro() {
        int ID;
        String Marca, Color, Combustible;
        Tabla datos = new Tabla();
        System.out.println("Ingrese un Id");
        ID = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese La Marca: ");
        Marca = entrada.nextLine();
        System.out.println("Ingrese el Color: ");
        Color = entrada.nextLine();
        System.out.println("Tipo de combustible: ");
        Combustible = entrada.nextLine();
        datos.AguardarCarro(ID, Marca, Color, Combustible);
        Carro carro = new Carro(Marca, Color, ID, Combustible);

        System.out.println("");
        Carro1.add(carro);

    }
    public List<Carro> getAllVehiculos() {
        List<Carro> datos = new ArrayList<>();
        String query = "SELECT * FROM carro";
        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                datos.add(new Carro(rs.getString("Marca"), rs.getString("Color"),rs.getInt("ID"),rs.getString("Combustible")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }

    public void updatePerson(Person person) {
        String query = "UPDATE persons SET name = ?, email = ? WHERE id = ?";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getEmail());
            stmt.setInt(3, person.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
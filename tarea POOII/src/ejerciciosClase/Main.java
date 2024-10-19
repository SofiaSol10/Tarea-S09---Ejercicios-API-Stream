/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosClase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.*;
import ejerciciosClase.Pais;
import java.util.Comparator;
import java.util.HashMap;
/**
 *
 * @author Sofía
 */
public class Main {
    public static void main(String[] args) {
            
        
        //AMERICA
        //Peru
        Ciudad ciudad1 = new Ciudad(1, "Lima", 10000000, "15001");
        //colombia
        Ciudad ciudad2 = new Ciudad(2, "Bogotá", 7800000, "110111");
        //Argentina
        Ciudad ciudad3 = new Ciudad(3, "Buenos Aires", 3054300, "C1002AAR");
        //Chile
        Ciudad ciudad4 = new Ciudad(38, "Santiago", 6520000, "8320000");
         //Mexico
        Ciudad ciudad5 = new Ciudad(5, "México City", 9209944, "01000");
        //Canada        
        Ciudad ciudad6 = new Ciudad(6, "Toronto", 2930000, "M5H 2N2");
        //Brasil
        Ciudad ciudad7 = new Ciudad(7, "Rio de Janeiro", 6748000, "20000-000");
        //EEUU
        Ciudad ciudad8 = new Ciudad(8, "Nueva York", 8419600, "10001");
        
        
        //OCEANIA
        //Australia
        Ciudad ciudad9 = new Ciudad(9, "Sídney", 5230330, "2000");
        Ciudad ciudad10 = new Ciudad(10, "Melbourne", 5078193, "3000");
        //Nueva Zelanda
        Ciudad ciudad11 = new Ciudad(11, "Wellington", 215100, "6011");
        
        //EUROPA
        //Italia
        Ciudad ciudad12 = new Ciudad(12, "Roma", 2872800, "00100");
        Ciudad ciudad13 = new Ciudad(13, "Nápoles", 962589, "80100");
        Ciudad ciudad14 = new Ciudad(14, "Florencia", 366039, "50121");
        //Rusia
        Ciudad ciudad15 = new Ciudad(15, "Moscú", 11920000, "101000");
        Ciudad ciudad16 = new Ciudad(16, "San Petersburgo", 5383890, "190000");
        //Austria
        Ciudad ciudad17 = new Ciudad(17, "Viena", 1911191, "1010");
        //Suecia
        Ciudad ciudad18 = new Ciudad(18, "Estocolmo", 975551, "111 21");
        //Alemania
        Ciudad ciudad19 = new Ciudad(19, "Berlín", 3769495, "10115");
        Ciudad ciudad20 = new Ciudad(20, "Hamburgo", 1841179, "20095");
        //Inglaterra
        Ciudad ciudad21 = new Ciudad(21, "Londres", 8982000, "EC1A 1BB");
        //Francia
        Ciudad ciudad22 = new Ciudad(22, "París", 2148327, "75001");
        //España
        Ciudad ciudad23 = new Ciudad(23, "Madrid", 3223334, "28001");
        
        //ASIA
        //Corea
        Ciudad ciudad24 = new Ciudad(24, "Seúl", 9760000, "04524");
        //Japon
        Ciudad ciudad25 = new Ciudad(25, "Tokio", 13929286, "100-0001");
        Ciudad ciudad26 = new Ciudad(26, "Osaka", 2715000, "530-0001");
        Ciudad ciudad27 = new Ciudad(27, "Nagoya", 2295000, "450-0001");
        //India
        Ciudad ciudad28 = new Ciudad(28, "Mumbai", 12478447, "400001");
        //Filipinas
        Ciudad ciudad29 = new Ciudad(29, "Manila", 1780148, "1000");
        //Tailandia
        Ciudad ciudad30 = new Ciudad(30, "Bangkok", 10539000, "10100");
        //Indonesia
        Ciudad ciudad31 = new Ciudad(31, "Jakarta", 10540000, "10110");
        //China
        Ciudad ciudad32 = new Ciudad(32, "Pekín", 21540000, "100000");
        
        //AFRICA
        //Sudáfrica
        Ciudad ciudad33 = new Ciudad(33, "Ciudad del Cabo", 433688, "8001");
        //Egipto
        Ciudad ciudad34 = new Ciudad(34, "El Cairo", 9500000, "11511");
        //Nigeria
        Ciudad ciudad35 = new Ciudad(35, "Lagos", 9000000, "100001");
        //Senegal
        Ciudad ciudad36 = new Ciudad(36, "Dakar", 1146053, "12000");
        
        
        List<Ciudad> listaPeru= new ArrayList<>();
        listaPeru.add(ciudad1);
        List<Ciudad> listaColombia= new ArrayList<>();
        listaColombia.add(ciudad2);
        List<Ciudad> listaArgentina= new ArrayList<>();
        listaArgentina.add(ciudad3);
        List<Ciudad> listaChile = new ArrayList<>();
        listaChile.add(ciudad4);
        List<Ciudad> listaMexico= new ArrayList<>();
        listaMexico.add(ciudad5);
        List<Ciudad> listaCanada= new ArrayList<>();
        listaCanada.add(ciudad6);
        List<Ciudad> listaBrasil= new ArrayList<>();
        listaBrasil.add(ciudad7);
        List<Ciudad> listaEEUU= new ArrayList<>();
        listaEEUU.add(ciudad8);
        
        List<Ciudad> listaAustralia= new ArrayList<>();
        listaAustralia.add(ciudad9);
        listaAustralia.add(ciudad10);
        List<Ciudad> listaNuevaZelanda= new ArrayList<>();
        listaNuevaZelanda.add(ciudad11);
        
        List<Ciudad> listaItalia= new ArrayList<>();
        listaItalia.add(ciudad12);
        listaItalia.add(ciudad13);
        listaItalia.add(ciudad14);
        List<Ciudad> listaRusia= new ArrayList<>();
        listaRusia.add(ciudad15);
        listaRusia.add(ciudad16);
        List<Ciudad> listaAustria= new ArrayList<>();
        listaAustria.add(ciudad17);
        List<Ciudad> listaSuecia= new ArrayList<>();
        listaSuecia.add(ciudad18);
        List<Ciudad> listaAlemania= new ArrayList<>();
        listaAlemania.add(ciudad19);
        listaAlemania.add(ciudad20);
        List<Ciudad> listaInglaterra= new ArrayList<>();
        listaInglaterra.add(ciudad21);
        List<Ciudad> listaFrancia= new ArrayList<>();
        listaFrancia.add(ciudad22);
        List<Ciudad> listaEspaña= new ArrayList<>();
        listaEspaña.add(ciudad23);
        
        List<Ciudad> listaCorea = new ArrayList<>();
        listaCorea.add(ciudad24);
        List<Ciudad> listaJapon = new ArrayList<>();
        listaJapon.add(ciudad25);
        listaJapon.add(ciudad26);
        listaJapon.add(ciudad27);
        List<Ciudad> listaIndia = new ArrayList<>();
        listaIndia.add(ciudad28);
        List<Ciudad> listaFilipinas = new ArrayList<>();
        listaFilipinas.add(ciudad29);
        List<Ciudad> listaTailandia = new ArrayList<>();
        listaTailandia.add(ciudad30);
        List<Ciudad> listaIndonesia = new ArrayList<>();
        listaIndonesia.add(ciudad31);
        List<Ciudad> listaChina = new ArrayList<>();
        listaChina.add(ciudad32);
        
        List<Ciudad> listaSudafrica = new ArrayList<>();
        listaSudafrica.add(ciudad33);
        List<Ciudad> listaEgipto = new ArrayList<>();
        listaEgipto.add(ciudad34);
        List<Ciudad> listaNigeria = new ArrayList<>();
        listaNigeria.add(ciudad35);
        List<Ciudad> listaSenegal = new ArrayList<>();
        listaSenegal.add(ciudad36);
        
       
                
        Pais peru = new Pais("PE", "Perú", "América", 1285216, 1, 33050325, listaPeru);
        Pais colombia = new Pais("CO", "Colombia", "América", 1141748, 2, 51515104, listaColombia);
        Pais argentina = new Pais("AR", "Argentina", "América", 2780400, 3, 45376763, listaArgentina);
        Pais chile = new Pais("CL", "Chile", "América", 756102.4, 38, 19116209, listaChile);
        Pais mexico = new Pais("MX", "México", "América", 1964375, 5, 128932753, listaMexico);
        Pais canada = new Pais("CA", "Canadá", "América", 9984670, 6, 38131104, listaCanada);
        Pais brasil = new Pais("BR", "Brasil", "América", 8515767, 42, 214326223, listaBrasil);
        Pais eeuu = new Pais("US", "Estados Unidos", "América", 9833517, 45, 331893745, listaEEUU);
        
        Pais australia = new Pais("AU", "Australia", "Oceanía", 7692024, 49, 25687041, listaAustralia);
        Pais nuevaZelanda = new Pais("NZ", "Nueva Zelanda", "Oceanía", 268838, 11, 5135300, listaNuevaZelanda);
        
        
        Pais italia = new Pais("IT", "Italia", "Europa", 301340, 12, 60243406, listaItalia);
        Pais rusia = new Pais("RU", "Rusia", "Europa", 17098242, 15, 144104080, listaRusia);
        Pais austria = new Pais("AT", "Austria", "Europa", 83879, 17, 9006400, listaAustria);
        Pais suecia = new Pais("SE", "Suecia", "Europa", 450295, 18, 10415811, listaSuecia);
        Pais alemania = new Pais("DE", "Alemania", "Europa", 357022, 19, 83149300, listaAlemania);
        Pais inglaterra = new Pais("GB", "Inglaterra", "Europa", 130279, 21, 56127000, listaInglaterra);
        Pais francia = new Pais("FR", "Francia", "Europa", 643801, 22, 67348000, listaFrancia);
        Pais españa = new Pais("ES", "España", "Europa", 505990, 23, 47450795, listaEspaña);
        
        
        Pais corea = new Pais("KR", "Corea del Sur", "Asia", 100210, 24, 51780579, listaCorea);
        Pais japon = new Pais("JP", "Japón", "Asia", 377975, 25, 125930000, listaJapon);
        Pais india = new Pais("IN", "India", "Asia", 3287263, 28, 1393409038, listaIndia);
        Pais filipinas = new Pais("PH", "Filipinas", "Asia", 300000, 29, 113891327, listaFilipinas);
        Pais tailandia = new Pais("TH", "Tailandia", "Asia", 513120, 30, 69950861, listaTailandia);
        Pais indonesia = new Pais("ID", "Indonesia", "Asia", 1904569, 31, 277534122, listaIndonesia);
        Pais china = new Pais("CN", "China", "Asia", 9596961, 32, 1411778724, listaChina);
        
        Pais sudafrica = new Pais("ZA", "Sudáfrica", "Africa", 1221037, 34, 59308690, listaSudafrica);
        Pais egipto = new Pais("EG", "Egipto", "Africa", 1002450, 35, 104258327, listaEgipto);
        Pais nigeria = new Pais("NG", "Nigeria", "Africa", 923769, 87, 206139589, listaNigeria);
        Pais senegal = new Pais("SN", "Senegal", "Africa", 196722, 37, 16743927, listaSenegal);
        
        List<Pais> paises = new ArrayList<>();
        paises.add(peru);
        paises.add(colombia);
        paises.add(argentina);
        paises.add(chile);
        paises.add(mexico);
        paises.add(canada);
        paises.add(brasil);
        paises.add(eeuu);
        paises.add(australia);
        paises.add(nuevaZelanda);
        paises.add(italia);
        paises.add(rusia);
        paises.add(austria);
        paises.add(suecia);
        paises.add(alemania);
        paises.add(inglaterra);
        paises.add(francia);
        paises.add(españa);
        
        paises.add(corea);
        paises.add(japon);
        paises.add(india);
        paises.add(filipinas);
        paises.add(tailandia);
        paises.add(indonesia);
        paises.add(china);
        
        paises.add(sudafrica);
        paises.add(egipto);
        paises.add(nigeria);
        paises.add(senegal);
        
         
        Genero accion = new Genero(1,"Acción");
        Genero aventura = new Genero(2,"Aventura");
        Genero comedia = new Genero(3,"Comedia");
        Genero drama = new Genero(4,"Drama");
        Genero terror = new Genero (5, "Terror");
        
        List<String> premios1 = new ArrayList<>();
        List<String> premios2 = new ArrayList<>();
        List<String>premios3 = new ArrayList<>();
        
        Director director1 = new Director(100,"Steven Spielberg",premios1);
        Director director2 = new Director(101,"Christopher Nolan", premios2);
        Director director3 = new Director(102,"Taika Waititi", premios3);
        Director director4 = new Director(103,"Peter Weir",premios1);
        
        
        //pelicula tiburon
        List<Director> lista1 = new ArrayList<>();
        lista1.add(director1);
        List<Genero> generos1 = new ArrayList<>();
        generos1.add(terror);
        Pelicula pelicula1 = new Pelicula(505,"Tiburón",1975,"5 estrellas",generos1,lista1);
        
        //pelicula The Dark Knight
        
        List<Director> lista2 = new ArrayList<>();
        lista2.add(director2);
        List<Genero> generos2 = new ArrayList<>();   
        generos2.add(drama);
        Pelicula pelicula2 = new Pelicula(506,"The Dark Knight",2010,"4 estrellas",generos2,lista2);
        
        
        // pelicula Jojo Rabbit
        List<Director> lista3 = new ArrayList<>();
        lista3.add(director3);
        List<Genero> generos3 = new ArrayList<>();
        generos3.add(drama);
        generos3.add(comedia);
        Pelicula pelicula3 = new Pelicula(507,"Jojo Rabbit",2019,"4 estrellas",generos3,lista3);
        
        
        //pelicula The Truman Show 
        List<Director> lista4 = new ArrayList<>();
        lista4.add(director4);
        List<Genero> generos4 = new ArrayList<>();
        generos4.add(drama);
        generos4.add(comedia);
        Pelicula pelicula4 = new Pelicula(508,"The Truman Show",1998,"4 estrellas",generos4,lista4);
        
        List<Pelicula> peliculas=new ArrayList<>();
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);
        
       System.out.println("1. Encontrar las ciudades más pobladas de cada continente. Considerar una condición para filtrar a las ciudades más pobladas.");
        
       Map<String, List<Ciudad>> ciudadesMasPobladasPorContinente = new HashMap<>();

        for (Pais pais : paises) {
            List<Ciudad> ciudadesFiltradas = pais.getCiudades().stream().filter(ciudad -> ciudad.getNroPoblacion() > 7000000).collect(Collectors.toList());
            String continente = pais.getNombreContinente();

            ciudadesMasPobladasPorContinente.putIfAbsent(continente, new ArrayList<>());
            ciudadesMasPobladasPorContinente.get(continente).addAll(ciudadesFiltradas);
            }
        for (Map.Entry<String, List<Ciudad>> entry : ciudadesMasPobladasPorContinente.entrySet()) {
                String continente = entry.getKey();
                List<Ciudad> ciudades = entry.getValue();
                System.out.println("Continente: " + continente);
                for (Ciudad ciudad : ciudades) {
                    System.out.println(ciudad.getNombreCiudad() + " con " + ciudad.getNroPoblacion() + " habitantes.");
                }
        }
        
        System.out.println("\n2. Encontrar la ciudad más poblada de todos los continentes (ASIA, AMÉRICA, ÁFRICA, EUROPA, OCEANÍA).");
        

        Ciudad ciudadMasPoblada = paises.stream().flatMap(pais -> pais.getCiudades().stream()).max(Comparator.comparingInt(Ciudad::getNroPoblacion)).orElse(null);

        if (ciudadMasPoblada != null) {
            System.out.println("La ciudad más poblada es " + ciudadMasPoblada.getNombreCiudad() + " con una población de " + ciudadMasPoblada.getNroPoblacion() + ".");
        } else {
            System.out.println("No se encontraron ciudades.");
        }
        
        
        
        System.out.println("\n3. Encontrar la lista de películas que tienen los géneros Drama y Comedia solamente.");
        List<Pelicula> peliculasDramaComedia = peliculas.stream()
            .filter(pelicula -> {
                List<Genero> generos = pelicula.getGeneros(); 
                return generos.stream().anyMatch(g -> g.getNombreGenero().equals("Drama")) && generos.stream().anyMatch(g -> g.getNombreGenero().equals("Comedia"));
            }).collect(Collectors.toList());

           for (Pelicula pelicula : peliculasDramaComedia) {
                System.out.println(pelicula.getTituloPelicula()); 
            }
            
        System.out.println("\n4. Ordena los países por número de sus ciudades en orden descendente.");
        List<Pais> paisesOrdenadosPorNumeroDeCiudades = paises.stream()
        .sorted((p1, p2) -> Integer.compare(p2.getCiudades().size(), p1.getCiudades().size())).collect(Collectors.toList());
   
        for (Pais pais : paisesOrdenadosPorNumeroDeCiudades) {
        System.out.println("País: " + pais.getNombrePais() + ",ciudades registradas: " + pais.getCiudades().size());
        }
        
        System.out.println("\n5. Ordena los países por número de población en orden ascendente.");
        List<Pais> ordenaPaises = paises.stream().sorted(Comparator.comparing(Pais::getNroPoblacion)).collect(Collectors.toList());
        
        for(Pais pais: ordenaPaises){
            System.out.println(pais.getNombrePais()+" tiene "+ pais.getNroPoblacion()+" de población.");
        }
                
   
    }
}

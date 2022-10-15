package co.edu.uniquindio.cineprime;

import co.edu.uniquindio.cineprime.entidades.Usuario;
import co.edu.uniquindio.cineprime.servicios.UsuarioServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest
//@Transactional
public class UsuarioServicioTest {

    @Autowired
    private UsuarioServicio usuarioServicio;

  //  @Sql("classpath:dataset.sql")

    /**
     * Test para registrar un usuario
     */
    @Test
    public void registrarUsuario() {
        Usuario usuario = new Usuario();
        try {
            usuario= usuarioServicio.registrarUsuario(1561,"sadasasds","sdsajsad","cristhian",2);
          // usuarioServicio.usarBono("COQJ8A9Z",usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @Test
    public void verificarLoginTest()
    {
        try {

            usuarioServicio.verificarLogin("cristhianmirandapro@gmail.com","andres1805");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }







    @Test
    public void recuperarContrasenaTest() throws Exception {
        try {
            usuarioServicio.recuperarContrasenaCorreo("cristhianmirandapro@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }






    //@Sql("classpath:dataset.sql")


    @Test
    public void ejercicio()

    {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(3);
        listaNumeros.add(2);
        listaNumeros.add(5);
        listaNumeros.add(5);
        listaNumeros.add(9);
        listaNumeros.add(9);
        listaNumeros.add(9);
//        System.out.println(numerosRepetidos(listaNumeros,listaNumeros.get(0),"",0,0)+"\n\n\n\n");
//        System.out.println(agruparNumeros(listaNumeros,listaNumeros.get(0))+"\n\n\n\n");

        int[] numeros = {1,2,2,3,3,2,5,5,9,9,9};
        Arrays.sort(numeros);
        System.out.println(pruebaTecnica(numeros));
    }

        @Test
        public void pruebaBuzz()
        {
            for(int i=1;i<=100;i++)
            {
                if(i%3==0)
                {
                    if(i%5==0)
                    {System.out.println(i+"fizz buzz");}
                    else{System.out.println(i+"buzz");}


                }else if(i%5==0)
                {
                    System.out.println(i+"fizz");
                }else{System.out.println(i);}

            }
        }

        @Test
        public String pruebaTecnica(int[] numeros)
        {
            int aux=numeros[0];
            String datos="";
            int j=0;
            for(int i=0;i<numeros.length;i++)
            {

               if(aux==numeros[i])
               {
                   j++;

               }else
               {
                   System.out.println(aux+" = "+j+"\n");
                   j=1;
                   aux=numeros[i];
               }

            }
            System.out.println(aux+" = "+j+"\n");
            return datos;
        }



        @Test
        public String agruparNumeros(ArrayList listaNumeros,int aux)
        {
          //  int aux= (int) listaNumeros.get(0);
            ArrayList<Integer> modificada = new ArrayList<Integer>();
            for(int i=0;i<=listaNumeros.size();i++)
            {
                if(i!=listaNumeros.size()) {
                    if(listaNumeros.get(i).equals(aux))
                    {
                        modificada.add(aux);
                    }else
                    {
                        if(!modificada.isEmpty()) {
                            System.out.println(imprimirArreglo(modificada));
                        }
                        modificada.clear();

                        aux= (int) listaNumeros.get(i);
                        i--;
                    }

                }else{
                    aux= (int) listaNumeros.get(i-1);
                    return imprimirArreglo(modificada);
                }
            }
            return "";
        }
//    @Test
//    public String prueba(ArrayList listaNumeros,int aux,int j,String lista) {
//       // String lista="";
//        ArrayList<Integer> modificada = new ArrayList<Integer>();
//
//            if(listaNumeros.get(j).equals(aux))
//            {
//                modificada.add(aux);
//                //lista = listaNumeros.get(j) + " = ";
//
//            }else {
//                lista+=imprimirArreglo(modificada);
//                System.out.println(lista+"ORYUEBAA");
//                modificada.clear();
//                j++;
//                return prueba(listaNumeros, (Integer) listaNumeros.get(j+1),j+1,lista);
//            }
//
//
//
//      return lista;
//    }
//    @Test
//    public String prueba(ArrayList listaNumeros,int i,int aux,String valor,ArrayList modificada)
//    {
//        if(i<listaNumeros.size()) {
//            if (listaNumeros.get(i).equals(aux)) {
//                modificada.add(aux);
//                return prueba(listaNumeros, i + 1, aux, "", modificada);
//            } else {
//                return prueba(listaNumeros, i, (Integer) listaNumeros.get(i), imprimirArreglo(modificada), modificada);
//            }
//        }else {
//            return "xDDDDDD";
//        }
//
//    }

    @Test
    public String imprimirArreglo(ArrayList lista)
    {
        String valor="";

        return  valor+= lista.get(0)+" = "+lista.size()+"\n";



    }



    @Test
    public String numerosRepetidos(ArrayList listaNumeros,int aux,String valor,int i,int j)
    {
        if(i<listaNumeros.size()) {
            if (listaNumeros.get(i).equals(aux)) {

                valor = listaNumeros.get(i) + " = ";
                return numerosRepetidos(listaNumeros, aux, valor, i + 1, j + 1);
            } else {
                valor += j + "\n";
                System.out.println(valor);

                return numerosRepetidos(listaNumeros, (Integer) listaNumeros.get(i), valor, i, 0);

            }
        }else {
            return valor+=j;
        }

    }






}

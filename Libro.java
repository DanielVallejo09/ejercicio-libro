
public class Libro
{
    private String Titulo;
    private String Autor;
    private int Paginas;
    private String NumeroDeReferencia;
    private int prestamos = 0;

/**
 * construimos un objeto nuevo dandole informacion
 * @Titulo = titulo del libro
 * @Autor = autor del libro
 * @Paginas = numero de paginas del libro
 * 
 */
public Libro(String TituloIni, String AutorIni, int PaginasIni)
{
    Titulo = TituloIni;
    Autor = AutorIni;
    Paginas = PaginasIni;
    NumeroDeReferencia = " ";
    
}

/**
 * Metodo para otorgar el numero de referencia y retornarlo
 */public String NoRef(String NumIni)
{
    NumeroDeReferencia = NumIni;
    return NumeroDeReferencia;
}

/**
 * Metodo para regresar el nombre del autor
 */
public String DimeAutor()
{
    return Autor;
}

/**
 * Metodo para regresar el titulo del libro
 */
public String DimeTitulo()
{
    return Titulo;
}

/**
 * Metodo para regresar el numero de paginas
 */
public int DimePaginas()
{
    return Paginas;
}

/**
 * Metodo para regresar los detalles en conjunto del libro
 * tiene condicionales del numero de referencia necesario
 */
public String RegresaDetalles()
{
    String CadRes = " ";
    
    CadRes = CadRes + "No.Paginas";
    CadRes = CadRes + ":";
    CadRes = CadRes + Paginas;
    CadRes = CadRes + "Nombre Autor";
    CadRes = CadRes + ":";
    CadRes = CadRes + Autor;
    CadRes = CadRes + "Nombre del Libro";
    CadRes = CadRes + ":";
    CadRes = CadRes + Titulo;
    CadRes = CadRes + "Prestamos";
    CadRes = CadRes + ":";
    CadRes = CadRes + prestamos;
    
    
    if(NumeroDeReferencia != " ")
     {
        CadRes = CadRes + "No. De Referencia";
        CadRes = CadRes + ":";
        CadRes = CadRes + NumeroDeReferencia;
      }
      else
      {
         CadRes = CadRes + "No. De Referencia";
        CadRes = CadRes + ":";
        CadRes = CadRes + "ZZZ"; 
        }
     
   
   
    return CadRes;
}

/**
 * Metodo para regresar el numero de referencia con la cadena
 */
public String numeroDeReferencia()
{
    
    String CadResultante = " ";
    CadResultante = CadResultante + NumeroDeReferencia;
    
    return CadResultante;
    
}

/**
 * Metodo para cambiar el numero de referencia e intercambiarlo
 */
public void cambiaNumero(String numRef)
{
    int var = numRef.length(); //Contamos la longitud de cadena y la almacenamos
    
    if(var >= 0) 
    {
       NumeroDeReferencia = numRef; //se hace el cambio
    }
}

/**
 * Metodo para hacer el numero de prestamos
 */
public void prestar()
{
    prestamos = prestamos + 1;
}

/**
 * Metodo para regresar el numero de prestamos
 */
public int dimePrestamos()
{
    return prestamos;
}
}

public class Libro
{
    private String Titulo;
    private String Autor;
    private int Paginas;
    private String NumeroDeReferencia;
    private int prestamos = 0;

public Libro(String TituloIni, String AutorIni, int PaginasIni)
{
    Titulo = TituloIni;
    Autor = AutorIni;
    Paginas = PaginasIni;
    NumeroDeReferencia = " ";
    
}

public String NoRef(String NumIni)
{
    NumeroDeReferencia = NumIni;
    return NumeroDeReferencia;
}

public String DimeAutor()
{
    return Autor;
}

public String DimeTitulo()
{
    return Titulo;
}

public int DimePaginas()
{
    return Paginas;
}

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

public String numeroDeReferencia()
{
    
    String CadResultante = " ";
    CadResultante = CadResultante + NumeroDeReferencia;
    
    return CadResultante;
    
}

public void cambiaNumero(String numRef)
{
    int var = numRef.length(); //Contamos la longitud de cadena y la almacenamos
    
    if(var >= 0) 
    {
       NumeroDeReferencia = numRef; //se hace el cambio
    }
}

public void prestar()
{
    prestamos = prestamos + 1;
}

public int dimePrestamos()
{
    return prestamos;
}
}
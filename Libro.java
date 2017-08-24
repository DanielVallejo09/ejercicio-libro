
public class Libro
{
    private String Titulo;
    private String Autor;
    private int Paginas;

public Libro(String TituloIni, String AutorIni, int PaginasIni)
{
    Titulo = TituloIni;
    Autor = AutorIni;
    Paginas = PaginasIni;
}


public String DimeAutor()
{
    System.out.print ("Dame el Autor del libro");
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
    
    return CadRes;
}
}
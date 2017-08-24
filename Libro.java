
public class Libro
{
    private String Titulo;
    private String Autor;

public Libro(String TituloIni, String AutorIni)
{
    Titulo = TituloIni;
    Autor = AutorIni;
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
}
public class Principal {
    
public static void main(String[] args) {
    
    Aluno aluno1 = new Aluno("Mariquinha",
    "mariquinha@gmail.com", 15, "01234567890", "TDSJG0552");
    System.out.println(aluno1.getNome());

    Professor prof1 = new Professor("Havana","HavanaAlves@gmail.com",
    20,"11223344556",1,"Ciência da Computação");
    System.out.println(prof1.getNome());
    
    Professor prof2 = new Professor("Eric","EricLuna@gmail.com",
    22,"11223344557",2,"Desenvolvimento web");
    System.out.println(prof2.getNome());
    
    Professor prof3 = new Professor("Tobias Raposo","undertaleDeltarune@gmail.com",
    32,"34194171281301981413",3,"Desenvolvimento de Jogos");
    System.out.println(prof3.getNome());
    
    tecAdm adm1 = new tecAdm("Amauri","AmauriLegal@gmail.com",
    30,"cpf.txt12",3,"Mestrado");
    adm1.imprimeInfo();
    
    tecAdm adm2 = new tecAdm("Johnatas","JohnatasJohnatasJohnatas@gmail.com",
    67,"2233445567",4,"Bachalerado");
    adm2.imprimeInfo();
    
    GrupoPesquisas gPesquisas = new GrupoPesquisas("123","Pixel++",
    "Grupo de pesquisa focado no estudo de como jogos são programados em C++","Jogos","Ciência da Computação",prof3);

}

}
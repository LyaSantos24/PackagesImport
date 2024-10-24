//import empresa1.Funcionario;

import empresa1.Funcionario;

public class PackagesImport {
    public static void main(String[] args) {

       //1) // Funcionario funcionario = new Funcionario();
      //1)//  empresa2.Funcionario  funcionario2 = new empresa2.Funcionario();

     //   empresa1.Funcionario funcionario1 = new Funcionario();
      //  funcionario1.marcos();
        Funcionario funcionario = new Funcionario();
        empresa1.Funcionario funcionario1 = new Funcionario();
        funcionario1.marcos();

    }


    // é importante fazer isso quando se tem classes com o mesmo nome
}



// se eu quisse colocar tudo junto, então exlcuiria o import la em cima : import empresa1.Funcionario;

// se ficaria assim:

//Funcionario ( esse seria o pacote pricipal default package)




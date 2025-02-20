public class MainClienteEndereco {

    public static void main(String[] args) {
    
            //Opção 1.
        Endereco endereco1 = new Endereco("rua são joão", "2", "Salvador");
        Cliente cliente1 = new Cliente("Jonas", "29", endereco1);

        System.out.println(cliente1.toString());


        //Opção 2.

        Cliente cliente2 = new Cliente("Marcos", "28", 
        new Endereco("Rua b", "20", "R"));
           
        System.out.println(cliente2.toString());
    }
}

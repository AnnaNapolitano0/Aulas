public class Produto {
    public static void main(String[] args) throws Exception {
          Produto p = new Produto();
            System.out.println("Valor 1: " + p.valor1);
     
            Produto pr = new Produto();
            p.valor3 = 35;
            System.out.println("Valor 1: " + p.valor1);
            System.out.println("Valor 3: " + p.valor3);
           
        
    }
}

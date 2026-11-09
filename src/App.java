public class App {
    public static void main(String[] args) throws Exception {
       Garcom g1 = new Garcom("Jean", 800.00);
       Garcom g2 = new Garcom("Laila", 1000.00);
       Garcom g3 = new Garcom("Gabe", 1500.00);

       System.out.println(g1.calcularComissao());
       g1.apresentarGarcom();
       

       System.out.println(g2.calcularComissao());
       g2.apresentarGarcom();


       System.out.println(g3.calcularComissao());
       g3.apresentarGarcom();




    }
}

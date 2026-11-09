public class Garcom {
    private String nome;
    private double valorVendas;

    public Garcom(String nome, double valorVendas) {
        this.nome = nome;
        this.valorVendas = valorVendas;
    }

    public double calcularComissao(){
        double comissaoBase = 0.0;
        double excesso = 0.0;
        double comissaoFinal = 0.0;



        if(valorVendas<=1000.0){
            return valorVendas * 0.05;
        }
        else{
            comissaoBase = 1000.00 * 0.05;
            excesso = valorVendas - 1000.00;
            comissaoFinal = excesso * 0.07;
        }
        return comissaoBase + comissaoFinal;
    }


    public void apresentarGarcom(){
        double totalReceber = valorVendas + calcularComissao();
        System.out.println("Nome: "+this.nome);
        System.out.println("Vendas: R$"+valorVendas);
        System.out.println("Valor Comissão: R$"+calcularComissao());
        System.out.println("Total a Receber: R$"+totalReceber);
        System.out.println();
    }

    

}

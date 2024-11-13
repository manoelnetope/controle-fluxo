public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 450000.0;
       double valorSolicitado = 34500.0;

       if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("Manoel Marques seu saldo é: " + "$ "+saldo);
       }else 
       
        System.out.println("Saldo Insuficiente.");
        
    }
}

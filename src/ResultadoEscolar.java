public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
       
       if(nota >= 7)
        System.out.println("Parabéns você foi Aprovado!!!! Sua nota: " + nota);

       else if (nota >= 5 && nota < 7)
        System.out.println("Você está em recuperação!!! Sua nota " + nota); 

       else
        System.out.println("Infelizmente você foi Reprovado!!! Sua nota: " + nota);
    }
}

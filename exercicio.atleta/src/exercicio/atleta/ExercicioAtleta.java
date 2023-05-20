package exercicio.atleta;

public class ExercicioAtleta {

    
    public static void main(String[] args) {
        Atleta a1 = new Atleta();
        a1.setNome("Arthur");
        a1.setAge(16);
        a1.setValorPatrocinio(3000);
        a1.setTaxaAumento(25);
        a1.getTotal();
        a1.mostrar();
        a1.setValor();
    }
    
}

package exercicio.atleta;
import javax.swing.JOptionPane;


class Atleta {
    protected String nome;
    protected int age;
    protected int valorPatrocinio;
    protected int taxaAumento;
    protected float total;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getValorPatrocinio() {
        return valorPatrocinio;
    }

    public void setValorPatrocinio(int valorPatrocinio) {
        this.valorPatrocinio = valorPatrocinio;
    }
    public int getTaxaAumento() {
        return taxaAumento;
    }
    public void setTaxaAumento(int taxaAumento) {
        this.taxaAumento = taxaAumento;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public float getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = valorPatrocinio * (taxaAumento/100);
    }
    
    public void atualizarValor(){

   }
    
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nome: " +  nome +  "\nIdade: " + age + "\nValor: " + valorPatrocinio + "\nTaxa: " + taxaAumento + "% " + "\nTotal: " + total);
    }
    
    void setValor() {
        int valorPatro = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor do novo patrocínio: "));
        int taxaAumento = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor da nova taxa: "));
        total = (valorPatro * taxaAumento/100);
        JOptionPane.showMessageDialog(null, "Nome: " +  nome +  "\nIdade: " + age + "\nNovo Valor: " + valorPatro + "\nTaxa: " + taxaAumento + "% " + "\nTotal: " + total);
    }

}

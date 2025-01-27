package Exercicio01.Itens;

public class Produto extends ItemPedido{
    private int codigo;
    private double preco;
    private String categoria;

    public Produto(){
    }

    public Produto(int codigo, double preco, String categoria){
        this.codigo = codigo;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", preco=" + preco + ", categoria=" + categoria + "]";
    }
}

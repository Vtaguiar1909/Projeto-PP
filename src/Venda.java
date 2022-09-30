import java.util.Date;
public class Venda {
    //Atributos
    private Date dataHora;
    private Collection<Item> produtos;
    private double precoTotal;
    private Cliente cliente;
    private Funcionario vendedor;
    
    public Venda(){

    }
    public Venda(Date dataHora, double precoTotal, Item produtos, Cliente cliente, Funcionario vendedor){
        this.dataHora = dataHora;
        this.precoTotal = precoTotal;
        this.produtos= produtos;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public void setDate(Date dataHora){
        this.dataHora = dataHora
    }
    public Date getDataHora(){
        return dataHora;
    }
    /*public void setProdutos(Collection<Item>produtos){
        this.produtos = produtos;
    }
    public Collection<Item> getProdutos() {
        return produtos;

    }*/
    public void setPrecoTotal(double precoTotal){
        this.precoTotal = precoTotal;
    }
    public double getPrecoTotal(){
        return precoTotal;
    }
    /*public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setVendedor(Funcionario vendedor){
        this.vendedor = vendedor;
    }
    public Funcionario getVendedor(){
        return vendedor;
    }*/
    }

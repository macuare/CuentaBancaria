public class CuentaTerminal {
    private int numero;
    private String Agencia;
    private String nombreCliente;
    private double saldo;

    public CuentaTerminal(int numero, String agencia, String nombreCliente, double saldo) {
        this.numero = numero;
        Agencia = agencia;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;

        this.mensaje();
    }

    public void mensaje(){
        System.out.println("Olá "+nombreCliente+", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+Agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

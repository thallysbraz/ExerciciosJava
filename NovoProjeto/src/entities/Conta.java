package entities;

public class Conta {

    private int numberConta;
    private String name;
    private double saldo;

    public Conta(int numberConta, String name, double initSaldo) {
        this.numberConta = numberConta;
        this.name = name;
        addSaldo(initSaldo);
    }

    public int getNumberConta() {
        return numberConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double balance) {
        this.saldo += balance;
    }

    public void removeSaldo(double balance) {
        this.saldo -= (balance + 5);
    }
}
public class Main {
    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo();
        meuVeiculo.setPlaca("ABC-1234");
        meuVeiculo.setMarca("Fiat");
        meuVeiculo.setModelo("Uno");
        meuVeiculo.setAno(2020);
        meuVeiculo.setValor(35000.00);

        System.out.println("Dados do Veículo:");
        System.out.println("Placa: " + meuVeiculo.getPlaca());
        System.out.println("Marca: " + meuVeiculo.getMarca());
        System.out.println("Modelo: " + meuVeiculo.getModelo());
        System.out.println("Ano: " + meuVeiculo.getAno());
        System.out.println("Valor: R$" + String.format("%.2f", meuVeiculo.getValor()));
        System.out.println("IPVA: R$" + String.format("%.2f", meuVeiculo.calcularIpva()));

        // Teste com outro veículo
        Veiculo outroVeiculo = new Veiculo();
        outroVeiculo.setPlaca("XYZ-5678");
        outroVeiculo.setMarca("Chevrolet");
        outroVeiculo.setModelo("Onix");
        outroVeiculo.setAno(2023);
        outroVeiculo.setValor(70000.00);

        System.out.println("\nDados do Outro Veículo:");
        System.out.println("Placa: " + outroVeiculo.getPlaca());
        System.out.println("Marca: " + outroVeiculo.getMarca());
        System.out.println("Modelo: " + outroVeiculo.getModelo());
        System.out.println("Ano: " + outroVeiculo.getAno());
        System.out.println("Valor: R$" + String.format("%.2f", outroVeiculo.getValor()));
        System.out.println("IPVA: R$" + String.format("%.2f", outroVeiculo.calcularIpva()));
    }
}

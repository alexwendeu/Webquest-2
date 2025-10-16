import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    public static void main(String[] args) {
        // Nomes completos dos integrantes (exemplo)
        // - Fulano de Tal
        // - Ciclano da Silva
        // - Beltrano de Souza

        List<Veiculo> veiculos = new ArrayList<>();

        // Adicionando carros
        veiculos.add(new Carro("ABC1234", "Fiat", "Uno", 2020, 35000.00, 4));
        veiculos.add(new Carro("DEF5678", "Chevrolet", "Onix", 2022, 60000.00, 4));
        veiculos.add(new Carro("GHI9012", "Volkswagen", "Gol", 2019, 40000.00, 2));

        // Adicionando motos
        veiculos.add(new Moto("JKL3456", "Honda", "CBR 500R", 2023, 30000.00, 500));
        veiculos.add(new Moto("MNO7890", "Yamaha", "Factor 150", 2021, 15000.00, 150));

        // Adicionando caminhões
        veiculos.add(new Caminhao("PQR1122", "Volvo", "FH 540", 2021, 400000.00, 7.5)); // Capacidade > 5
        veiculos.add(new Caminhao("STU3344", "Mercedes-Benz", "Accelo 1016", 2020, 250000.00, 4.0)); // Capacidade <= 5

        System.out.println("=== Veículos na Concessionária ===\n");

        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
            System.out.printf("IPVA: R$ %.2f\n", veiculo.calcularIpva());
            System.out.println("----------------------------------");
        }
    }
}


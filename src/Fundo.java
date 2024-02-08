import java.time.LocalDate;

public class Fundo{
    private LocalDate date;
    private Double rentabilidade;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(Double rentabilidade) {
        this.rentabilidade = rentabilidade;
    }
}

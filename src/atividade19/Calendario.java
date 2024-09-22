package atividade19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class Calendario {
    private int ano;
    private Map<String, String> feriados;

    public Calendario(int ano) {
        this.ano = ano;
        feriados = new HashMap<>();

        feriados.put("01-01", "Ano Novo");
        feriados.put("20-02", "Carnaval"); 
        feriados.put("21-02", "Carnaval (2º dia)"); 
        feriados.put("07-04", "Dia da Saúde");
        feriados.put("21-04", "Tiradentes");
        feriados.put("01-05", "Dia do Trabalhador");
        feriados.put("08-06", "Corpus Christi");
        feriados.put("15-11", "Proclamação da República");
        feriados.put("25-12", "Natal");
        feriados.put("02-11", "Finados");
        feriados.put("08-03", "Dia Internacional da Mulher");
        feriados.put("12-10", "Dia de Nossa Senhora Aparecida");
    }

    public void exibirCalendarioMes(int mes) {
        System.out.printf("Calendário de %d/%d:\n", mes, ano);
        System.out.println("Su Mo Tu We Th Fr Sa");

        LocalDate primeiroDia = LocalDate.of(ano, mes, 1);
        int diaDaSemana = primeiroDia.getDayOfWeek().getValue() % 7;

        for (int i = 0; i < diaDaSemana; i++) {
            System.out.print("   ");
        }

        for (int dia = 1; dia <= primeiroDia.lengthOfMonth(); dia++) {
            System.out.printf("%2d ", dia);
            if ((dia + diaDaSemana) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public boolean ehFeriado(LocalDate data) {
        String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd-MM"));
        return feriados.containsKey(dataFormatada);
    }

    public String getFeriado(LocalDate data) {
        String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd-MM"));
        return feriados.get(dataFormatada);
    }

    public long diferencaDias(LocalDate data1, LocalDate data2) {
        return Math.abs(ChronoUnit.DAYS.between(data1, data2)); 
    }
}




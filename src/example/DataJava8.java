package example;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataJava8 {

    public static void main(String[] args){

        // Pega a Data corrente(hj)
        LocalDate dataDeHoje = LocalDate.now();

        // Olimpiadas do Rio
        LocalDate dataOlimpiadas = LocalDate.of(2020, Month.JUNE, 01);

        System.out.println(dataOlimpiadas);

        int anosParaOlimpiadas = dataOlimpiadas.getYear() - dataDeHoje.getYear();

        System.out.println(anosParaOlimpiadas);

        // Pega o periodo entre determinadas datas podendo pegar todo o periodo ou ano,mes,dia
        Period periodo = Period.between(dataDeHoje,dataOlimpiadas);
        System.out.println(periodo); // 1 ano 6 meses e 2 dias
        System.out.println(periodo.getDays());

        //Somou + 4 anos
        LocalDate proximasOlimpiadas = dataOlimpiadas.plusYears(4);

        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatadorPadraoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorPadraoBR2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        System.out.println(proximasOlimpiadas.format(formatadorPadraoBR));


        //-------------Trabalhando com horas--------------//

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorPadraoBR2));

        System.out.println(agora.toLocalDate());
        System.out.println(agora.toLocalTime());

        YearMonth anoMes = YearMonth.from(agora);
        System.out.println(anoMes);

        LocalTime intervalo = LocalTime.of(agora.getHour(),agora.getMinute());
        System.out.println(intervalo);


    }

}

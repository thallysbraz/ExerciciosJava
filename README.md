# ExerciciosJava

## 1 - LISTAS

Para remover todos os nomes, cujo a letra inicial e M dentro da lista, faça:

```bash
list.removeIf(x -> x.charAt(0) == 'M');
```

Para obter o indice de algum elemento dentro da lista faça:

```bash
list.indexOf(<elemento desejado>)
System.out.println("Index of Braz: " + list.indexOf("Braz"));
```

Se encontrar o elemento, ele retorna o valor do indice encontrado. Se não achar, ele retorna -1

Para filtrar a lista e deixar somente os valores que atendam algum predicado faça:

```bash
List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
```

Para encontrar algum elemento cujo nome começa com uma determinada letra faça:

```bash
String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
System.out.println("Primeiro nome com a letra P: " + name);
```

## 2 - Datas em Java

Somando uma unidade de tempo

```bash
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
System.out.println(sdf.format(d));
Calendar cal = Calendar.getInstance(); cal.setTime(d); cal.add(Calendar.HOUR_OF_DAY, 4); d = cal.getTime();
System.out.println(sdf.format(d));
```

### 2.1 - Data com Calendar

Fazendo formatações de datas e separando dia, mês, ano, hora, minuto, segundo e milisegundos usando Calendar

```bash
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date now = new Date();
        System.out.println();
        System.out.println("Now: " + sdf.format(now));
        System.out.println();

        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int day = cal.get(Calendar.DAY_OF_WEEK); // pegando dia
        int month = 1 + cal.get(Calendar.MONTH); // pegando mes
        int year = cal.get(Calendar.YEAR); // pegando ano
        int hour = cal.get(Calendar.HOUR); // pegando a hora
        int minutes = cal.get(Calendar.MINUTE); // pegando minutos
        int segundos = cal.get(Calendar.SECOND); // pegando segundos
        int millis = cal.get(Calendar.SECOND); // pegando milisegundos

        System.out.println("Dia: " + day);
        System.out.println("Mes: " + month);
        System.out.println("Ano: " + year);
        System.out.println();
        System.out.println("Horas: " + hour);
        System.out.println("Minutos: " + minutes);
        System.out.println("Segundos: " + segundos);
        System.out.println("Mili segundos: " + millis);
        System.out.println();
        System.out.println(
                "Dia " + day + " do " + month + " de " + year + " às " + hour + "H" + minutes + "M" + segundos + "S");
        System.out.println();
        System.out.println("----------------------------------------------");
        // Aumentando 4 horas do horário atual
        cal.add(Calendar.HOUR_OF_DAY, 4);
        now = cal.getTime();

        day = cal.get(Calendar.DAY_OF_WEEK); // pegando dia
        month = 1 + cal.get(Calendar.MONTH); // pegando mes
        year = cal.get(Calendar.YEAR); // pegando ano
        hour = cal.get(Calendar.HOUR); // pegando a hora
        minutes = cal.get(Calendar.MINUTE); // pegando minutos
        millis = cal.get(Calendar.SECOND); // pegando mili segundos

        System.out.println();
        System.out.println("Now format: " + sdf.format(now));
        System.out.println();
        System.out.println("Dia: " + day);
        System.out.println("Mes: " + month);
        System.out.println("Ano: " + year);
        System.out.println();
        System.out.println("Horas: " + hour);
        System.out.println("Minutos: " + minutes);
        System.out.println("Segundos: " + segundos);
        System.out.println("Mili segundos: " + millis);
        System.out.println();

        System.out.println(
                "Dia " + day + " do " + month + " de " + year + " às " + hour + "H" + minutes + "M" + segundos + "S");
```

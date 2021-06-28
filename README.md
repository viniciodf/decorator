Padroes de Projeto

1) Criacionais -> Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.
2) Estruturais -> Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.
3) Comportamentais -> Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.

* Estruturais

4.Decorator

O que é:
O Decorator é um padrão estrutural que permite adicionar novos comportamentos aos objetos dinamicamente, colocando-os dentro de objetos wrapper especiais.

Aplicabilidade:
Utilize o padrão Decorator quando você precisa ser capaz de projetar comportamentos adicionais para objetos em tempo de execução sem quebrar o código que usa esses objetos.
Utilize o padrão quando é complicado ou impossível estender o comportamento de um objeto usando herança.

Identificação:
O Decorator pode ser reconhecido por métodos de criação ou construtores que aceitam objetos da mesma classe ou interface que uma classe atual.

Exempos de utilizacao:
java.io.InputStream
javax.servlet.http.HttpServletRequestWrapper
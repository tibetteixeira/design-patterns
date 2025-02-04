# Padrões de Projeto em Java

Este repositório contém implementações dos principais padrões de projeto em Java. Cada diretório dentro deste repositório é dedicado a um padrão de projeto específico, exemplificando como ele pode ser aplicado no desenvolvimento de software.

## Sumário

Este projeto serve como uma coleção de exemplos práticos e explicações sobre os principais **padrões de projeto** no contexto de Java. A ideia é fornecer soluções reutilizáveis, organizadas e bem documentadas para problemas comuns de design de software.

## Padrões de Projeto Incluídos

Abaixo estão os principais padrões de projeto implementados neste repositório:

### Padrões Criacionais
1. **[Singleton](/src/main/java/io/tibetteixeira/creational/singleton)** - Garantir que uma classe tenha apenas uma instância e fornecer um ponto global de acesso.
2. **[Factory Method](/src/main/java/io/tibetteixeira/creational/factorymethod)** - Definir uma interface para criar um objeto, mas permitir que subclasses decidam qual classe instanciar.
3. **[Abstract Factory](/src/main/java/io/tibetteixeira/creational/abstractfactory)** - Interface para criar famílias de objetos relacionados, sem especificar suas classes concretas.
4. **[Builder](/src/main/java/io/tibetteixeira/creational/builder)** - Separar a construção de um objeto complexo de sua representação, permitindo a criação de diferentes representações.
5. **[Prototype](/src/main/java/io/tibetteixeira/creational/prototype)** - Criar objetos clonando-os a partir de protótipos em vez de criar outro objeto a partir do zero.

### Padrões Estruturais
1. **[Adapter](/src/main/java/io/tibetteixeira/structural/adapter)** - Converter a interface de uma classe em outra que os clientes esperam.
2. **[Bridge](/src/main/java/io/tibetteixeira/structural/bridge)** - Separar a abstração da implementação, permitindo que ambas evoluam independentemente.
3. **[Composite](/src/main/java/io/tibetteixeira/structural/composite)** - Compor objetos em estruturas de árvore para representar hierarquias parte-todo.
4. **[Decorator](/src/main/java/io/tibetteixeira/structural/decorator)** - Anexar responsabilidades adicionais a um objeto dinamicamente.
5. **[Facade](/src/main/java/io/tibetteixeira/structural/facade)** - Fornecer uma interface unificada para um conjunto de interfaces em um subsistema.
6. **[Flyweight](/src/main/java/io/tibetteixeira/structural/flyweight)** - Usar o compartilhamento para suportar grandes quantidades de objetos de forma eficiente.
7. **[Proxy](/src/main/java/io/tibetteixeira/structural/proxy)** - Fornecer um objeto substituto que controla o acesso a outro objeto.

### Padrões Comportamentais
1. **[Chain of Responsibility](/src/main/java/io/tibetteixeira/behavioral/chain)** - Evitar o acoplamento do remetente de uma solicitação ao seu receptor, permitindo que mais de um objeto tenha a oportunidade de tratar a solicitação.
2. **[Command](/src/main/java/io/tibetteixeira/behavioral/command)** - Encapsular uma solicitação como um objeto, permitindo que os parâmetros sejam passados, armazenados e manipulados.
3. **[Iterator](/src/main/java/io/tibetteixeira/behavioral/iterator)** - Fornecer uma maneira de acessar os elementos de um objeto agregado sequencialmente, sem expor a sua representação subjacente.
4. **[Mediator](/src/main/java/io/tibetteixeira/behavioral/mediator)** - Definir um objeto que centraliza a comunicação entre objetos, evitando o acoplamento direto entre eles.
5. **[Memento](/src/main/java/io/tibetteixeira/behavioral/memento)** - Capturar e externalizar o estado interno de um objeto sem violar o encapsulamento, permitindo que o objeto seja restaurado posteriormente.
6. **[Observer](/src/main/java/io/tibetteixeira/behavioral/observer)** - Definir uma dependência um-para-muitos entre objetos, de forma que, quando um objeto mudar de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.
7. **[State](/src/main/java/io/tibetteixeira/behavioral/state)** - Permitir que um objeto altere o seu comportamento quando o seu estado interno mudar.
8. **[Strategy](/src/main/java/io/tibetteixeira/behavioral/strategy)** - Definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis.
9. **[Template Method](/src/main/java/io/tibetteixeira/behavioral/template)** - Definir o esqueleto de um algoritmo, deixando alguns passos a serem implementados pelas subclasses.

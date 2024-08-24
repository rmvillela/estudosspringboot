# Projeto de Controle de Estoque

Este projeto faz parte dos estudos na disciplina de **Desenvolvimento Backend** do curso de **Engenharia de Software** da **Uninter**. O objetivo do projeto é implementar um sistema simples de controle de estoque utilizando o **Spring Framework**.

## Funcionalidades Principais

- **Cadastro de Cliente:** Permite o cadastro e gerenciamento de informações de clientes.
- **Cadastro de Fornecedor:** Permite o cadastro e gerenciamento de informações de fornecedores.
- **Cadastro de Produto:** Permite o cadastro e gerenciamento de informações de produtos, como nome, descrição, preço e quantidade em estoque.
- **Cadastro de Nota de Entrada:** Registro das notas fiscais de entrada de produtos, atualizando o estoque conforme necessário.
- **Cadastro de Nota de Saída:** Registro das notas fiscais de saída de produtos, diminuindo a quantidade em estoque conforme necessário.
- **Controle de Estoque:** Gerencia a quantidade de produtos disponíveis, acompanhando entradas e saídas.

## Tecnologias Utilizadas

- **Java** (versão a ser definida)
- **Spring Framework** (incluindo Spring Boot, Data JPA, e outros módulos conforme necessário)
- Outras tecnologias e frameworks serão definidos ao longo do desenvolvimento do projeto.

## Estrutura do Projeto

O projeto será dividido nas seguintes camadas:

- **Model:** Representa as entidades principais como Cliente, Fornecedor, Produto, Nota de Entrada e Nota de Saída.
- **Repository:** Interface para comunicação com o banco de dados, utilizando Spring Data JPA.
- **Service:** Contém a lógica de negócios, como cálculos e validações.
- **Controller:** Gerencia as requisições HTTP, mapeando-as para os serviços correspondentes.

## Como Executar o Projeto

1. Clone este repositório.
2. Importe o projeto em sua IDE preferida (recomenda-se IntelliJ IDEA ou Eclipse).
3. Configure o banco de dados (mais detalhes serão adicionados conforme o projeto avança).
4. Execute a aplicação Spring Boot.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorar este projeto.

## Licença

Este projeto é para fins educacionais e não possui uma licença específica.

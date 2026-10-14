# 📚 Sistema Biblioteca

Sistema de gerenciamento de biblioteca desenvolvido em Java, com foco em programação orientada a objetos, persistência de dados e aplicação de regras de negócio.

O projeto tem como objetivo desenvolver uma aplicação capaz de gerenciar o acervo de uma biblioteca, seus usuários, exemplares e empréstimos, utilizando uma arquitetura organizada e de fácil manutenção.

> **Status:** Em desenvolvimento — V1.

## 🎯 Objetivos

- Aplicar conceitos de Programação Orientada a Objetos (POO).
- Desenvolver uma arquitetura em camadas.
- Implementar persistência de dados com PostgreSQL e JDBC.
- Aplicar regras de negócio para o gerenciamento de bibliotecas.
- Praticar SQL, modelagem de dados, tratamento de exceções e boas práticas de desenvolvimento.
- Utilizar Git e GitHub para versionamento e documentação do projeto.

## ⚙️ Tecnologias

- **Java 17** — linguagem de programação.
- **Maven** — gerenciamento de dependências e build.
- **PostgreSQL** — banco de dados relacional.
- **JDBC** — comunicação entre Java e PostgreSQL.
- **Git e GitHub** — versionamento e hospedagem do código.

## 📌 Funcionalidades previstas para a V1

### Autenticação
- Login do administrador.
- Validação das credenciais.
- Controle de acesso às operações administrativas.

### Gerenciamento de livros
- Cadastrar livros.
- Consultar e listar livros.
- Atualizar informações.
- Inativar livros.

### Gerenciamento de autores e categorias
- Cadastrar, consultar e atualizar autores.
- Cadastrar, consultar e atualizar categorias.

### Gerenciamento de exemplares
- Registrar exemplares associados aos livros.
- Consultar a situação de cada exemplar.
- Controlar a disponibilidade para empréstimo.

### Gerenciamento de usuários
- Cadastrar e consultar usuários.
- Atualizar informações.
- Bloquear ou reativar usuários.

### Empréstimos e devoluções
- Registrar empréstimos.
- Registrar devoluções.
- Consultar o histórico de empréstimos.
- Verificar a disponibilidade dos exemplares.
- Aplicar as regras de empréstimo definidas pelo sistema.

*As funcionalidades serão implementadas progressivamente durante o desenvolvimento.*

## 🏗️ Arquitetura

O projeto utiliza uma arquitetura em camadas para separar responsabilidades e facilitar a manutenção.

```text
SistemaBiblioteca/
├── backend/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── br/com/biblioteca/
│           │       ├── application/
│           │       ├── controller/
│           │       ├── service/
│           │       ├── repository/
│           │       ├── model/
│           │       ├── dto/
│           │       ├── exception/
│           │       ├── config/
│           │       └── util/
│           └── resources/
├── database/
│   ├── schema.sql
│   └── seed.sql
├── docs/
├── .env.example
├── .gitignore
└── README.md
```

**Responsabilidades das camadas:**

- `application`: inicialização da aplicação.
- `controller`: recebe e coordena as solicitações da interface ou API, conforme a implementação.
- `service`: concentra as regras de negócio.
- `repository`: executa operações de persistência e consultas ao banco.
- `model`: representa as entidades do domínio.
- `dto`: define objetos utilizados na transferência de dados, quando necessários.
- `exception`: organiza exceções específicas da aplicação.
- `config`: concentra configurações, incluindo a conexão com o banco.
- `util`: reúne utilitários de uso geral.

A estrutura poderá evoluir conforme as necessidades da implementação.

## 🗄️ Banco de dados

O PostgreSQL armazena os dados da aplicação.

As principais entidades previstas são:

- Administradores
- Usuários
- Autores
- Categorias
- Livros
- Exemplares
- Empréstimos

Os scripts SQL são mantidos no repositório para documentar a estrutura do banco e facilitar sua criação em outros ambientes.

- `schema.sql`: cria tabelas, relacionamentos e restrições.
- `seed.sql`: insere dados iniciais ou de teste.

As credenciais do banco devem ser configuradas localmente por meio de variáveis de ambiente e **não devem ser publicadas no GitHub**.

## 🚀 Configuração e execução

### Pré-requisitos

- JDK 17 ou compatível com a versão configurada no projeto.
- Maven.
- PostgreSQL.
- Um cliente para executar e administrar comandos SQL, como pgAdmin.

### 1. Clone o repositório

```bash
git clone <URL_DO_REPOSITORIO>
cd SistemaBiblioteca
```

### 2. Configure o banco de dados

Crie um banco de dados chamado `biblioteca` no PostgreSQL.

Execute os scripts na seguinte ordem:

1. `database/schema.sql`
2. `database/seed.sql`

### 3. Configure as variáveis de ambiente

Use o arquivo `.env.example` como referência para criar seu `.env` local. Preencha as variáveis necessárias para a conexão com o PostgreSQL.

Não compartilhe o arquivo `.env`, pois ele pode conter credenciais.

### 4. Execute a aplicação

Entre na pasta do backend e execute:

```bash
cd backend
mvn clean compile
```

A compilação verifica se o código compila corretamente. A forma de iniciar a aplicação dependerá da implementação da classe principal.

## 🧭 Próximas etapas

- [ ] Validar a conexão com o PostgreSQL.
- [ ] Implementar o acesso a dados do administrador.
- [ ] Implementar o login.
- [ ] Desenvolver o gerenciamento de livros.
- [ ] Desenvolver o gerenciamento de autores e categorias.
- [ ] Desenvolver o gerenciamento de exemplares e usuários.
- [ ] Implementar empréstimos e devoluções.
- [ ] Criar testes automatizados.
- [ ] Documentar as decisões de arquitetura e as regras de negócio.

## 📖 Documentação

A documentação complementar está organizada na pasta `docs/`, incluindo requisitos, regras de negócio, casos de uso, modelo de domínio, banco de dados e documentação da API, caso seja implementada.

## 👨‍💻 Sobre o projeto

Este projeto faz parte da minha jornada de aprendizado em Desenvolvimento de Sistemas, com foco no aprofundamento em Java, backend, bancos de dados relacionais e engenharia de software.

O desenvolvimento será incremental, priorizando a compreensão dos conceitos, a separação de responsabilidades e a implementação consistente das regras de negócio.

---

**Projeto em desenvolvimento.**
# Requisitos — Sistema Biblioteca

## 1. Objetivo

O Sistema Biblioteca tem como objetivo permitir que o administrador de uma biblioteca gerencie o acervo, os usuários cadastrados e os empréstimos de livros.

A primeira versão do sistema será focada nas operações essenciais de uma biblioteca, mantendo uma arquitetura preparada para futuras funcionalidades.

---

## 2. Escopo da V1

A V1 permitirá que um administrador autenticado:

- Gerencie livros.
- Gerencie autores.
- Gerencie categorias.
- Gerencie exemplares físicos dos livros.
- Cadastre e gerencie usuários da biblioteca.
- Registre empréstimos.
- Registre devoluções.
- Consulte o histórico de empréstimos.
- Consulte a disponibilidade dos exemplares.
- Consulte informações dos livros.
- Consulte usuários cadastrados.

Os usuários da biblioteca não possuirão acesso ao sistema na V1.

---

## 3. Usuários do sistema

### 3.1 Administrador

O administrador é o único usuário que possui acesso ao sistema.

Ele poderá:

- Fazer login.
- Encerrar sua sessão.
- Cadastrar livros.
- Alterar livros.
- Inativar livros.
- Gerenciar autores.
- Gerenciar categorias.
- Gerenciar exemplares.
- Cadastrar usuários.
- Alterar dados dos usuários.
- Bloquear ou desbloquear usuários.
- Registrar empréstimos.
- Registrar devoluções.
- Consultar empréstimos.
- Consultar histórico.

### 3.2 Usuário da biblioteca

O usuário da biblioteca representa uma pessoa que pode realizar empréstimos.

Na V1, ele:

- Não possui login.
- Não possui senha.
- Não acessa o sistema.
- É cadastrado e gerenciado pelo administrador.
- Pode possuir empréstimos.
- Pode estar ativo ou bloqueado.

---

## 4. Requisitos funcionais

### RF01 — Autenticação do administrador

O sistema deve permitir que o administrador faça login utilizando suas credenciais.

### RF02 — Gerenciamento de livros

O administrador deve poder:

- Cadastrar livros.
- Visualizar livros.
- Atualizar livros.
- Inativar livros.
- Consultar informações de um livro.

### RF03 — Gerenciamento de autores

O administrador deve poder cadastrar, visualizar, atualizar e gerenciar autores.

### RF04 — Gerenciamento de categorias

O administrador deve poder cadastrar, visualizar, atualizar e gerenciar categorias.

### RF05 — Gerenciamento de exemplares

O administrador deve poder cadastrar exemplares físicos associados a um livro.

O sistema deve permitir consultar o status de cada exemplar.

### RF06 — Gerenciamento de usuários

O administrador deve poder:

- Cadastrar usuários.
- Visualizar usuários.
- Atualizar dados dos usuários.
- Bloquear usuários.
- Desbloquear usuários.

### RF07 — Registro de empréstimo

O administrador deve poder registrar um empréstimo para um usuário ativo utilizando um exemplar disponível.

### RF08 — Registro de devolução

O administrador deve poder registrar a devolução de um exemplar emprestado.

### RF09 — Consulta de empréstimos

O administrador deve poder visualizar:

- Empréstimos ativos.
- Empréstimos atrasados.
- Empréstimos devolvidos.
- Histórico de empréstimos de um usuário.

### RF10 — Consulta de disponibilidade

O sistema deve informar quais exemplares estão disponíveis para empréstimo.

---

## 5. Requisitos não funcionais

### RNF01 — Persistência

Os dados devem ser armazenados em PostgreSQL.

### RNF02 — Backend

O backend deve ser desenvolvido em Java.

### RNF03 — Comunicação

O frontend deve se comunicar com o backend através de uma API HTTP utilizando JSON.

### RNF04 — Integridade

O sistema deve impedir operações que violem as regras de negócio.

### RNF05 — Segurança

A senha do administrador não deve ser armazenada em texto puro.

### RNF06 — Separação de responsabilidades

O sistema deve separar as responsabilidades entre:

- Controller
- Service
- Repository
- Model
- DTO
- Exception

### RNF07 — Configuração

Credenciais e informações sensíveis de conexão com o banco não devem ser armazenadas diretamente no código-fonte.

### RNF08 — Manutenibilidade

O código deve ser organizado para permitir futuras alterações e expansão do sistema.

---

## 6. Fora do escopo da V1

As seguintes funcionalidades não fazem parte da V1:

- Login de usuários da biblioteca.
- Aplicativo mobile.
- Sistema de multas.
- Sistema de reservas.
- Notificações por e-mail.
- Notificações push.
- Relatórios avançados.
- Dashboard avançado.
- Sistema de recomendação.
- Integração com serviços externos.

Essas funcionalidades poderão ser consideradas em versões futuras.
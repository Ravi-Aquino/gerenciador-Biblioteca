# Regras de Negócio — Sistema Biblioteca

## Usuários

### RN01 — Identificação do usuário

Todo usuário cadastrado deve possuir um identificador único.

### RN02 — CPF único

O CPF de um usuário deve ser único no sistema.

Não deve ser possível cadastrar dois usuários com o mesmo CPF.

### RN03 — Status do usuário

Um usuário pode possuir os seguintes estados:

- ATIVO
- BLOQUEADO

### RN04 — Usuário bloqueado

Um usuário bloqueado não pode realizar novos empréstimos.

### RN05 — Usuário ativo

Somente usuários ativos podem receber novos empréstimos.

### RN06 — Limite de empréstimos

Um usuário pode possuir no máximo 3 empréstimos ativos simultaneamente.

---

## Livros

### RN07 — Identificação do livro

Todo livro deve possuir um identificador único.

### RN08 — ISBN único

O ISBN de um livro deve ser único no sistema.

### RN09 — Livro inativo

Um livro inativo não deve permitir novos exemplares ou operações de empréstimo, conforme as regras do sistema.

### RN10 — Disponibilidade

A quantidade de exemplares disponíveis de um livro deve ser obtida através dos seus exemplares.

O sistema não deve armazenar uma quantidade de disponibilidade como dado independente.

---

## Exemplares

### RN11 — Exemplar pertence a um livro

Todo exemplar deve estar associado a exatamente um livro.

### RN12 — Status do exemplar

Um exemplar pode possuir os seguintes estados:

- DISPONIVEL
- EMPRESTADO
- MANUTENCAO

### RN13 — Exemplar disponível

Somente exemplares com status DISPONIVEL podem ser emprestados.

### RN14 — Exemplar emprestado

Ao registrar um empréstimo, o exemplar deve passar para o status EMPRESTADO.

### RN15 — Exemplar devolvido

Ao registrar uma devolução, o exemplar deve voltar para o status DISPONIVEL, salvo se houver alguma regra futura que determine sua manutenção.

---

## Empréstimos

### RN16 — Usuário obrigatório

Todo empréstimo deve estar associado a um usuário.

### RN17 — Exemplar obrigatório

Todo empréstimo deve estar associado a um exemplar específico.

### RN18 — Usuário ativo

Um empréstimo só pode ser criado para um usuário com status ATIVO.

### RN19 — Limite de empréstimos

Um usuário não pode possuir mais de 3 empréstimos ativos simultaneamente.

### RN20 — Exemplar disponível

Um empréstimo só pode ser criado quando o exemplar estiver DISPONIVEL.

### RN21 — Data de empréstimo

A data de início do empréstimo deve ser definida automaticamente pelo sistema.

O administrador não deve precisar informar manualmente essa data.

### RN22 — Prazo

O prazo padrão de um empréstimo é de 14 dias.

### RN23 — Data prevista de devolução

A data prevista de devolução deve ser calculada automaticamente:

    data prevista = data do empréstimo + 14 dias

### RN24 — Status inicial

Todo novo empréstimo deve possuir status ATIVO.

### RN25 — Devolução

Ao registrar uma devolução:

- O empréstimo deve receber status DEVOLVIDO.
- A data de devolução deve ser registrada.
- O exemplar deve voltar para DISPONIVEL.

### RN26 — Empréstimo atrasado

Um empréstimo ATIVO cuja data prevista de devolução tenha sido ultrapassada deve ser considerado ATRASADO.

A V1 poderá calcular essa condição durante a consulta, sem necessidade de um processo automático em segundo plano.

### RN27 — Empréstimo já devolvido

Um empréstimo com status DEVOLVIDO não pode ser devolvido novamente.

### RN28 — Exemplar com empréstimo ativo

Um exemplar não pode possuir mais de um empréstimo ativo simultaneamente.

---

## Administrador

### RN29 — Acesso restrito

Somente administradores autenticados podem acessar as operações administrativas do sistema.

### RN30 — Usuários não possuem login

Os usuários da biblioteca não possuem autenticação ou acesso ao sistema na V1.

### RN31 — Operações administrativas

Operações de gerenciamento de livros, usuários, exemplares e empréstimos devem exigir autenticação do administrador.

---

## Integridade

### RN32 — Chaves estrangeiras

Relacionamentos entre entidades devem ser protegidos por chaves estrangeiras no banco de dados.

### RN33 — Campos obrigatórios

Informações obrigatórias não podem ser armazenadas como nulas.

### RN34 — Regras no backend

As regras de negócio devem ser validadas pelo backend.

O frontend não deve ser responsável por garantir a integridade das operações.

### RN35 — Integridade no banco

Sempre que possível, regras estruturais devem também ser protegidas pelo banco de dados através de:

- PRIMARY KEY
- FOREIGN KEY
- UNIQUE
- NOT NULL
- CHECK
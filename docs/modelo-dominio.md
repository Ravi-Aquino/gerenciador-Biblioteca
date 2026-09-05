# Modelo de Domínio — Sistema Biblioteca

## Visão geral

O domínio do sistema é composto principalmente pelas seguintes entidades:

- Administrador
- Usuario
- Livro
- Autor
- Categoria
- Exemplar
- Emprestimo

---

# Entidades

## Administrador

Representa a pessoa responsável pela administração do sistema.

### Atributos

- id
- nome
- email
- senha
- status

O administrador possui autenticação.

---

## Usuario

Representa uma pessoa cadastrada na biblioteca que pode realizar empréstimos.

### Atributos

- id
- nome
- cpf
- status

### Status

- ATIVO
- BLOQUEADO

O Usuario não possui credenciais de acesso na V1.

---

## Livro

Representa a obra cadastrada no catálogo.

### Atributos

- id
- titulo
- isbn
- numeroPaginas
- autor
- categoria
- status

### Status

- ATIVO
- INATIVO

Um Livro não representa uma cópia física individual.

---

## Autor

Representa o autor de um ou mais livros.

### Atributos

- id
- nome

---

## Categoria

Representa uma categoria utilizada para organizar livros.

### Atributos

- id
- nome

---

## Exemplar

Representa uma cópia física específica de um livro.

### Atributos

- id
- livro
- status

### Status

- DISPONIVEL
- EMPRESTADO
- MANUTENCAO

Um exemplar pertence a exatamente um Livro.

---

## Emprestimo

Representa o empréstimo de um exemplar para um usuário.

### Atributos

- id
- usuario
- exemplar
- dataInicio
- dataPrevistaDevolucao
- dataDevolucao
- status

### Status

- ATIVO
- ATRASADO
- DEVOLVIDO

---

# Relacionamentos

## Autor → Livro

Um autor pode possuir vários livros.

Um livro possui um autor na V1.

```text
Autor 1 ───────── N Livro
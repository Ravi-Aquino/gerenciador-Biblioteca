
---

# `docs/banco-dados.md`

```md
# Banco de Dados — Sistema Biblioteca

## SGBD

PostgreSQL.

---

# Tabelas

A V1 utilizará as seguintes tabelas principais:

- administradores
- usuarios
- autores
- categorias
- livros
- exemplares
- emprestimos

---

# administradores

Representa os administradores do sistema.

### Campos

- id
- nome
- email
- senha
- status

### Restrições

- id como PRIMARY KEY
- email como UNIQUE
- campos obrigatórios como NOT NULL

---

# usuarios

Representa as pessoas que podem realizar empréstimos.

### Campos

- id
- nome
- cpf
- status

### Restrições

- id como PRIMARY KEY
- cpf como UNIQUE
- nome como NOT NULL
- cpf como NOT NULL
- status como NOT NULL

---

# autores

### Campos

- id
- nome

### Restrições

- id como PRIMARY KEY
- nome como NOT NULL

---

# categorias

### Campos

- id
- nome

### Restrições

- id como PRIMARY KEY
- nome como NOT NULL

---

# livros

### Campos

- id
- titulo
- isbn
- numero_paginas
- autor_id
- categoria_id
- status

### Relacionamentos

- autor_id → autores.id
- categoria_id → categorias.id

### Restrições

- id como PRIMARY KEY
- isbn como UNIQUE
- titulo como NOT NULL
- autor_id como FOREIGN KEY
- categoria_id como FOREIGN KEY

---

# exemplares

### Campos

- id
- livro_id
- status

### Relacionamentos

- livro_id → livros.id

### Restrições

- id como PRIMARY KEY
- livro_id como FOREIGN KEY
- status como NOT NULL

---

# emprestimos

### Campos

- id
- usuario_id
- exemplar_id
- data_inicio
- data_prevista_devolucao
- data_devolucao
- status

### Relacionamentos

- usuario_id → usuarios.id
- exemplar_id → exemplares.id

### Restrições

- id como PRIMARY KEY
- usuario_id como FOREIGN KEY
- exemplar_id como FOREIGN KEY
- data_inicio como NOT NULL
- data_prevista_devolucao como NOT NULL
- status como NOT NULL

---

# Relacionamentos

```text
autores
   │
   │ 1:N
   ▼
livros
   │
   │ 1:N
   ▼
exemplares
   │
   │ 1:N
   ▼
emprestimos
   ▲
   │ N:1
   │
usuarios
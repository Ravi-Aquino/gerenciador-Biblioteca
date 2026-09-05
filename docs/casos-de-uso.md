# Casos de Uso — Sistema Biblioteca

## Atores

### Administrador

É o único ator da V1.

O administrador possui acesso às funcionalidades administrativas do sistema.

---

# UC01 — Fazer login

**Ator:** Administrador

### Descrição

Permite que o administrador se autentique no sistema.

### Fluxo principal

1. O administrador informa suas credenciais.
2. O sistema valida as credenciais.
3. O sistema autentica o administrador.
4. O sistema permite acesso às funcionalidades administrativas.

### Fluxos alternativos

- Credenciais inválidas.
- Administrador inexistente.
- Administrador bloqueado.

---

# UC02 — Cadastrar usuário

**Ator:** Administrador

### Descrição

Permite cadastrar uma pessoa que poderá realizar empréstimos.

### Fluxo principal

1. Administrador acessa o cadastro de usuários.
2. Informa os dados do usuário.
3. Sistema valida os dados.
4. Sistema verifica se o CPF já existe.
5. Sistema cadastra o usuário.
6. Usuário é criado com status ATIVO.

---

# UC03 — Bloquear usuário

**Ator:** Administrador

### Descrição

Impede que um usuário realize novos empréstimos.

### Fluxo principal

1. Administrador seleciona um usuário.
2. Solicita o bloqueio.
3. Sistema altera o status para BLOQUEADO.
4. Usuário não poderá realizar novos empréstimos.

---

# UC04 — Cadastrar livro

**Ator:** Administrador

### Fluxo principal

1. Administrador informa os dados do livro.
2. Sistema valida os dados.
3. Sistema verifica o ISBN.
4. Sistema associa autor e categoria.
5. Sistema cadastra o livro.

---

# UC05 — Cadastrar exemplar

**Ator:** Administrador

### Fluxo principal

1. Administrador seleciona um livro.
2. Solicita o cadastro de um exemplar.
3. Sistema cria o exemplar.
4. Exemplar recebe status DISPONIVEL.

---

# UC06 — Registrar empréstimo

**Ator:** Administrador

### Pré-condições

- Administrador autenticado.
- Usuário existente.
- Usuário ativo.
- Usuário possui menos de 3 empréstimos ativos.
- Exemplar existente.
- Exemplar disponível.

### Fluxo principal

1. Administrador seleciona o usuário.
2. Administrador seleciona o exemplar.
3. Sistema valida as regras de negócio.
4. Sistema cria o empréstimo.
5. Sistema define a data atual como início.
6. Sistema calcula a data prevista de devolução.
7. Sistema altera o exemplar para EMPRESTADO.
8. Sistema confirma o empréstimo.

---

# UC07 — Registrar devolução

**Ator:** Administrador

### Pré-condições

- Administrador autenticado.
- Empréstimo existente.
- Empréstimo ainda não devolvido.

### Fluxo principal

1. Administrador seleciona o empréstimo.
2. Solicita a devolução.
3. Sistema registra a data atual.
4. Sistema altera o empréstimo para DEVOLVIDO.
5. Sistema altera o exemplar para DISPONIVEL.
6. Sistema confirma a devolução.

---

# UC08 — Consultar empréstimos

**Ator:** Administrador

### Descrição

Permite visualizar empréstimos ativos, atrasados e devolvidos.

---

# UC09 — Consultar disponibilidade

**Ator:** Administrador

### Descrição

Permite visualizar quais exemplares estão disponíveis para empréstimo.

---

# UC10 — Gerenciar livros

**Ator:** Administrador

O administrador pode:

- Criar livro.
- Consultar livro.
- Atualizar livro.
- Inativar livro.
- Consultar exemplares.

---

# UC11 — Gerenciar usuários

**Ator:** Administrador

O administrador pode:

- Criar usuário.
- Consultar usuário.
- Atualizar usuário.
- Bloquear usuário.
- Desbloquear usuário.
- Consultar histórico de empréstimos.

---

# UC12 — Gerenciar exemplares

**Ator:** Administrador

O administrador pode:

- Criar exemplar.
- Consultar exemplar.
- Alterar status quando permitido.
- Consultar disponibilidade.
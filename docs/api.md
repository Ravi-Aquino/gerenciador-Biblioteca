
---

# `docs/api.md`

```md
# API — Sistema Biblioteca

## Objetivo

A API será responsável pela comunicação entre o frontend e o backend.

O frontend enviará requisições HTTP e o backend processará as regras de negócio e retornará respostas em JSON.

---

# Arquitetura

```text
Frontend
   │
   │ HTTP / JSON
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
PostgreSQL
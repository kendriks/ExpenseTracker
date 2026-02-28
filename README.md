# 📌 ExpenseTracker

O **ExpenseTracker** é um sistema de gerenciamento de despesas desenvolvido em **Java**, baseado no projeto proposto pelo [Roadmap.sh](https://roadmap.sh/projects/expense-tracker)

## 📖 Sobre o Projeto

O ExpenseTracker é uma aplicação executada via **linha de comando (CLI)** que permitirá ao usuário gerenciar suas despesas de forma simples e eficiente.

A aplicação possibilita:

* Cadastro de despesas com descrição e valor
* Atualização de despesas
* Remoção de despesas
* Listagem completa das despesas
* Resumo total das despesas
* Resumo mensal das despesas

Os dados são persistidos em arquivo local (JSON), garantindo armazenamento simples e funcional.

---

## 🏗️ Arquitetura

O projeto segue o padrão de **arquitetura em camadas**, organizado da seguinte forma:

📦 expensetracker  
&nbsp;┣ 📂 controller  
&nbsp;┣ 📂 service  
&nbsp;┣ 📂 repository  
&nbsp;┣ 📂 model  
&nbsp;┗ Main.java

* **Controller** → Responsável por interpretar os argumentos da linha de comando.
* **Service** → Contém as regras de negócio e validações.
* **Repository** → Responsável pela persistência dos dados em arquivo.
* **Model** → Representação da entidade `Expense`.

---

## ⚙️ Funcionalidades

&nbsp;✅ RF01 - Adicionar despesa  
&nbsp;&nbsp;Permite cadastrar uma despesa com descrição e valor.

&nbsp;✅ RF02 - Atualizar despesa  
&nbsp;&nbsp;Permite modificar descrição e/ou valor através do ID.

&nbsp;✅ RF03 - Remover despesa  
&nbsp;&nbsp;Remove uma despesa através do ID informado.

&nbsp;✅ RF04 - Listar despesas  
&nbsp;&nbsp;Exibe todas as despesas cadastradas.

&nbsp;✅ RF05 - Resumo total  
&nbsp;&nbsp;Exibe o valor total gasto.

&nbsp;✅ RF06 - Resumo mensal  
&nbsp;&nbsp;Exibe o total de despesas de um mês específico do ano corrente.

---

## 📜 Regras de Negócio

* A descrição é obrigatória.
* O valor deve ser maior que zero.
* O ID é único e gerado automaticamente.
* Não é permitido atualizar ou excluir despesas inexistentes.
* O mês informado no resumo deve estar entre 1 e 12.

---

## 🚀 Funcionalidades Extras (Opcional)

✨ Categorias de despesas e filtro por categoria  
✨ Definição de orçamento mensal com alerta ao ultrapassar limite  
✨ Exportação das despesas para arquivo CSV

---

## 💻 Exemplos de Uso

```bash
$ expense-tracker add --description "Lunch" --amount 20
# Expense added successfully (ID: 1)

$ expense-tracker add --description "Dinner" --amount 10
# Expense added successfully (ID: 2)

$ expense-tracker list
# ID  Date       Description  Amount
# 1   2024-08-06  Lunch        $20
# 2   2024-08-06  Dinner       $10

$ expense-tracker summary
# Total expenses: $30

$ expense-tracker delete --id 2
# Expense deleted successfully

$ expense-tracker summary
# Total expenses: $20

$ expense-tracker summary --month 8
# Total expenses for August: $20
```

---

## 🛠️ Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![CLI](https://img.shields.io/badge/Command_Line_Interface-000000?style=for-the-badge)
![Arquitetura em Camadas](https://img.shields.io/badge/Arquitetura_em_Camadas-4CAF50?style=for-the-badge)
![File Persistence](https://img.shields.io/badge/Persistência_em_Arquivo-FF6F00?style=for-the-badge)

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/ExpenseTracker.git
```

2. Acesse o diretório do projeto.

3. Compile o projeto:

```bash
javac Main.java
```

4. Execute via terminal:

```bash
java Main add --description "Lunch" --amount 20
```

---

<div align="center">

Projeto em desenvolvimento  
Fevereiro de 2026

</div>

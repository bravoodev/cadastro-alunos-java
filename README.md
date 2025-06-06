# 📘 Cadastro de Alunos – Projeto em Java

Este é um projeto simples desenvolvido em Java, com o objetivo de registrar alunos e suas informações básicas. A aplicação funciona via terminal, com um menu interativo que permite:

- 👤 Cadastrar múltiplos alunos
- 📋 Listar todos os alunos registrados
- 💾 Salvar os alunos em um arquivo `.txt`
- 📂 Visualizar depois os dados salvos

---

## ⚙️ Funcionalidades

### 1. Cadastrar Aluno
O usuário insere:
- Nome
- Idade
- Nota

Esses dados são armazenados em uma lista de objetos `Aluno`.

### 2. Listar Alunos
Mostra todos os alunos cadastrados na sessão atual do programa.

### 3. Salvar em Arquivo
Grava os dados da lista de alunos no arquivo `alunos.txt`, que é criado na raiz do projeto.

Exemplo do conteúdo gerado:
Nome: João, Idade: 14, Nota: 8.5
Nome: Maria, Idade: 13, Nota: 9.0

### 4. Ler Alunos do Arquivo *(opcional)*
Se implementado, lê e exibe os alunos salvos em `alunos.txt`.

---

## 🧪 Como Usar

1. Clone o repositório:
git clone https://github.com/seu-usuario/seu-repo.git

2. Abra o projeto no NetBeans ou Visual Studio Code.

3. Rode a classe `CadastroAlunos`.

4. Use o menu interativo no terminal:

=== MENU ===
1 - Cadastrar Aluno
2 - Listar Alunos
3 - Salvar alunos no arquivo
0 - Sair

5. Para ver os alunos salvos:
   - Abra o arquivo `alunos.txt` na raiz do projeto.
   - Ou adicione a função `lerAlunosDoArquivo()` para visualizar no terminal.

---


## 🖼️ Exemplo de execução no terminal

(Salve a imagem em `img/terminal_exemplo.png` e adicione esta linha no README.md se for usá-lo em formato visual)

![Execução no terminal](./imgs/terminal_exemplo.png)

---

## 🛠️ Tecnologias

- Java 8+
- NetBeans ou Visual Studio Code
- Git e GitHub para versionamento

---

## 🧠 Aprendizados

- Criação e uso de listas com `ArrayList`
- Uso de `Scanner` para entrada via terminal
- Escrita em arquivos com `FileWriter` e boas práticas com `try-with-resources`
- Estrutura de menu com `do-while` e `switch`

---

## 📝 Autor

Desenvolvido por **Lucas Braff Soares** como parte do aprendizado em Java.  
Contribuições são bem-vindas!
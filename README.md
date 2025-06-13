Gerenciador de Temas com Builder e Factory Method

Este projeto demonstra a implementação de um sistema de gerenciamento de temas utilizando dois padrões de projeto:

    Builder para criação de objetos Tema complexos

    Factory Method para criação de botões específicos para cada sistema operacional

📦 Estrutura do Projeto

src/
├── builder/
│   └── Tema.java          # Implementação do padrão Builder para criar temas
├── factory/
│   ├── Botao.java         # Interface para botões
│   ├── BotaoMacOS.java    # Implementação de botão para MacOS
│   ├── BotaoWindows.java  # Implementação de botão para Windows
│   ├── GerenciadorDeTemas.java # Classe abstrata gerenciadora
│   ├── GerenciadorMacOS.java   # Gerenciador para MacOS (Singleton)
│   └── GerenciadorWindows.java # Gerenciador para Windows (Singleton)
└── Main.java             # Demonstração do uso do sistema


Funcionalidades

    Criação de Temas:

        Use o TemaBuilder para criar temas personalizados com:

            Cor de fundo

            Cor da fonte

            Nome da fonte

            Tamanho da fonte

    Gerenciamento de Temas:

        Sistema Singleton para gerenciadores de temas

        Suporte para Windows e MacOS

    Criação de Botões:

        Botões são criados automaticamente com base no tema ativo

        Estilo específico para cada sistema operacional


📝 Padrões de Projeto Utilizados

    Builder:

        Permite a construção de objetos Tema complexos passo a passo

        Oferece uma API fluente para configuração

    Factory Method:

        Define uma interface para criação de botões

        Delegua a criação para subclasses (GerenciadorWindows/GerenciadorMacOS)

    Singleton:

        Garante uma única instância dos gerenciadores de temas

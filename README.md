# publicaProwayVitorPeres

Desenvolvedor: Vitor Cesar Peres
contato: vitorperes1104@gmail.com

Bibliotecas usadas: JDK, Java Swing através do Windows Builder e JUnit para testes unitários.

Sobre:
Aplicação Java desenvolvida para o processo seletivo do programa de capacitação da empresa Pública Tecnologia em parceria com a Proway.

Como rodar a aplicação:

1 - O projeto deve ser inicializado com as bibliotecas JDK, Java Swing e JUnit instalados na plataforma (foi usado Eclipse para desenvolver).
    Abaixo estão os links para download das bibliotecas.
    
    - Windows Builder(Java Swing): https://www.eclipse.org/windowbuilder/download.php
    - JDK: https://www.oracle.com/technetwork/pt/java/javase/downloads/index.html
    - JUnit 4: https://github.com/junit-team/junit4/wiki/Download-and-Install
    
2 - Os campos de texto correspondem à alteração que será feita na tabela, seja atualizando uma linha já existente, adicionando uma nova linha,
    ou excluindo uma linha já existente. 
    A funcionalidade dos botões corresponde ao título de cada um. 
    O resultado dos cálculos é feito somente com base nos últimos
    dados atualizados da tabela. 
    A pontuação a ser inserida não deve passar de 1000, a aplicação irá avisar caso passe desse valor. 
    Não há um limite para a quantidade de linhas inseridas.

3 - As classes de testes unitários estão no pacote Testes, para rodar é necessário construir um "build path" com os arquivos .jar(junit e hamcrest-core),
    que foram baixados do link disponibilizado acima.

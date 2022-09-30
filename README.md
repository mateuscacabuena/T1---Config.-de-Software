# T1---Config.-de-Software ![GitHub Workflow Status](https://img.shields.io/github/workflow/status/matcacabuena/T1---Config.-de-Software/maven)
### Carolina Ferreira
### Mateus Cacabuena
### Paola Anacleto Lopes

- #### Atividade 1 (Mateus, Carol e Paola) - Realizada
       #### - Repositório criado, licença e git.ignore adicionados também, é possível checar na aba de arquivos do repositório abrindo as pastas ".gitignore" e "LICENSE".
- #### Atividade 2 (Mateus) - Realizada
      #### - Arquivos adicionados no repositório, capturas de tela que mostram o êxito na aba "Issues".
      #### - src, target e pom.xml são os arquivos adicionados, ademais, a pasta "T1ConfigSoft" que extrai os 3 arquivos juntos.
- #### Atividade 3 (Mateus) - Realizada
       #### - Como o trabalho foi feito em dias diferentes, para fazer a atividade 2 usamos o windows de um computador do laboratório e, para fazer a atividade 6, foi usado o linux de outro computador do laboratório em outro dia.
       #### - Na aba "Issues", as capturas de tela da ativ 2 e 6 mostram que são terminais de comando diferentes.
      Passo a Passo para criar o clone do projeto:
      #### 1 - Baixe a pasta "src" e "target"
      #### 2 - Baixe o "pom.xml"
      #### 3 - Coloque os 3 itens baixados em uma única pasta de sua preferência
      #### 4 - No linux, abra o terminal de comando e acesse o local de sua pasta criada com o comando cd <nome da pasta>
      #### 5 - Já dentro da pasta, escreva <mvn compile package>, depois, <mvn install>
      #### 6 - Após os downloads, execute o programa escrevendo <java -jar target/gs-maven-0.1.0.jar>
- #### Atividade 4 (Paola) - Realizada
       #### - Na aba "Action"s do repositório, foi criado um novo workflow "Java With Maven" configurado para executar o roteiro Maven a cada push dos participantes. No entanto, foi preciso mudar a localização do arquivo "pom.xml", que se encontrava dentro da pasta "T1ConfigSoft", para que fosse possível encontrar o maven e a compilação conseguisse ser realizada com sucesso. Dessa forma, a cada e toda mudança feita dentro do repositório, todos os membros são avisados e, com a adição do badge, é possivel assegurar que o a compilação funciona e o repositório está agindo corretamente. 
- #### Atividade 5 (Paola) - Realizada
       #### - Também dentro da aba "Actions", foi ativado o "code scanning" sugerido (CodeQL), para a verificar o código e a segurança do repositório. Foi possível verificar a funcionalidade dessa ferramenta a partir da atividade anterior e os testes feitos por ela.  
- #### Atividade 6 (Carol) - Realizada
       #### - Foram realizadas 3 versões do código. A primeira foi aprovada pelo BeeCrowd, contudo dificultava a implementação do teste de unidade pois não havia passagem de parâmetros. 
       #### - Foi realizada uma segunda versão do código, que também foi aprovada pelo BeeCrowd, mas que ainda tornava difícil a implementação do teste pois havia um valor de retorno mas não parâmetros de entrada. 
       #### - Então foi formulada a versão final do código, cujo print está na aba "Issues", que foi aceita pelo BeeCrowd e utilizada para a realização da atividade 7.
- #### Atividade 7 (Carol) - Realizada
       #### - Na classe de teste foram criados 2 casos de teste: caso o número de cartas do Jogador 1 fosse maior que as do 2, e caso as do 2 fossem maior que as do 1.
       #### - Ambos os casos passaram no teste. O print que mostra a execução com sucesso do teste está na aba "Issues". 

- #### Fontes: 
             - https://www.treinaweb.com.br/blog/introducao-ao-maven-aprenda-como-criar-e-gerenciar-projetos-java
             - https://spring.io/guides/gs/maven/
             - https://maven.apache.org/guides/getting-started/windows-prerequisites.html
             - https://dicasdejava.com.br/como-instalar-o-maven-no-windows/
             - https://github.blog/2022-02-02-build-ci-cd-pipeline-github-actions-four-steps/
             - https://docs.github.com/en/actions/monitoring-and-troubleshooting-workflows/adding-a-workflow-status-badge
             - https://docs.github.com/pt/code-security/code-scanning/automatically-scanning-your-code-for-vulnerabilities-and-errors/about-code-scanning
              

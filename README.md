# EditoraAuth
Trabalho 02 - Segurança
  
  
  Trabalho referente a matéria de Desenvolvimento Web

Alunos:
  Vinícius Reinecke Mulinari Cardoso - 18012226
  
  
  Luiz Felipe Conrado                - 18010826
  
  
  Thiago Okuma
  

Dentro da aba application.properties, temos as linhas necessárias de código que irão conectar nosso banco de dados com os demais arquivos. Sendo o banco de dados PgAdmin4, realiza-se a criação de um database de nome editora visto na linha 6 desta aba (application.properties).


Passando a frente, tem-se as configurações gerais de cliente de aplicativo, onde foi colocado os códigos e links gerados dentro do amazon web services(AWS), o qual utiliza o cognito para autenticação.


Dentro dos templates, criaram-se 4 páginas, sendo elas: criar, editar, index e listar. Cada página realiza uma ação que irá interferir diretamente dentro do banco de dados, sendo essas formas como visualização, cadastro, exclusão, atualização.


Dentro do path java\dw\secauth, tem-se 3 abas sendo elas CognitoOidcLogoutSuccessHandler.java, SecauthApplication.java, SecurityConfiguration.java, sendo essas páginas responsáveis pela verificação dos dados inseridos nos campos pelo usuário, como por exemplo: ID, URL's e também responsável pelo redirecionamento das URI's.


As ações de cadastro, atualizações, exclusões, são adquiridas pelo código fonte que foi fornecido.


Utilizou-se dentro desta aplicação o springboot, o maven, e o código em java junto com o banco de dados PgAdmin4 foi possível realizar o Trabalho.

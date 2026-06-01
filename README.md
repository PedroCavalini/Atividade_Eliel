<<<<<<< HEAD
Salomão Antonio Braga RA: 24047645-2
Natália Possani de Lima  RA: 24190450-2 
Rayan de Andrade e Andrade RA: 24211898-2

1. É um framework oficial voltado para promover autenticação e autorização em aplicações java
2. O método serve para desativar a proteção contra ataques do tipo CSRF, ou seja, elesbarram o envio automático dos cookies
3. É uma configuração do spring security que diz ao servidor para nunca criar ou usar sessões web HTTP para autenticar os usuários
4. A função do permitAll() é liberar o acesso público a rotas ou endpoints específicos da sua API, ou seja, qualquer pessoa ou sistema pode acessar essas URLs sem precisar enviar nenhum tipo de autenticação
5. Os requestMatcher servem para selecionar e filtrar quais rotas e métodos HTTP receber
ao uma regra específica da segurança
6. Sua função é criar uma regra de segurança global e obrigatória para toas as rotas de sua aplicação que voce não configurou explicitamente nos commits ou linhas anteriores
7. É uma aplicação web que funciona com base em um princípio simples: o servidor não guarda nenhuma memória sobre as requisições anteriores do cliente
8. A expressão lambda configura o gerenciamento de sessões do spring security para o modo stateless (não criar sessões HTTP)


=======
PARTE 1

1. O que é Spring Security?
-  Spring Security é um framework do ecossistema Spring responsável por proteger aplicações Java. Ele oferece recursos como autenticação, autorização, controle de acesso e proteção contra ataques comuns, além de permitir integração com diferentes estratégias de segurança.

2. Para que serve o método csrf().disable()?
-  O método csrf().disable() desativa a proteção contra ataques do tipo CSRF (Cross-Site Request Forgery). Essa configuração é comum em APIs REST stateless.

3. O que significa SessionCreationPolicy.STATELESS?
-  Essa política define que a aplicação não deve criar nem manter sessões HTTP.

4. Qual a função do permitAll()?
-  O método permitAll() permite acesso irrestrito às rotas configuradas, ou seja, qualquer usuário pode acessá-las, mesmo sem autenticação.

5. O que faz o requestMatchers()?
-  O requestMatchers() é utilizado para definir quais endpoints ou padrões de URL terão regras específicas de segurança, como liberação de acesso ou exigência de autenticação.

6. Qual a função do anyRequest().authenticated()?
-  Essa configuração indica que todas as requisições que não foram explicitamente liberadas exigirão autenticação para serem acessadas.

7. O que é uma API Stateless?
-  Uma API Stateless é aquela que não armazena estado do usuário no servidor.

8. O que faz a configuração abaixo?
session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)

-  Essa configuração define que o Spring Security não deve criar nem manter sessões HTTP. Cada requisição é tratada de forma independente, o que caracteriza uma API stateless e é ideal para APIs REST.
>>>>>>> e388074b2f8dbd2b16f6d81c7759dd2ea4d3d142


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


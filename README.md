PARTE 1
O que é Spring Security?
-  Spring Security é um framework do ecossistema Spring responsável por proteger aplicações Java. Ele oferece recursos como autenticação, autorização, controle de acesso e proteção contra ataques comuns, além de permitir integração com diferentes estratégias de segurança.

Para que serve o método csrf().disable()?
-  O método csrf().disable() desativa a proteção contra ataques do tipo CSRF (Cross-Site Request Forgery). Essa configuração é comum em APIs REST stateless.

O que significa SessionCreationPolicy.STATELESS?
-  Essa política define que a aplicação não deve criar nem manter sessões HTTP.

Qual a função do permitAll()?
-  O método permitAll() permite acesso irrestrito às rotas configuradas, ou seja, qualquer usuário pode acessá-las, mesmo sem autenticação.

O que faz o requestMatchers()?
-  O requestMatchers() é utilizado para definir quais endpoints ou padrões de URL terão regras específicas de segurança, como liberação de acesso ou exigência de autenticação.

Qual a função do anyRequest().authenticated()?
-  Essa configuração indica que todas as requisições que não foram explicitamente liberadas exigirão autenticação para serem acessadas.

O que é uma API Stateless?
-  Uma API Stateless é aquela que não armazena estado do usuário no servidor.


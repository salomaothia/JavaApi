# JavaAPI

### Rotas da API
#### Porta local: 8080

Método | Endpoint | Retorno
----- | -------------- | ---
GET   | /              | Listar todos os pets
GET   | /pet/{nome}    | Listar pets pelo nome
GET   | /pet/byid/{id} | Listar pet por id
POST  | /              | Cadastrar pet
PATCH | /{id}          | Atualizar pet pelo id
DELETE| /{id}          | Deletar pet pelo id

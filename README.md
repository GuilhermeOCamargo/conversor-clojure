# conversor

Aplicação de console que retorna a cotação atual de uma moeda.
Para a rodar a aplicação, é necessário adquirir uma chave para a api 
através do [link](https://free.currencyconverterapi.com/free-api-key) e colocar na variável de ambiente: FREE_CURRENCY_API_KEY

## Usage

É necessário rodar o comando lein run passando como parametro as moedas que deseja consultar.

    lein run --de=USD --para=BRL

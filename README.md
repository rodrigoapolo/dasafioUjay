# Fundo de Investimento - Análise de Rentabilidades

Este repositório contém um programa em Java para analisar as rentabilidades mensais de um fundo de investimento com base no arquivo `rentabilidades.txt`. O objetivo é listar, em ordem decrescente, as rentabilidades de todos os meses do ano de 2023 e salvar o resultado no arquivo `rentabilidades-ordenado.txt`.

## Arquivo de Rentabilidades

O arquivo `rentabilidades.txt` possui as rentabilidades diárias do fundo de investimento. A estrutura do arquivo é a seguinte:

```
Data;Rentabilidade
dd/MM/yyyy;rentabilidade
...
```

A primeira linha é o cabeçalho, e as linhas seguintes indicam a data e a rentabilidade diária no formato mencionado.

## Executando o Programa

Certifique-se de ter o ambiente Java configurado em sua máquina. Para executar o programa, siga os passos:

Clone este repositório:

   ```bash
   git clone https://github.com/rodrigoapolo/dasafioUjay.git
   ```


O programa lerá o arquivo `rentabilidades.txt`, calculará as rentabilidades mensais para o ano de 2023, exibirá o resultado em ordem decrescente e salvará as informações no arquivo `rentabilidades-ordenado.txt`.

## Resultado

Após a execução, o programa gerará um arquivo chamado `rentabilidades-ordenado.txt` com os resultados ordenados, similar ao exemplo fornecido:

```
Data;Rentabilidade
12/01/2023;4.971
27/06/2023;4.722
10/02/2023;3.772
07/03/2023;3.757
30/01/2023;3.637
20/01/2023;3.627
03/07/2023;3.533
```

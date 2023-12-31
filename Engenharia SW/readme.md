# 11/08/2023
## O que é Engenharia de Software?
> We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers
need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and
efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex
decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. ("Engenharia de Software no Google")
## Comentário
Me arrisco a dizer que a engenharia de software é o coração de um projeto de software. Isto, pois os engenheiros que são responsáveis por tomar decisões de grande impacto no sistema, além de se preocupar com a qualidade e eficiência do projeto.


# 14/08/2023
## Engenharia de Software x Programação?

> Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering:
after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate
between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new
dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming. ("Engenharia de Software no Google")

## 1)Comentário
Gosto muito da máxima: "Engenharia de software não é programação", pois eu mesmo já confundi várias vezes as diferenças entre. Da mesma forma como um quadrado é apenas uma face de um cubo, engenharia de software abrange a programação.

## 2)Exemplos de Trade-offs:
1. No meu trabalho, o Excel é muito utilizado por ser prático. Porém, pecamos muito no quesito "segurança". Isso, pois as várias planilhas ficam acessiveis na rede da empresa.
2. Na API do 1° Semestre, desenvolvemos uma aplicação em Python por seu alto nível enquanto linguagem. Porém, numa perspectiva escalavel, a aplicação certamente ficará muito lenta.
3. A ferramenta 'SIGA', nos finais de semestres, demonstra o que NÃO é escalabilidade. Porém, seu desenvolvimento em GeneXus é relativamente simples.

## 3)Distinção entre softwares baseadas nos requisitos não funcionais
Acredito que o Facebook se destaca dos demais pela sua alta escalabilidade e, até mesmo, usabilidade.

# 18/08/2023
## 10 Usability Heuristics for User Interface Design
<a href="https://www.nngroup.com/articles/ten-usability-heuristics/" target="_blanck"><b>Link para o artigo</b></a> 

## Perguntas
1. Sobre qual requisito não funcional este texto fala?

O texto fala sobre a usabilidade.

2. Qual a importância?

A usabilidade é essencial, uma vez que ela implica diretamente na experiência do usuario.

3. Exemplos
- **Status do sistema:** <br>
Acerto: Whatsapp <br>
![image](https://github.com/JoaoMatheusLamao/bertoti/assets/77554165/a47f85b9-14f7-4e46-8835-c3c6d21125f7)

Erro: Entrada do Windows<br>
- **Conexão sistema x mundo real:** <br>
Acerto: Metáforas do Windows (Janela, Arquivos)<br>
Erro: SQL Exception para o usuário<br>
- **Controle e liberdade do usuário:** <br>
Acerto: O sistema de exclusão de repositórios do Github, na minha opinião, é um ótimo exemplo de prevenção contra ações indesejadas do usuário. Isso, pois para excluir um repositório, é necessário navegar até uma aba específica e, além disso, digitar o nome do repositório (como se fosse uma senha) para, de fato, excluir o repositório. <br>
![image](https://github.com/JoaoMatheusLamao/bertoti/assets/77554165/78a1c4fe-3045-48df-b4f0-3eb471724600)

- **Padrões:** <br>
Acerto: Cores padrões para informar erros ou sucessos<br>
- **Reconhecimento em vez lembrança:** <br>
![image](https://github.com/JoaoMatheusLamao/bertoti/assets/77554165/e2d381ad-18ba-40d9-9560-3330c33e8679)

Acerto: Uso de calendário (como metáfora) para induzir o usuário a lembrar.<br>
- **Eficiência de uso:** <br>
Acerto: Disponibilização de atalhos;<br>

# 21/08/2023

1. Fazer um diagrama de casos de uso com requerimentos funcionais. <br>
   Diagrama de Casos de Uso - Secretatia institucional (V1); <br>
   
![DCU drawio (2)](https://github.com/JoaoMatheusLamao/bertoti/assets/77554165/71b18f96-0c52-4e21-bdd9-4eae5935da19)

# 28/08/2023
1. Fazer um Diagrama de Classes referente ao Diagrama de Casos de Uso.
   Diagrama de Classes - Secretaria Institucional (V1); <br>
   
![Secretaria institucionai (DC) drawio](https://github.com/JoaoMatheusLamao/bertoti/assets/77554165/2c03a243-70d3-4f47-b9a8-6b60fe4f5736)

# 31/08/2023
Diagrama de Classes - Secretaria Institucional (V2);<br>

![Secretaria institucionai (DC) drawio (1)](https://github.com/JoaoMatheusLamao/bertoti/assets/77554165/dfa1ae93-1dae-4c99-8b4b-70c6cc3d6c75)

# 11/09/2023
Diagrama de Classes - Secretaria Institucional (V3); <br>

> Inserção dos métodos Getters e Setters.

![Secretaria institucionai (DC) drawio (2)](https://github.com/JoaoMatheusLamao/bertoti/assets/77554165/1de824fb-7109-4c22-9cd3-47f266199683)

# 22/09/2023 - Testes Unitários

```java
funcao(int a) {
   b = a + 1; //deveria ser a - 1
   c = b / 30000;
   return c; 
}
```
> Considerando apenas números inteiros de -32576 à 32568, ***apenas os números 29999, 30000, -29999 e -30000 mostram o problema da aplicação.***

### Classes de equivalência:
> Na classe Secretaria, temos um método para verificar se uma matrícula está ativa ou não (validarMatriculaAtiva(int ra)).

> Uma possível classe de equivalência para tal método, seria testar com uma entrada (ra) inexistente, resultando em false. 

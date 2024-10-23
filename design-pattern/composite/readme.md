# Padrão Composite

## Intenção

> O padrão Composite permite que objetos individuais e grupos de objetos sejam tratados de forma uniforme. Ele é útil quando você quer representar hierarquias de objetos de forma que clientes possam interagir com eles de maneira consistente, independentemente de estarem lidando com um único objeto ou um grupo deles.

## Exemplo

> Imagine que você está desenvolvendo um sistema para organizar arquivos e pastas em um sistema operacional. Tanto arquivos quanto pastas precisam ser tratados da mesma forma, mas pastas podem conter outros arquivos e pastas.

	- Arquivo: Um item individual que não contém outros elementos.
	- Pasta: Pode conter múltiplos arquivos ou outras pastas.

> O padrão Composite é ideal para resolver esse problema. Você pode criar uma interface FileSystemComponent que define um método showDetails, e implementar diferentes classes como File e Folder, que podem ser compostas e tratadas de forma uniforme.

## UML

![](./observerUML.png)

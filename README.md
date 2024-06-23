# Projeto iPhone Com UML

Este projeto é uma simulação de funcionalidades básicas de um iPhone, incluindo tocar música, fazer chamadas e navegar na internet. Foi desenvolvido utilizando Java e JavaFX.

## Estrutura do Projeto

- `src/`
  - `com/dlucioYauh/iphone/`
    - `Main.java`: Classe principal para iniciar a aplicação.
  - `com/dlucioYauh/iphone/controller/`
    - `iPhoneController.java`: Controlador responsável pelos eventos da interface.
- `resources/`
  - `com/dlucioYauh/iphone/`
    - `iphone.fxml`: Arquivo FXML que define a interface gráfica.

## Diagrama UML

![Diagrama UML](https://github.com/dlucioyauh/iphone-com-uml/blob/main/diagrama.png)

## Pré-requisitos

- Java Development Kit (JDK) 11 ou superior.
- JavaFX SDK 11 ou superior.
- IDE (IntelliJ IDEA, Eclipse, etc.)

## Configuração do Ambiente

1. **Baixar o JDK 11+**

   Baixe e instale o JDK 11 ou superior a partir do site oficial da Oracle ou OpenJDK.

2. **Baixar o JavaFX SDK**

   Baixe o JavaFX SDK 11 ou superior a partir do site oficial [Gluon](https://gluonhq.com/products/javafx/).

3. **Configurar o JavaFX no seu IDE**

   - **IntelliJ IDEA**:
     - Vá para `File` > `Project Structure`.
     - Em `Modules`, adicione o caminho para o JavaFX SDK nas `Libraries`.
     - No `Run/Debug Configurations`, adicione os seguintes parâmetros VM:
       ```
       --module-path /path/to/javafx-sdk-11/lib --add-modules javafx.controls,javafx.fxml
       ```

## Execução do Projeto

1. **Clone o repositório:**

   ```sh
   git clone https://github.com/dlucioyauh/iphone-com-uml.git
   cd iphone-com-uml
   ```

2. **Importe o projeto na sua IDE.**

3. **Execute a aplicação**

      Execute a classe Main para iniciar a aplicação.
      
## Autor

  Douglas Lucio

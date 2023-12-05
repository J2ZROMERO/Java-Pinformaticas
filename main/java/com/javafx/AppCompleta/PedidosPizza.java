package com.javafx.AppCompleta;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.skin.LabeledSkinBase;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PedidosPizza extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        miStage = primaryStage;

        // -------- Creacion del panel superior ----------------
        Text txtCabecera = new Text("Pide tu pizza ahora");
        txtCabecera.setFont(new Font(20));

        HBox panelSuperior = new HBox(txtCabecera);
        panelSuperior.setPadding(new Insets(20,10,20,10));

        // --------- Creacion del panel datos del cliente -------------

        Label lblNombre = new Label("Nombre: ");
        lblNombre.setPrefWidth(100);
        cuadroNombre = new TextField();
        cuadroNombre.setPrefColumnCount(20);
        cuadroNombre.setPromptText("Introduce tu nombre aqui");

        HBox panelNombre = new HBox(lblNombre,cuadroNombre);

        // --------- Creacion del panel datos del telefono -------------

        Label lblTelefono = new Label("N° de telefono:");
        lblTelefono.setPrefWidth(100);
        cuadroTelefono = new TextField();
        cuadroTelefono.setPrefColumnCount(20);
        cuadroTelefono.setPromptText("Introduce tu telefono aqui");

        HBox panelTelefono = new HBox(lblTelefono,cuadroTelefono);

        // --------- Creacion del panel datos del direccion -------------

        Label lblDireccion = new Label("Direccion: ");
        lblDireccion.setPrefWidth(100);
        cuadroDireccion = new TextField();
        cuadroDireccion.setPrefColumnCount(20);
        cuadroDireccion.setPromptText("Introduce tu direccion aqui");

        HBox panelDireccion = new HBox(lblDireccion,cuadroDireccion);

        // ----------- creacion del panel Vbox
        VBox panelCliente = new VBox(10, panelNombre,panelTelefono,panelDireccion);


        // -------------Creacion de los pedidos
        //Creacion del panel del tamaño de las pizzas

        Label lblTamano = new Label("Tamaño");
        radioPeq = new RadioButton("Pequeño");
        radioMed = new RadioButton("Medianas");
        radioGran = new RadioButton("Grande");

        //seleccionado por defecto en caso de ser  no seleccionar ninguno
        radioMed.setSelected(true);

        ToggleGroup grupoTamano = new ToggleGroup();
        radioPeq.setToggleGroup(grupoTamano);
        radioMed.setToggleGroup(grupoTamano);
        radioGran.setToggleGroup(grupoTamano);

        VBox panelTamano = new VBox(lblTamano,radioPeq,radioMed,radioGran);
        panelTamano.setSpacing(10);

        // creacion del panel de la masa
        Label lblMasa = new Label("Masa");
        radioFina = new RadioButton("Fina");
        radioNormal = new RadioButton("Normal");

        //seleccionado por defecto en caso de ser  no seleccionar ninguno
        radioFina.setSelected(true);

        ToggleGroup grupoMasa = new ToggleGroup();
        radioFina.setToggleGroup(grupoMasa);
        radioNormal.setToggleGroup(grupoMasa);

        VBox panelMasa = new VBox(lblMasa,radioFina,radioNormal);
        panelMasa.setSpacing(10);


        // creacion del pane ingredientes
        Label lblIngredientes = new Label("Ingredientes");
        chkPeperoni = new CheckBox("Pepperoni");
        chkQueso = new CheckBox("Queso");
        chkAceitunas = new CheckBox("Aceitunas");
        chkPimiento = new CheckBox("Pimientp");
        chkAnchoas = new CheckBox("Anchoas");
        chkChampi = new CheckBox("Champiñon");

        FlowPane panelIngredientes = new FlowPane(Orientation.VERTICAL, chkAceitunas,chkPeperoni,chkAnchoas,chkChampi,chkQueso,chkPimiento);
        panelIngredientes.setPadding(new Insets(10,0,10,0));
        panelIngredientes.setHgap(20);
        panelIngredientes.setVgap(10);
        panelIngredientes.setPrefWrapLength(100);

        VBox ingredientesVertical = new VBox(lblIngredientes,panelIngredientes);

        // ------------- Crear el pane de tamñano, masa e ingredientes

        HBox panelOrden = new HBox(50, panelTamano, panelMasa, panelIngredientes);

        // ------------- Crear panel central
        VBox panelCentral = new VBox(20, panelCliente, panelOrden);

        panelCentral.setPadding(new Insets(0,10,0,10));

        // -------------- Creacion del panel inferior -------------

        Button btnOk = new Button("Ok");
        btnOk.setPrefWidth(80);
        btnOk.setOnAction(e -> btnOk_click());

        Button btnCancel = new Button("Cancel");
        btnCancel.setPrefWidth(80);
        btnCancel.setOnAction(e -> btnCancel_click());

        Region espacio = new Region();
        HBox panelInferior = new HBox(10, espacio, btnOk,btnCancel);
        panelInferior.setHgrow(espacio, Priority.ALWAYS);
        panelInferior.setPadding(new Insets(20,10,20,10));

        // ------------ Finalizar la Scene

        BorderPane panelPrincipal = new BorderPane();
        panelPrincipal.setTop(panelSuperior);
        panelPrincipal.setCenter(panelCentral);
        panelPrincipal.setBottom(panelInferior);

        // ------------ creacion del scene

        Scene mixScene = new Scene(panelPrincipal);
        primaryStage.setScene(mixScene);
        primaryStage.setTitle("Pedidos Pizza");
        primaryStage.show();



        

    }

    private void btnCancel_click() {
        miStage.close();
    }

    private void btnOk_click() {
        // Creacion del string con la info del cliente.
        String msg = "CLiente:\n\n"; // \n = salto de linea
         msg+="\t" + cuadroNombre.getText() + "\n"; // \t = realiza una tabulacion
         msg+="\t" + cuadroDireccion.getText() + "\n";
         msg+="\t" + cuadroTelefono.getText() + "\n";

         msg+= "Has pedido: Tamaño: ";

         // añadir el tamaño
         if(radioPeq.isSelected()) msg+= "Pequeño";
         if (radioMed.isSelected()) msg+= "Mediano";
         if(radioGran.isSelected()) msg+= "Pequeño";

         // Añadir la masa

        if(radioFina.isSelected()) msg+= "Y masa fina con: " ;
        if(radioNormal.isSelected()) msg+= "Y masa con:  ";

        // Añadir los ingredientes
        String ingredientes = "";

        ingredientes = contruyeIngredientes(chkPeperoni,ingredientes);
        ingredientes = contruyeIngredientes(chkChampi,ingredientes);
        ingredientes = contruyeIngredientes(chkAnchoas,ingredientes);
        ingredientes = contruyeIngredientes(chkAceitunas,ingredientes);
        ingredientes = contruyeIngredientes(chkQueso,ingredientes);
        ingredientes = contruyeIngredientes(chkPimiento,ingredientes);

        if(ingredientes.equalsIgnoreCase("")) msg+="Sin ingredientes.";
        else msg+="Y con los siguientes ingredientes: \n" + ingredientes;

        com.JavaFx.emergente.VentanaEmergente.mostrar(msg,"Detalles del pedido");
    }

    private String contruyeIngredientes(CheckBox chk, String msg) {
    if(chk.isSelected()){
        if(!msg.equalsIgnoreCase("")) msg+=", ";
        msg+=chk.getText();
    }
        return msg;
    }


    private Stage  miStage;
    private TextField cuadroNombre, cuadroTelefono, cuadroDireccion;
    private RadioButton radioPeq, radioMed, radioGran;
    private RadioButton radioFina, radioNormal;
    private CheckBox chkPeperoni, chkQueso, chkPimiento, chkAceitunas, chkChampi, chkAnchoas;

}

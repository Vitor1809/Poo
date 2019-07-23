package boundary;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Login extends Application {
	private AnchorPane pane;
	private TextField txLogin;
	private PasswordField txSenha;
	private Button btEntrar, btSair;
	private static Stage stage;
	private static Scene scene;
	private Label lbLogin;
	private Label lbSenha;

	@Override
	public void start(Stage stage) throws Exception {
		initComponents();
		initButton();
		scene = new Scene(pane);
		stage.setResizable(false);
		stage.setTitle("Login - Give a Paway");
		stage.setScene(scene);
		initLayout();
		stage.show();
		Login.stage = stage;

	}

	public static Stage getStage() {
		return stage;
	}

	private void initComponents() {
		pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		pane.setStyle("-fx-background-color:linear-gradient(from 0% 0% to 100% 100%, blue 0%, white 100%);");
		txLogin = new TextField();
		txLogin.setPromptText("Digite o login");
		txSenha = new PasswordField();
		txSenha.setPromptText("Digite a senha");
		btEntrar = new Button("Entrar");
		btSair = new Button("Sair");
		lbLogin = new Label("Login :");
		lbSenha = new Label("Senha :");
		pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair, lbLogin, lbSenha);

	}

	private void initLayout() {
		lbLogin.setLayoutX(((pane.getWidth() - lbLogin.getWidth()) / 2) + 200);
		lbLogin.setLayoutY(50);
		txLogin.setLayoutX(((pane.getWidth() - txLogin.getWidth()) / 2) + 150);
		txLogin.setLayoutY(75);
		lbSenha.setLayoutX(((pane.getWidth() - lbSenha.getWidth()) / 2) + 200);
		lbSenha.setLayoutY(125);
		txSenha.setLayoutX(((pane.getWidth() - txSenha.getWidth()) / 2) + 150);
		txSenha.setLayoutY(150);
		btEntrar.setLayoutX(((pane.getWidth() - btEntrar.getWidth()) / 2) + 200);
		btEntrar.setLayoutY(200);
		btSair.setLayoutX(((pane.getWidth() - btSair.getWidth()) / 2) + 205);
		btSair.setLayoutY(230);

	}

	private void initButton() {
		btEntrar.setOnAction((event) -> {
			logar();
		});
		btSair.setOnAction((event) -> {
			fecharAplicacao();
		});
	}

	private void fecharAplicacao() {
		System.exit(0);

	}

	private void logar() {
		if (txLogin.getText().equals("admin") && txSenha.getText().equals("admin")) {
			new CatalogoPet();
			JOptionPane.showMessageDialog(null, "Bem vindo!");
		} else {
			JOptionPane.showMessageDialog(null, "Logine/ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}

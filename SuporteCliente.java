package ClothingStore;

public class SuporteCliente {
    private TextArea textBox;
    private Button botaoPostar;
    private String assunto;
    private String texto;

    private CadastroUsuario cadastroUsuario;

    public SuporteCliente() {
    }

    public SuporteCliente(TextArea textBox, Button botaoPostar, String assunto, String texto, CadastroUsuario cadastroUsuario) {
        this.textBox = textBox;
        this.botaoPostar = botaoPostar;
        this.assunto = assunto;
        this.texto = texto;
        this.cadastroUsuario = cadastroUsuario;
    }

    public void postarMensagem() {
    }

    public TextArea getTextBox() {
        return textBox;
    }

    public void setTextBox(TextArea textBox) {
        this.textBox = textBox;
    }

    public Button getBotaoPostar() {
        return botaoPostar;
    }

    public void setBotaoPostar(Button botaoPostar) {
        this.botaoPostar = botaoPostar;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public CadastroUsuario getCadastroUsuario() {
        return cadastroUsuario;
    }

    public void setCadastroUsuario(CadastroUsuario cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }
}


import java.time.LocalDate;

public class Processo {
    private String nomeAutor;
    private String cpfAutor;
    private String tituloTrabalho;
    private LocalDate dataProducao;
    private LocalDate dataAnalise;
    private String matriculaAnalista;
    private String status;
    private String protocolo;

    public Processo(String nomeAutor, String cpfAutor, String tituloTrabalho, LocalDate dataProducao, String protocolo) {
        this.nomeAutor = nomeAutor;
        this.cpfAutor = cpfAutor;
        this.tituloTrabalho = tituloTrabalho;
        this.dataProducao = dataProducao;
        this.protocolo = protocolo;
        this.dataAnalise = null;
        this.matriculaAnalista = null;
        this.status = null;
    }

    // Getters e Setters
    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getCpfAutor() {
        return cpfAutor;
    }

    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

    public String getTituloTrabalho() {
        return tituloTrabalho;
    }

    public void setTituloTrabalho(String tituloTrabalho) {
        this.tituloTrabalho = tituloTrabalho;
    }

    public LocalDate getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = dataProducao;
    }

    public LocalDate getDataAnalise() {
        return dataAnalise;
    }

    public void setDataAnalise(LocalDate dataAnalise) {
        this.dataAnalise = dataAnalise;
    }

    public String getMatriculaAnalista() {
        return matriculaAnalista;
    }

    public void setMatriculaAnalista(String matriculaAnalista) {
        this.matriculaAnalista = matriculaAnalista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public void registrarAnalise(LocalDate dataAnalise, String matriculaAnalista, String status) {
        this.dataAnalise = dataAnalise;
        this.matriculaAnalista = matriculaAnalista;
        this.status = status;
    }
}

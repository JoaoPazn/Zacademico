import java.util.Date;

public class GrupoPesquisas {
    private String identificadorCNPQ;
    private String nome;
    private String descricao;
    private String tema;
    private String area;
    private Professor professorLider;
    private String dataCriacao;
    private String dataExpiracao;

    public GrupoPesquisas(String identificadorCNPQ, String nome, String descricao, String tema, String area, Professor professorLider) {
        this.identificadorCNPQ = identificadorCNPQ;
        this.nome = nome;
        this.descricao = descricao;
        this.tema = tema;
        this.area = area;
        this.professorLider = professorLider;
    }

    public String getIdentificadorCNPQ() {
        return identificadorCNPQ;
    }

    public void setIdentificadorCNPQ(String identificadorCNPQ) {
        this.identificadorCNPQ = identificadorCNPQ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Professor getProfessorLider() {
        return professorLider;
    }

    public void setProfessorLider(Professor professorLider) {
        this.professorLider = professorLider;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(String dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
}
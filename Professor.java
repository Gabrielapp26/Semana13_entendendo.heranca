public class Professor extends Pessoa{
    private String departamento;
    private String nomeCurso;
    private String salario;

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return this.departamento;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public String getNomeCurso(){
        return this.nomeCurso;
    }

    public void setSalario(String salario){
        this.salario = salario;
    }
    public String getSalario(){
        return this.salario;
    }
}
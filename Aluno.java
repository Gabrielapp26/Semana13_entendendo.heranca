public class Aluno extends Pessoa {
 
    private double nota1;
    private double nota2;
    private String cursos;
 
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
 
    public double getNota1(){
        return this.nota1;
    }
 
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
 
    public double getNota2(){
        return this.nota2;
    }
 
    public void setCursos(String cursos){
        this.cursos = cursos;
    }
 
    public String getCursos(){
        return this.cursos;
    }
 
    public double calcularMedia(){
 
        return(this.nota1 + this.nota2) / 2.0;
        
    }
     public  boolean  verificarAprovado () {
        if(calcularMedia() <  6.0 ){
            System.out.println("Aluno(a) reprovado(a)");
            return  false ;
        } else {
            System.out.println("Aluno(a) aprovado(a)");
            return  true ;
        }
    }
}
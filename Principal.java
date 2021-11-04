import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        // jeito com scanner
        System.out.print("Digite seu nome: ");
        aluno.setNome(sc.nextLine());
        System.out.print("Digite seu cpf: ");
        aluno.setCpf(sc.nextLine());
        System.out.print("Digite seu endereço: ");
        aluno.setEndereco(sc.nextLine());
        System.out.print("Digite seu curso: ");
        aluno.setCursos(sc.nextLine());
        System.out.print("Digite a nota da p1: ");
        aluno.setNota1(sc.nextDouble());
        System.out.print("Digite a nota da p2: ");
        aluno.setNota2(sc.nextDouble());
        aluno.verificarAprovado();
        
        System.out.println("O aluno(a) "+aluno.getNome()+" tem as notas da p1 e p2, respectivamente, "+aluno.getNota1()+" e "+ aluno.getNota2());
        System.out.println("Sua media é "+aluno.calcularMedia()+" sendo assim, ele está:" );
        if(aluno.verificarAprovado() == true){
            System.out.println(" Aprovado");
        }else{
            System.out.println(" reprovado");
        }


    }
}
// jeito sem scanner
/*public class Principal{
    public static void main(String args[]){
        Aluno a = new Aluno();
        Professor p = new Professor();
        a.setNome("Gabriela Pellin Perosa");
        a.setEndereco("Rua José Bonifácio");
        a.setTelefone("(14)982327572");
        a.setCpf("493.305.468-11");

        a.setCursos("Big Data no Agronegócio");
        a.setNota1(9.0);
        a.setNota2(8.5);

        System.out.println("O(A) aluno(a): ");
        System.out.println(a.getNome());
        System.out.println("Cujo cpf é "+a.getCpf());
        System.out.println("Que reside no endereço: "+a.getEndereco());
        System.out.println("Com o telefone: "+a.getTelefone());
        System.out.println("Que cursa: "+a.getCursos());

        if(a.verificarAprovado()){
            System.out.println("Aluno(a) Aprovado(a)");
        }else{
            System.out.println("Aluno(a) Reprovado(a)");
        }

    }
}*/

package ordenarprodutos;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Vitor
 */
public class OrdenarProdutos {
    static class Produto{
        int[] id;
        double[] preco;
        String[] desc;

        public Produto(int[] id, double[] preco, String[] desc) {
            this.id = id;
            this.preco = preco;
            this.desc = desc;
        }

        
        

       
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("Digite a qtd de produtos: ");
        int n = in.nextInt();
        int[] id=new int[n];
        double[] preco=new double[n];
        String[] desc= new String[n];
        
       
       
        for(int i = 0; i<n;i++){
            
            System.out.println("Id do produto: "+(i+1));
            id[i] = i+1;
            System.out.println("Digite o preco do produto: ");
            preco[i] = in.nextDouble();
            in.nextLine();
            System.out.println("Digite a descricao do produto: ");
            desc[i] = in.nextLine();
            
        }
        Produto p = new Produto(id,preco,desc);
        System.out.println("Digite:\n1-Ordenar por preço\n2-Ordenar por nome");
       int escolha = in.nextInt();
       if(escolha == 1){
        ordenarPreco(p.preco,p.id,p.desc,n);
           for(int i=0;i<n;i++){
             System.out.println("id: "+p.id[i]+" preco: "+p.preco[i]+" desc: "+p.desc[i]);
           }
       }else{
          ordenarNome(p.desc,p.id,p.preco,n); 
          for(int i=0;i<n;i++){
             System.out.println("id: "+p.id[i]+" preco: "+p.preco[i]+" desc: "+p.desc[i]);
           }
       }
    }
    public static void ordenarPreco(double[] p,int[] id,String[] desc, int n){
        for(int i =1;i<n;i++){
            for(int j=n-1;j>=i;j--){
               if(p[j-1]>p[j]){
                   double aux=p[j-1];
                   int idT=id[j-1];
                   id[j-1]=id[j];
                   id[j]=idT;
                   String descT=desc[j-1];
                   desc[j-1]=desc[j];
                   desc[j]=descT;
                   p[j-1]=p[j];
                  p[j]=aux;
                  
                  
               }
            }
        }
         
    }
    public static void ordenarNome(String[] desc, int[] id, double[] p, int n){
        for(int i =1;i<n;i++){
            for(int j=n-1;j>=i;j--){
                if(desc[j-1].compareTo(desc[j])>0){
                   double aux=p[j-1];
                   int idT=id[j-1];
                   id[j-1]=id[j];
                   id[j]=idT;
                   String descT=desc[j-1];
                   desc[j-1]=desc[j];
                   desc[j]=descT;
                   p[j-1]=p[j];
                   p[j]=aux;
                }
            }
        }
    }
   
}
